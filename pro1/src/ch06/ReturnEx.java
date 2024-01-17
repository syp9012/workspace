package ch06;

// return : 메서드종료. 
public class ReturnEx {

	public static void main(String[] args) {
		int gas = 10;
		
		if(gas > 0) {
			System.out.println("gas > 0 조건충족");
			return;
		}else {
			System.out.println("gas는 0보다 작아요");
		}// if
		System.out.println("if밖.main메서드안");
	} // main

}
