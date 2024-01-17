package ch06;


// access-modifier 
// 외부에 노출되지 않도록 무결성을 유지. 캡슐화.
// 접근제한 	강	  	 	접근제한 		    약
// 		private < default <	protected < public
//		동일클래스내 < 동일패키지까지 가능 < 다른패키지 자식클래스도 가능 < 다른패키지 가능
public class AccessModifier_p293 {
	private int pri = 10;
	int pack = 20;  // default 생략되어있음. 
	protected int pro = 30;
	public int pub = 40;
	
	
	void test () {
		pri = 100; // O
		pack = 200;  // O
		pro = 300;  // O
		pub = 300;  // O
		
	}
	
}
