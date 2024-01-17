package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//p285참조
//이 클래스는 Oracle의 scott계정의 dept테이블의 모든 내용을 조회하는 클래스이다.
public class DeptList {
	// 필드 [access-modifier] [modifier] 타입 필드명 [= 초기값];
	private Connection con;
	private String url="jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin:@
	private String user="scott";
	private String password="tiger";

	// 환경설정에서 보통 설정함. 
	// 생성자 [access-modifier] 클래스명([매개변수]) {리턴내용};
	public DeptList() {
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
	//메서드 [access-modifier] [modifier] 리턴타입 메서드명 ([매개변수]) {내용};
	//sql문 실행 - select deptno,danme,loc from dept;
	private void sqlRun() {
		//3.객체준비
		//세미콜론은 빼고 가지고올것.
		//String query="SELECT dname,loc,deptno FROM DEPT"; /* SQL 문*/ 
		//String query="SELECT loc,dname,deptno FROM DEPT"; /* SQL 문*/ 
		String query="SELECT deptno,dname,loc FROM DEPT ORDER BY DEPTNO ASC"; /* SQL 문*/ 
		//String query="SELECT * FROM DEPT"; /* SQL 문*/ 
		Statement stmt = null;
		ResultSet rs = null;
		
		try {/* 데이터베이스에 질의 결과를 가져오는 과정*/
			//4.SQL문실행
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			//select는 executeQuery 
			//insert, delete, update는 executeUpdate를 쓴다.
			while(rs.next()) {
				//rs.get자바데이터타입(int 컬럼 index)
				//컬럼index는 1번째컬럼이면 1, 2번째 컬럼이면 2, n번째 컬럼이면 n
				//getInt() = > 자바에서 int 타입으로 데이터를 취급, 저장
				//getString=>자바에서 String으로 데이터를 취급, 저장
				// 매개변수로 컬럼의 이름을 쓸수도있다.
				//alias를 쓸경우 alias로 매개변수명을 적어야한다.
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.println(rs.getString("loc"));
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {//catch 절에 들어가지 않던, 들어가던 무조건 실행하는 코드
			//5.자원반납
			try {
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(con!=null) {
					con.close();
				}
				System.out.println("5.자원 반납 완료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String args[]) {
		DeptList obj = new DeptList();
		obj.sqlRun();
	}

}

