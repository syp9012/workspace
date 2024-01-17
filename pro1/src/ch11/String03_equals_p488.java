package ch11;

// == "홍길동" == "홍길동"
//String 의 equals() :문자열 비교(p488) heap영역에 저장된 문자열을 비교
//Object의 equals() 메서드는 주소를 비교
//String의 equals() 메서드는 힙영역에 저장된 외형을 비교
// java script 에서 upper case = 대문자 , lower case = 소문자
//equalsIgnoreCase= 대소문자 무시
// immutable String 인스턴스의 내용은바꿀수 없다. 

public class String03_equals_p488 {
	public static void main(String[] args) {
		String s1 = "황";
		String s2 = s1 + "금";
		// 데이터가 많이 변경이 되는 경우 메모리를 많이 차지한다.	
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1 == s2); // false 
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		// equals() 값비교
		// ==       주소비교
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1 == str2); // true 
		
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		System.out.println("-------------------------");
		System.out.println(str3.equals(str4)); // true
		System.out.println(str3 == str4); // false
		
		
		System.out.println("");
		// 리터럴을 넣음.
		System.out.println("홍길동".equals("홍길동")); // true
		System.out.println("hong".equals("HONG")); // false
		System.out.println("HONG".equals("HONG")); // true
		
		System.out.println("hong".equalsIgnoreCase("HONG")); // true
		System.out.println("HONG".equalsIgnoreCase("HONG")); // true
		
		
		
	}
}
