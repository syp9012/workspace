package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDao_2_빈칸많아요 {
	//field - 데이터 [접근제어자] [제어자] 타입 필드명[=초기값];
	//constructor	
	//method
	//부서목록조회
	//return -List<DepartmentDTO>:부서목록
	public  List<DepartmentDTO> selectDeptList() {
		System.out.println("selectDeptList()부서목록조회");
		//객체준비
		String query = "select deptno,dname,loc "
						+"from dept ";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<DepartmentDTO> deptList = new ArrayList<DepartmentDTO>();
		
		
		//Connection얻기
		Connection con = JdbcUtil.getConnection();
		
		//List생성하기~~~빈칸
		try {
			stmt = con.prepareStatement(query);
			rs= stmt.executeQuery();
			//쿼리실행
			while(rs.next()) {
				int no = rs.getInt("deptno");
				String name = rs.getString("dname");
				String location = rs.getString("loc");
				deptList.add(new DepartmentDTO(no,name,location));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//자원반납
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		
		return deptList;

	}
	
	//부서상세조회
	/*Parameters - int dno : 조회 부서번호
	  Returns    - DeptarmentDTO객체(조회한 부서정보) */
	public DepartmentDTO selectDeptDetail(int dno) {
		//connection얻기
		Connection con = JdbcUtil.getConnection();
		//객체준비
		String query = "select deptno, dname, loc"
						+"from dept "
						+"where deptno = ?";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		DepartmentDTO dDto = null;
		
		try {
			stmt = con.prepareStatement(query);
			stmt.setInt(1, dno);
			rs = stmt.executeQuery();
			if(rs.next()) {
				int no = rs.getInt("deptno");
				String name = rs.getString("dname");
				String loc = rs.getString("loc");
				dDto = new DepartmentDTO();
				
			
			
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//자원반납
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(con);
		}
		return dDto;
	}
	
}










