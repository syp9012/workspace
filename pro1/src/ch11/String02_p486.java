package ch11;

import java.io.IOException;
import java.util.Scanner;

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
public class String02_p486 {

	public static void main(String[] args) throws IOException {
		//유저가 입력한 값을 문자열로 변환 확인
		//입력한 값을 byte[]로 읽어서 처리할 예정
		byte[] bytes = new byte[100];

		//입력
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		
		//출력
		String str= new String(bytes, 0, readByteNo);
		System.out.println(str);
		//new String(byte배열,배열의 시작인덱스번호,시작인데스번호부터 읽어올 개수)
		//-2를 한 이유?
		//캐리지리턴(CR)과 라인피드(LF) 부분은 문자열로 만들 필요가 없기 때문
		
		/*참고
		라인피드(LF : Line Feed) => 현재 위치에서 바로 아래로 이동
		캐리지리턴(CR: Carriage return) => 커서의 위치를 앞으로 이동

		-줄바꿈의 정의는 운영체제,언어 마다 다르다
		-윈도우:CRLF 조합으로 줄 바꿈을 정의(\r\n)
		-Java: 운영체제의 종류에 맞게 자동으로 줄 바꿈 문자를 변경해준다. 
		       즉, Java에서 줄 바꿈을 인식하는 문자는 
		       "\n"와 "\r\n"으로 두 가지이다.
		*/	
		
		//
		
	}
}
