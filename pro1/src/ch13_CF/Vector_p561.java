package ch13_CF;

import java.util.List;
import java.util.Vector;

public class Vector_p561 {

	public static void main(String[] args) {
		//인터페이스명 참조변수 = new 구현 클래스명();
		//Vector(p561)
		/*동기화를 지원하는 멀티스레드 환경에 적합
		 * 하나의 스레드가 실행을 완료해야만다른 스레드가 메소드를 실행할수 있다.
		 * capacity() : 현재의 수용력.
		 * Returns the current capacity of this vector.
		 * 용량을 초과하여 새로운 요소가 추가되면, 기존의 수용력x2
		 * new Vector(); // 기본수용력이 capacity 10
		 * new Vector(int initialCapacity)
		 * 예)new Vector(10);//기본수용력이 capacity n
		 * 
		 * 
		 * new Vector(int initialCapacity, int capacityIncrement);
		 * 예)new Vector(10,5); // 기본수용력이 capacity 10,
		 * 용량을 초과하여 새로운 요소가 추가되면, 5만큼 증가
		 * 처음에 11개의 요소가 추가되면? 용량은 자동으로 15(10+5)으로 증가.
		 * 
		*/
		//클래스명 참조변수 = new 클래스명();
//		Vector vector = new Vector();  //기본수용력 capacity 10
		Vector vector = new Vector(5);  //기본수용력 capacity 5
		
		
		
		System.out.println(vector);// []
		System.out.println(vector.toString()); //[]
		System.out.println("최초size()="+vector.size()); // 0
		System.out.println("최초capacity()="+vector.capacity()); // 5
		//capacity : (최대)수용력[량]  초기 설정에서 2배씩 증가.
		
		//추가
		vector.add("박스");
		vector.add("스파게티");
		vector.add("티눈");
		vector.add("눈사람");
		vector.add("람보");
		
		System.out.println("1.추가후size()="+vector.size()); //5
		System.out.println("1.추가후capacity()="+vector.capacity()); //5
		vector.add("보릿고개");
		vector.add("개나리");
		vector.add("리코더");
		vector.add("더덕");
		vector.add("덕목");
		
		System.out.println("2.추가후size()="+vector.size()); // 10
		System.out.println("2.추가후capacity()="+vector.capacity());//10
		vector.add("목사");

		System.out.println("3.추가후size()="+vector.size()); // 11
		System.out.println("3.추가후capacity()="+vector.capacity()); // 20		

		vector.add("보릿고개");
		vector.add("개나리");
		vector.add("리코더");
		vector.add("더덕");
		vector.add("덕목");
		vector.add("보릿고개");
		vector.add("개나리");
		vector.add("리코더");
		vector.add("더덕");
		vector.add("덕목");
		
		System.out.println("3.추가후size()="+vector.size()); // 21
		System.out.println("3.추가후capacity()="+vector.capacity()); // 40
		
		//(입력한) 순서가 유지(되어 출력)
		for(int i =0; i<vector.size();i++) {
			System.out.println(i+"번째 value= " + vector.get(i));
		}
		
		
		
	}
	
}