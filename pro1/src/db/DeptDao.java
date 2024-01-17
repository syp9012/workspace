package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//1. 드라이버로딩->2.DB연결->3.객체준비->4.쿼리실행->5.객체반납
//DAO : Data Access Object. DBMS와 연동하여 상호작용하는 클래스
// : 
public class DeptDao {
	
	
	
	//부서 수조회
		public void getDeptCnt() {
			Connection con = JdbcUtil.getConnection();
			String query="SELECT count(*) "
						+"FROM DEPT"; /* SQL 문*/ 
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			try {
				//4.SQL문실행
				stmt = con.prepareStatement(query);
				rs = stmt.executeQuery();
				if(rs.next()) {
					int dno = rs.getInt("count(*)");
					System.out.println("부서수는 " +dno);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				//5.자원반납
				JdbcUtil.close(rs);
				JdbcUtil.close(stmt);
				JdbcUtil.close(con);
			}
		}
	
	//부서목록조회
	//returns - List<DepartmentDTO>
	public List<DepartmentDTO> selectDeptList() {
		Connection con = JdbcUtil.getConnection();
		String query="SELECT deptno,dname,loc "
				+"FROM DEPT "
				+"ORDER BY DEPTNO ASC"; /* SQL 문*/ 
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<DepartmentDTO> deptList = new ArrayList<DepartmentDTO>();
		
		try {
			//4.SQL문실행
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			while(rs.next()) {//부서table의 record 수 만큼 반복
				int dno = rs.getInt("deptno");
				String deptname = rs.getString("dname");
				String loc = rs.getString("loc");
//				System.out.println(dno+"\t"+deptname+"\t"+loc);
				
				deptList.add(new DepartmentDTO(dno, deptname, loc));
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			//5.자원반납
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return deptList;
	}
	
	//부서상세조회
	//Parameters : int dno : 조회 부서번호
	//returns - DepartmentDTO객체(조회한 부서정보)
	public DepartmentDTO selectDeptDetail(int dno) {
//		System.out.println("selectDeptDetail()부서상세조회:"+ dno);
		
		//2. connection
		Connection con = JdbcUtil.getConnection();
		
		//3.객체준비
		String sql="SELECT deptno,dname,loc "
					+ "FROM DEPT "
					+ "where deptno = ?"; /* SQL 문*/ 
		PreparedStatement stmt = null;
		ResultSet rs = null;
		DepartmentDTO deptDto = null;
		
		//executeQuery는 ResultSet 값을 리턴하므로 변수에 받아줘야한다.
		try {/* 데이터베이스에 질의 결과를 가져오는 과정*/
			//4.SQL문실행
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, dno);
			rs = stmt.executeQuery();
			if(rs.next()) {
				int no = rs.getInt("deptno"); //deptno 컬럼의 값을 가져와 변수no에 저장.
				String name = rs.getString("dname");//dname 컬럼의 값을 가져와 변수name에 저장.
				String location = rs.getString("loc");//loc 컬럼의 값을 가져와 변수 location에 저장.
//				System.out.println(no+"\t"+name+"\t"+location);
				deptDto = new DepartmentDTO();
				
				deptDto.setDeptNo(dno);
				deptDto.setdName(name);
				deptDto.setLoc(location);
				//System.out.println(deptDto);
				
			} else {
				System.out.println(dno + "번 부서가 존재하지 않습니다.");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			//5.자원반납
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return deptDto;
	}
	//부서정보입력
	//Parameters - String dname : 부서명, String loc : 지역명
	//Returns : int - insert쿼리실행결과의 row 수
	public int insertDept(String dname, String loc) {
		Connection con = JdbcUtil.getConnection();
		String query = "insert into dept "
					+"values (dno_seq.nextval,?,?)";
		PreparedStatement stmt = null;
		int resultCnt= 0;
		try {
			stmt = con.prepareStatement(query);
			stmt.setString(1,dname);
			stmt.setString(2,loc);
			resultCnt= stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return resultCnt;
	}
	
	//부서정보수정
	//Parameters - String location : 지역명, String dname : 부서명, int deptno : 부서번호
	//Returns - DepartmentDTO : 수정후 객체 
	public DepartmentDTO updateDept(String location, String dname, int deptno) {
		Connection con = JdbcUtil.getConnection();
		String query = "update dept "
					+"set loc = ?, dname = ? "
					+"where deptno = ?";
		PreparedStatement stmt = null;
		int resultCnt= 0;
		DepartmentDTO deptDto = null;
		
		try {
			stmt = con.prepareStatement(query);
			stmt.setString(1, location);
			stmt.setString(2, dname);
			stmt.setInt(3, deptno);
			resultCnt = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		//update한 특정부서정보 가져오기
		return selectDeptDetail(deptno);
		
		
		
	}
	
	
	//부서정보삭제
	//Parameters - int dno : 삭제를 원하는 부서번호
	public boolean deleteDept(int deptno) {
		Connection con = JdbcUtil.getConnection();
		String query = "delete from dept "
						+"where deptno = ?";
		PreparedStatement stmt = null;
		int resultCnt = 0;
		boolean result = false;
		try {
			stmt = con.prepareStatement(query);
			stmt.setInt(1, deptno);
			resultCnt = stmt.executeUpdate();
			if(resultCnt>0) {
				System.out.println("delete 실행완료");
				result = true;
			} else {
				System.out.println("삭제 안됨");
				result = false;
			}
			System.out.println("삭제된 레코드수:"+resultCnt);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return result;
	}
}