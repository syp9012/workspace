package ch13_CF;

import java.util.HashSet;

public class Set_p565 {
	
	public static void main(String[] args) {
		//인터페이스명 참조변수 = new 구현 클래스명();
		//Set set = new HashSet();
		//클래스명 참조변수 = new 클래스명();
		HashSet set = new HashSet();  //
		
		System.out.println(set);// []
		System.out.println(set.toString()); //[]
		System.out.println("최초size()="+set.size()); // 0
		
		//추가
		set.add("박스");
		set.add("스파게티");
		set.add("티눈");
		set.add("눈사람");
		set.add("람보");
		
		System.out.println("1.추가후size()="+set.size()); //5 
		set.add("보릿고개");
		set.add("개나리");
		set.add("리코더");
		set.add("더덕");
		set.add("덕목");
		
		System.out.println("2.추가후size()="+set.size()); // 10
		set.add("목사");	
		set.add("목사"); //중복 허용 x, 덮어씌워짐.
		System.out.println("3.추가후size()="+set.size()); // 11

		//(입력한) 순서가 유지(되어 출력)
		
		//List계열 : (입력한) 순서가 유지(되어 출력)
		//Set 계열 : (입력한) 순서가 유지x
		//for(타입 변수:배열명 또는 컬렉션명){}
		for(Object v : set) {
			System.out.println(v);
		}	
	}
}
