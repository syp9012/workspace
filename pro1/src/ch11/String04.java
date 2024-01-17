package ch11;

import java.util.Arrays;

//Stirng 클래스의 여러 method들
//api문서를 참고해서 처리할것.

public class String04 {
	public static void main(String[] args) {
		
		System.out.println("\n-----------------------");
		
		//
		String s= "홍길동:김길동:이순신:유관순";
		String[] sArray = s.split(":");
		
		for(String a : sArray) {
			System.out.print(a);
		}
				
		System.out.println(s.split(":")); // 배열이기때문에 stack영역에 저장된 주소가 나온다.
		
		
		System.out.println("\n-----------------------");
		// valueOf() : 문자열 변환(p498)
		String s1 =String.valueOf(false);
		System.out.println(s1);
		System.out.println(s1.length()); //
		System.out.println(s1.toUpperCase()); //
				
		
		/* 공백 삭제
			문자열의 앞 뒤 공백을 제거.문자열 중간의 공백은 제거 되지 않는다.
		*/
		System.out.println("\n-----------------------");
		System.out.println(" banana".trim()); //banana
		System.out.println("banana ".trim()); //banana
		System.out.println(" banana ".trim()); //banana
		System.out.println(" ban ana ".trim()); //ban ana
		
		String str = "Hello Java";
		int len = str.length();
		System.out.println("\n-----------------------");
		System.out.println(str.toLowerCase());//hello java
		System.out.println(str.toUpperCase());//HELLO JAVA
		
		/* 문자열추출
			substring(시작인덱스,마지막인덱스);
			시작인덱스포함부터 마지막인덱스 전까지 추출
			인덱스 값이 음수or
			 String.length보다 큰경우 or
			 시작인덱스가 마지막인덱스보다 큰 경우 IndexOutOfBoundsException 발생.
		*/
		System.out.println("\n-----------------------");
		System.out.println(str.substring(0,0)); // 
		System.out.println(str.substring(0,1)); // H
		System.out.println(str.substring(1,2)); // e
		System.out.println(str.substring(1,9)); // ello Jav
		System.out.println(str.substring(10,10)); // 공백
		System.out.println(str.substring(len,len)); // 공백

		/* 문자열 추출 substring(시작인덱스) : 시작인덱스포함부터 문자열 추출
			제시한 인덱스값이 문자열의 길이와 동일하면 "" (an empty string)을 리턴
			인덱스 값이 음수이거나 String.length보다 크게 되면 IndexOutOfBoundsException 발생.
		 */
		System.out.println("\n-----------------------");
		System.out.println(str.substring(0)); // Hello Java
		System.out.println(str.substring(1)); // ello Java
		System.out.println(str.substring(9)); // a
		System.out.println(str.substring(10)); // 공백
		System.out.println(str.substring(len)); // 공백
		
		System.out.println("\n-----------------------");
		System.out.println(str.replace("ll", "L")); // HeLo Java
		System.out.println(str.replace("a", "A")); // Hello JAvA
		System.out.println(str.replace("J", "O")); // Hello Oava
		System.out.println(str.replace("Java", "Oracle")); // Hello Oracle
		
		System.out.println("\n-----------------------");
		System.out.println(str.replaceAll("ll", "L")); // HeLo Java
		System.out.println(str.replaceAll("a", "A")); // Hello JAvA
		System.out.println(str.replaceAll("J", "O")); // Hello Oava
		System.out.println(str.replaceAll("Java", "Oracle")); // Hello Oracle
		
		
		
		System.out.println("\n-----------------------");
		System.out.println(str.charAt(0)); //H
		System.out.println(str.charAt(1)); //e
		System.out.println(str.charAt(2)); //l
		System.out.println(str.charAt(3)); //l
		System.out.println(str.charAt(9)); //a
		System.out.println(str.charAt(len-1));//a 
		
		System.out.println("\n-----------------------");
		System.out.println(str.contains("h"));    	//false
		System.out.println(str.contains(" "));		//true
		System.out.println(str.contains("H"));		//true
		System.out.println(str.contains("Hello"));	//true
		
		System.out.println("\n-----------------------");
		//indexOf
		//문자열이 포함되어있는경우 문자열의 인덱스 범위를 리턴한다.
		//포함되어 있지않으면 -1을 리턴한다.
		System.out.println(str.indexOf("h"));	 	//-1
		System.out.println(str.indexOf("Hello")); 	//0
		System.out.println(str.indexOf("H")); 		//0
		System.out.println(str.indexOf(" ")); 		//5
		
		
	}

}
