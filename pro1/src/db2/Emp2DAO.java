package db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//1.드라이버 설정 > 2.db 연결 >3.객체 생성 >4.쿼리 실행 >5.자원 반납 
//emp2 테이블에 access 하여 db 관련 작업을 하는 클래스이다. 
public class Emp2DAO {
	
		
//조회
	public List<Emp2DTO> selectEmpList() {
		List<Emp2DTO> list = null;
		String sql = "select empno, ename, job, hiredate, sal "
					+"from emp2";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Connection con = JdbcUtil.getConnection();
		try {
			list = new ArrayList<Emp2DTO>();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hireday = rs.getDate("hiredate");
				double salary = rs.getDouble("sal");
				list.add(new Emp2DTO(no,name,job,hireday,salary));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return list;
	}
	
	
//상세조회
	public Emp2DTO selectEmp(int eno) {
		Emp2DTO empDto = null;
		String sql = "select empno, ename, job, hiredate, sal "
					+"from emp2 "
					+"where empno = ?";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Connection con = JdbcUtil.getConnection();
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, eno);
			rs = stmt.executeQuery();
			if(rs.next()) {
				int no = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hireday = rs.getDate("hiredate");
				double salary = rs.getDouble("sal");
				empDto = new Emp2DTO(no,name,job,hireday,salary);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return empDto;
	}

//커넥션얻기 ,//객체준비, //쿼리실행, // 자원반납
//입력 - 사원명, job, hiredate-sysdate, sal - 3000
	// parameter name - 근로자 이름, job - 근로자 직책, hire - 입사일, sal - 봉급
	public List<Emp2DTO> insertEmp(String name, String job, String hire, double sal) {
		Connection con = JdbcUtil.getConnection();
		PreparedStatement stmt = null;
		int resultCnt = 0;
		List<Emp2DTO> empDto = null;
		String query = "insert into emp2(empno, ename,job,hiredate,sal) "
						+"values (emp2no_seq.nextval, ?, ?, to_date(?), ?)";
		try {
			stmt = con.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setString(2,job);
			stmt.setString(3,hire);
			stmt.setDouble(4,sal);
			resultCnt = stmt.executeUpdate();
			if(resultCnt > 0) {
				System.out.println(resultCnt + "번 실행");
			} else {
				System.out.println("실행되지 않았습니다.");
			}
			empDto = selectEmpList();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return empDto;
	}

	
	
// 입력 -Emp2DTO inputEmp :
	public int insertEmp(Emp2DTO inputEmp) {
		Connection con = JdbcUtil.getConnection();
		PreparedStatement stmt = null;
		int resultCnt = 0;
		Emp2DTO empDto = null;
		String query = "insert into emp2(empno, ename,job,hiredate,sal) "
						+"values (emp2no_seq.nextval, ?, ?, ?, ?)";
		try {
			stmt = con.prepareStatement(query);
			stmt.setString(1, inputEmp.getEname());
			stmt.setString(2,inputEmp.getJob());
			
			long t = inputEmp.getHiredate().getTime();
			stmt.setDate(3,new java.sql.Date(t));
			stmt.setDouble(4,inputEmp.getSal());
			
			resultCnt = stmt.executeUpdate();
			if(resultCnt > 0) {
				System.out.println(resultCnt + "번 실행");
			} else {
				System.out.println("실행되지 않았습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return resultCnt;
		
		
	}
	
	

//사원정보수정 ?번 사원의 급여와 job을 ?으로 수정.
	//parameter - salary- 변경하고싶은 급여, job 변경하고싶은 직책, no - 변경대상 사원번호
	public int updateEmp2List(double salary ,String job, int no) {
		Connection con = JdbcUtil.getConnection();
		String query = "update emp2 "
					+"set sal = sal + ?, job = ? "
					+"where empno = ?";
		PreparedStatement stmt = null;
		int resultCnt = 0;
		
		
		try {
			stmt = con.prepareStatement(query);
			stmt.setDouble(1,salary);
			stmt.setString(2, job);
			stmt.setInt(3, no);
			resultCnt = stmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				JdbcUtil.close(stmt);
				JdbcUtil.close(con);
		}
		return resultCnt;
	}
		


//삭제
	public Emp2DTO deleteEmp2(int eno) {
		
		String sql = "delete from emp2 "
					+"where empno = ?";
		PreparedStatement stmt = null;
		int resultCnt = 0;
		Connection con = JdbcUtil.getConnection();
		Emp2DTO dto = null;
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, eno);
			resultCnt = stmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				JdbcUtil.close(stmt);
				JdbcUtil.close(con);
			}
		return selectEmp(eno);
	}
	
	
	
}
