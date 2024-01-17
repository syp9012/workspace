package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//이클래스는 DB 연동 및 관련 기능을 제공하는 클래스이다. 
	public class JdbcUtil {
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static String user = "scott";
	private static String password = "tiger";
	
	//
	// 클래스의 정적(static)멤버인 변수나 메서드가 사용디기전에 초기화작업을 하는것.
	// static block은 클래스가 처음으로 로딩될때 한번만 실행되며, 그 이후에는 다시 실행되지 않는다.
	// 1. 드라이버로딩  => static block 
	static {
		try { /*드라이버를 찾는 과정*/
			Class.forName("oracle.jdbc.driver.OracleDriver"); //클래스 오브젝트 생성 
//			System.out.println("1.드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 2.DB 연결=>connection 제공
	// Connection 참조변수 = JdbcUtil.getConnection();
	public static Connection getConnection() { 
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
//			System.out.println("2.DB 연결 성공");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	// 5.객체 반납(메소드 오버로딩을 통해 다형성 구축)
	// Connection 객체 반납 : JdbcUtil.close(Statement객체주소)
	public static void close(Connection con) {
		try {
			if(con!=null) {
				con.close();
			}
//			System.out.println("5.커넥션 자원 반납 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Statement 객체 반납 : JdbcUtil.close 
	public static void close(Statement stmt) {
		try {
			if(stmt!=null) {
				stmt.close();
			}
//			System.out.println("5.Statement 자원 반납 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// PreparedStatement 객체 반납 : JdbcUtil.close  > 다형성을 이용해서 바로위 Statement 매개변수를 이용한 메소드로 사용할수 있다. 단) instanceof 메소드를 통해 검사를 하는 단계가 들어가면 좋겠다.
	public static void close(PreparedStatement stmt) {
		try {
			if(stmt!=null) {
				stmt.close();
			}
//			System.out.println("5.PreparedStatement 자원 반납 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
			
	//  객체 반납 : JdbcUtil.close
	public static void close(ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
//			System.out.println("5.ResultSet 자원 반납 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	
}
	
	
	/*참고 static block
	 - 클래스가 로딩될 때 실행되는 블록. 
	 - 클래스의 정적(static) 멤버인 변수나 메서드가 사용되기 전에 초기화 작업을 수행하기 위해 사용. 
	 - static block은 
	   클래스가 처음으로 로딩될 때 한 번만 실행되며, 
	   그 이후에는 다시 실행되지 않는다.
	 -실행 순서 :
	  1) 클래스가 로딩된다. 
	  2) 클래스 변수가 있으면 메모리를 생성한다.
	  3) static 블록이 선언된 순서대로 실행된다.

	*참고: 클래스 로딩 절차
	 1) JRE 라이브러리 폴더에서 클래스를 찾는다.
	 2) 없으면, CLASSPATH 환경 변수에 지정된 폴더에서 클래스를 찾는다.
	 3) 찾았으면, 그 클래스 파일이 올바른 바이트코드인지 검증.
	 4) 올바른 바이트코드라면, Method Area 영역으로 파일을 로딩.
	 5) 클래스 블록이 있으면 순서대로 그 블록을 실행.
	 6) 클래스 안에 static block (스태틱 블록)들이 있으면 순서대로 그 블록을 실행.  
	 */

