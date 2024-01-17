package chap06_4;

public class MemberService {

	String id;
	String password;
	
	boolean login(String id, String password) {
		if(id.equals("hong") & password.equals("12345")) {
			return true;
		}
		return false;
	}
	
	void logout(String id) {
		if(id == "hong") {
		System.out.println("로그아웃 되었습니다.");
		}
	}
	
}
