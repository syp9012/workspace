package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDelete2 {
	private Connection con;
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String password = "tiger";
	
	public DeptDelete2() {
		try { /*드라이버를 찾는 과정*/
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		
		try { /*데이터베이스를 연결하는 과정*/
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결 성공");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteDept(int dno) {
		String sql = "Delete from dept "
					+"where deptno = ?";
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, dno);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!= null) {stmt.close();}
				if(con!= null) {con.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		DeptDelete2 obj = new DeptDelete2();
		obj.deleteDept(57);
	}

}
