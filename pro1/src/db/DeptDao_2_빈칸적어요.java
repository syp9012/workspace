package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDao_2_빈칸적어요 {

		//field - 데이터 [접근제어자] [제어자] 타입 필드명[=초기값];
		//constructor	
		//method
		//부서목록조회
		//return -List<DepartmentDTO>:부서목록
		public List<DepartmentDTO> selectDeptList() {
			System.out.println("selectDeptList()부서목록조회");
			
			//Connection얻기
			Connection con = JdbcUtil.getConnection();

			//객체준비
			String sql = "select deptno,dname,loc "
					+ "from dept "
					+ "order by deptno asc";
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
		
			//List생성하기~~~빈칸
			List<DepartmentDTO> deptList= new ArrayList<DepartmentDTO>();
			
			try {
				//쿼리실행
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();

				while(rs.next()) {//부서table의 record수만큼 반복
					int no = rs.getInt("deptno"); //deptno컬럼의 값을 가져와 변수no에 저장
					String name = rs.getString("dname");//dname컬럼의 값을 변수name에 저장
					String location=rs.getString("loc");//loc컬럼의 값을 변수location에 저장
					
					//위에서 만든 목록에 DepartmentDTO객체 생성하여 추가
					//빈칸~~~~~~~~~~~~~~~~~
					deptList.add(new DepartmentDTO(no,name,location));
				}//반복문
			} catch (SQLException e) {
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
			//System.out.println("selectDeptDetail()부서상세조회:"+dno);
			
			//2.connection
			Connection con = JdbcUtil.getConnection();
			
			//3.객체준비
			String sql = "select deptno,dname,loc "
					   + "from dept "
					   + "where deptno=?";
			PreparedStatement stmt = null;
			ResultSet rs = null;
			//빈칸~~~DepartmentDTO객체선언
			DepartmentDTO deptDto= new DepartmentDTO();
			
			try {
				stmt = con.prepareStatement(sql);
				stmt.setInt(1,dno);
				rs = stmt.executeQuery();//4.쿼리실행
				if(rs.next()) {
					int no = rs.getInt("deptno"); //deptno컬럼의 값을 가져와 변수no에 저장
					String name = rs.getString("dname");//dname컬럼의 값을 변수name에 저장
					String location=rs.getString("loc");//loc컬럼의 값을 변수location에 저장
					
					//빈칸~~~ DeptarmentDTO객체생성
					deptDto
					
				}else{
					System.out.println("조회한 "+dno+"부서가 존재하지 않습니다");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally { //catch절에 들어가지않던,들어가던 무조건 실행하고자 하는 코드
				//5.자원반납
				JdbcUtil.close(rs);
				JdbcUtil.close(stmt);
				JdbcUtil.close(con); 
			}
			return deptDto;
		}
		
	}