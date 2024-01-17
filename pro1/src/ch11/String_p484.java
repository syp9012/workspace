package ch11;

/*
  
*API 도큐먼트
 -자바 표준 모듈에서 제공하는 라이브러리를 쉽게 찾아서 사용할 수 있도록 도와주는 문서
 -JDK 버전별로 사용할 수 있는 API 도큐먼트: 
 -https://docs.oracle.com/en/java/javase/index.html

*java.base
 -모든 모듈이 의존하는 기본 모듈로, 모듈 중 유일하게 requires하지 않아도 사용할 수 있음

*java.lang
 -자바 언어의 기본적인 클래스를 담고 있는 패키지. 이 패키지에 있는 클래스와 인터페이스는 import 없이 사용할 수 있음

*String 클래스(p484)
 -String 클래스는 문자열을 저장하고 조작할 때 사용
 -문자열 리터럴은 자동으로 String 객체로 생성. String 클래스의 다양한 생성자를 이용해서 직접 객체를 생성할 수도 있음
 -한글 1자를 UTF-8로 인코딩하면 3바이트가 되고, EUC-KR로 인코딩하면 2바이트가 됨

*/
public class String_p484 {

	public static void main(String[] args) {
		String str1 = "문자열";
		String str2 = new String("");
		
		byte[] bytes = {72, 101, 108, 108, 111};
		String str3 = new String(bytes);
		System.out.println(str3);
	
		// 변수명이 bytes인 byte[]을 새앙으로
		//1				 인덱스1부터 bytes[1]=> 101
		//3				 3개를 가져와라=>101,108,108
		//new String({101,108,108}) =>문자열로 생성하시오.
		String str4 = new String(bytes,1,3);
		System.out.println(str4); // ell
		
	}
}
