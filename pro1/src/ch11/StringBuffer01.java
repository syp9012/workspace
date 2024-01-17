package ch11;

/*StringBuffer
- String처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
- 그러나, String클래스와 달리 내용을 변경할 수 있다.(mutable)
- 인스턴스를 생성할 때 버퍼(배열)의 크기를 충분히 지정해주는 것이 좋다
- String클래스와 달리 equals()를 오버라이딩하지 않았다.

- String타입보다 무거운 편.
- new StringBuffer()객체를 사용하게되면
  String타입보다 메모리 사용량 증가되며, 속도가 느리다
  =>멀티스레드의 동기화를 지원. 멀티스레드환경에서 안전

*/

public class StringBuffer01 {

	public static void main(String[] args) {
		
		//빈번하게 내용이 변경되면 StringBuffer로 작업;
		StringBuffer sb = new StringBuffer(); 
		System.out.println("sb="+sb); 
		sb.append("좋은날씨예요.");
		sb.append(" ");
		sb.append("하하 HOHO");
		System.out.println("sb"+sb); 
		System.out.println("sb.toStirng()="+sb.toString());
		
		//substring() : 문자추출
		//substring(시작인덱스) : 시작인덱스부터 끝까지 문자추출
		//substring(시작인덱스,끝인덱스): 시작인덱스부터 끝인덱스 전까지 문자추출
		System.out.println(sb.substring(0)); //좋은날씨예요. 하하 HOHO
		System.out.println(sb.substring(1));// 은날씨예요. 하하 HOHO
		System.out.println(sb.substring(1,4)); //은날씨
		// 끝덱스가 4이므로, 4보다 앞인 3까지 
		//결론, 인덱스 번호 1부터 3까지 추출 =>은날씨
		
		
//		// StringBuffer를 toString()를 이용하여 String으로 변경 
//		String s = sb.toString();
//		System.out.println(s);
//		
//		//insert() : 지정한 위치에 insert
//		sb.insert(7,"INSERT ");
//		System.out.println(sb);
//		
		//sb.insert(sb.length(), ""); insert를 통해 append한 효과를 낼수 있다.
	}

}

//		String str = new String("문자열");
//		String str1 = new String("문자열");
//		System.out.println("str="+str); //sb.toString
//		System.out.println("str.toString()="+str.toString());
//		//상속받은 toString()을 오버라이딩
//		System.out.println("str.equals(str1) = " + str.equals(str1));
//		//상속받은 equals()를 오버라이딩 
//		System.out.println("----------------------------");