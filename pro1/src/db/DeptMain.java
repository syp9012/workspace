package db;

import java.util.List;

//
//DBMS 연동 어플리케이션 => 인사급여시스템 
//Oracle의 부서테이블에 대한 CRUD
//CRUD :Create, Read, Update, Delete
//DML DATA MANIPULATION LANGUAGE 데이터 조작어

/*
SELECT * | 컬럼명 [ALIAS]

INSERT into 테이블명[컬럼명, 컬럼명n]
values (값, 값n);

DELETE [from] 테이블명
[where 조건];

UPDATE 테이블명
set 

*/
public class DeptMain {

	public static void main(String[] args) {
		
		DeptDao deptDao = new DeptDao();
		
		//부서 수 조회
		//deptDao.getDeptCnt();
		
		//부서목록조회
		List<DepartmentDTO> deptList = deptDao.selectDeptList();
		for(DepartmentDTO dept : deptList) {
			System.out.println(dept);
		}
		
		//부서목록상세조회:10
//		DepartmentDTO deptDto = deptDao.selectDeptDetail(30);
//		System.out.println(deptDto);
		
		//부서정보입력
		//Returns : int - insert쿼리실행결과의 row 수
//		int resultCnt= 0;
//		resultCnt = deptDao.insertDept("IT Support", "백령도");
//		if(resultCnt > 0) {
//			System.out.println("쿼리실행 row갯수:"+resultCnt);
//		}else {
//			System.out.println("insert 안되었습니다.");
//		}
		
		//부서정보수정 & 수정후 해당 부서 정보 조회
		
//		DepartmentDTO deptDto = deptDao.updateDept("텍사스", "유배지", 77);
//		System.out.println(deptDto);
		
		//부서정보삭제
		
//		boolean result = false;
//		result = deptDao.deleteDept(76);
//		if(result==true) {
//			System.out.println("삭제성공");
//		}else{
//			System.out.println("삭제실패");
//		};
//		
//		deptDao.selectDeptList();
		
	}

}
