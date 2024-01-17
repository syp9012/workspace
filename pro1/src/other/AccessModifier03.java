package other;

import ch06.AccessModifier_p293;

//access-modifier 
//외부에 노출되지 않도록 무결성을 유지. 캡슐화.
//접근제한 	강	  	 	접근제한 		    약
//		private < default <	protected < public
//		동일클래스내 < 동일패키지까지 가능 < 다른패키지 자식클래스도 가능 < 다른패키지 가능
public class AccessModifier03 extends AccessModifier_p293{
	
	AccessModifier_p293 obj = new AccessModifier_p293();
	void test() {
		//obj.pri = 100;  // x > private는 동일 클래스에서만 사용 가능. The field AccessModifier_p293.pri is not visible
		//obj.pack = 200; // x > 동일 패키지에서만 사용가능.
		
		AccessModifier03 am03 = new AccessModifier03();
		am03.pro = 300;  // O   // 상속받은 것은 내 객체를 만들어서 들어가거나, [this]를 통해 접근가능 
		obj.pub = 300;  // O
	}
	
	
}
