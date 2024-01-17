package homework;

import java.util.List;

public class NoticeBoardMain {

	public static void main(String[] args) {
		NoticeBoardDAO nbDao = new NoticeBoardDAO();
		
//		List<NoticeBoardDTO> nbList= nbDao.selectNbList();
//		for(NoticeBoardDTO dao : nbList) {
//			System.out.println(dao);
//		}
		
		//
		
//		nbDao.insertNb(4, "테스트용", "내용입니다", "관리자", 0, null);
		
		//nbDao.updateNb(4, "테스트용 수정", "내용수정", "관리자", 0, null);
		
		

		
		nbDao.deleteNb(4);
		
		NoticeBoardDTO dto = nbDao.getNbDt(4);
		if(dto!=null) {
			System.out.println(dto);
		}else {
			System.out.println("조회한 사원은 등록되어 있지 않습니다.");
		}
		
		
		
		
		
	}

}
