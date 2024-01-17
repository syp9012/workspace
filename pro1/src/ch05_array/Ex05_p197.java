package ch05_array;

import java.util.Arrays;

//향상된 for문 p197
/* for(타입 변수 : 배열명 또는 컬렉션명){
 * 	// 반복실행코드
 * }
 * 
 * for(초기화; 조건; 증감식){
		조건 충족시 실행문
 }*/
public class Ex05_p197 {

	public static void main(String[] args) {
		
		int[] arr1 = {100, 2, 30, 4, 5};
		// int[] arr1 = new int[5]; 배열 생성.
//		System.out.println("참조변수 arr1="+ arr1);
//		System.out.println("참조변수 arr1.toString()="+arr1.toString());
		
		System.out.println("-배열안의 요소조회 ---------");
		System.out.println(Arrays.toString(arr1));
		//Arrays 클래스는 배열 관련하여 여러 기능을 제공하는 클래스이다. 
		//Arrays.toString(배열명) 메서드는
		//매개변수로 제시한 배열의 내용을 String로 반환한다.
		//
		
		
		System.out.println("-향상된 for문 활용 출력 ---------");
		for(int temp : arr1) {
			System.out.printf("%5d점",temp);
		}	
		
		System.out.println("\n-for문 활용 출력 ---------");
		for(int i = 0; i < arr1.length; i++) {
			int n = arr1[i];
			String jum = "점";
			System.out.printf("%5d%s",n,jum);
			
		}
		
		
		
	}	
}



// 향상된 for문은 컬렉션에서도 사용.

/* Object 클래스(p471) : 모든 클래스의 최상위 클래스이다.
 * 자바의 클래스는 계층구조로 구성. 
 * 따라서 자바의 모든 클래스는 Object 클래스의 method 를 상속(inheritance)받고 있다. 
 *  * 부모 -자식  - 자식 예) Object - String
 * 													- Number - Integer(int 의 wrapper 클래스이다.)
 * Object 클래스의 method 11개
 * - hashCode() : 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴 하기 때문에 
 * 				  객체마다 다른 값을 가지게 된다.   
 * 				  해쉬코드란 ? 객체를 식별하는 하나의 정수값
 * - toString() : 객체의 String 타입으로 정보를 제공(p477)
 * 				  객체의 String 타입 정보란 ? 객체를 문자열로 표현한 값을 말한다. 
 * 				  예) java.lang.클래스명@16진수정수주소
 * 				  필요하면 객체 정보를 제공하는 toString method를 overriding하여 사용하기도 한다.(p478)
 */
