package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//1. 드라이버 로딩
//2. db연결
//3. 객체준비
//4. 쿼리실행 
//5. 자원반납
//이클래스는 부서정보를 수정하는 클래스이다.
public class DeptUpdate {
	// 필드
	private Connection con;
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe"; // jdbc:oracle:thin:@
	private String user="scott";
	private String password="tiger";
	
	//생성자 
	public DeptUpdate() {
		//1.드라이버 로드
				//2.DB 연결 
				//Connection 초기화
				
//				System.out.println("기본생성자-호출");

				try { /*드라이버를 찾는 과정*/
					Class.forName("oracle.jdbc.driver.OracleDriver");
//					System.out.println("1.드라이버 로드 성공");
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
			
				
				try { /*데이터베이스를 연결하는 과정*/
					con = DriverManager.getConnection(url, user, password);
//					System.out.println("2.DB 연결 성공");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
	
	
	
	//메서드
	
	
	public static void main(String[] args) {
		DeptUpdate obj = new DeptUpdate();
		obj.updateDept("독도",51);
	}
	
	//부서정보 수정
	public void updateDept(String location, int dno) {
		String sql = "update dept "
					+ "set LOC = '"+ location +"' "
					+ "where deptno =" + dno;
		Statement stmt = null;
		
		try {
			stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);
			if(resultCnt>0) {
				System.out.println("update 실행");
			} else {
				System.out.println("SQL statements that return nothing");
			}
			//executeUpdate(DML퀄리문): DML 쿼리실행결과로 얻은 row count를 반환받는다.
			// 실행된 row count 가 없으면 0을 반환
			System.out.println("쿼리 실행 row개수" + resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
				if(con!=null) {
					con.close();
				}
//				System.out.println("5.객체반납");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
