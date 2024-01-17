package db2;

import java.util.Date;
import java.util.List;

//Client							Server
//front(화면,,메뉴) -> 요청 request -> 비즈니스 로직 수행
//   			 <- 응답 response<-
public class Emp2Main {

	public static void main(String[] args) {
		
		Emp2DAO empDao = new Emp2DAO();
		
		// 전체조회
//		List<Emp2DTO> empList = emp.selectEmpList();
//		System.out.println("사원수: " + empList.size());
//		
//		for(Emp2DTO b : empList) {
//			System.out.println(b);
//		}
		
		// 특정사원상세조회
//		Emp2DTO empDto = emp.selectEmp(7902);
//		if(empDto!=null) {
//			System.out.println(empDto);
//		}else {
//			System.out.println("조회한 사원은 등록되어 있지 않습니다.");
//		}
//	
		//사원 입력
//		List<Emp2DTO> empList = emp.insertEmp("거란","백수", "1999-11-22", 90000);
//		for(Emp2DTO b : empList) {
//			System.out.println(b);
//		}
		
		//사원입력
		Emp2DTO eDto = new Emp2DTO();
		eDto.setEname("고영희");
		eDto.setJob("designer");
		eDto.setHiredate(new Date());
		eDto.setSal(6000);
		empDao.insertEmp(eDto);
		
		
		
		//특정사원 업데이트
//		int cnt = emp.updateEmp2List(5000.0, "CODER",7369);
//		if(cnt>0) {
//			System.out.println("update 성공");
//		}else {
//			System.out.println("update 반영x");
//		}
		
//		//특정사원 삭제
//		Emp2DTO empDto = emp.deleteEmp2(8002);
//		if(empDto!=null) {
//			System.out.println(empDto);
//		}else {
//			System.out.println("조회한 사원은 등록되어 있지 않습니다.");
//		}
		
		
		
		
	}

}
