package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptInsert2 {
	//필드
	private Connection con;
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe"; // jdbc:oracle:thin:@
	private String user="scott";
	private String password="tiger";
	
	
	//생성자
	public DeptInsert2() {
		//1.드라이버 로드
		//2.DB 연결 
		//Connection 초기화
		
		System.out.println("기본생성자-호출");

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
	
	
	
	public void insertDept(String deptname, String location) {
		String sql = "insert into dept "
					+"values (DNO_SEQ.NEXTVAL,?,?)";
		PreparedStatement stmt = null;
		int resultCnt = 0;
		try {stmt = con.prepareStatement(sql);
			stmt.setString(1, deptname);
			stmt.setString(2, location);
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
		DeptInsert2 obj= new DeptInsert2();
		obj.insertDept("design","대구");
	}
}


