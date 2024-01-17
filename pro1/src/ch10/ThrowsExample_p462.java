package ch10;


/*예외 떠넘기기
메소드 내부에서 예외 발생 시 throws 키워드 이용해 메소드를 호출한 곳으로 예외 떠넘기기
throws는 메소드 선언부 끝에 작성. 떠넘길 예외 클래스를 쉼표로 구분해서 나열
나열할 예외 클래스가 많으면 throws Exception 또는 throws Throwable 만으로 모든 예외 떠넘기기

*/
public class ThrowsExample_p462 {
	//필드
	//생성자
	//메서드
	
	//throws 절 추가 Exception 처ㅣ
	public static void findClass() throws ClassNotFoundException{
		//try{}catch{} 이용 Exception 처리
		Class c = Class.forName("java.lang.String");	
	}

	//try{}catch{} 이용 Exception 처리
	public static void findClass2() {
		try{
			Class c = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {

		//findClass(); throws로 전달받은 예외를 별도로 처리해야한다.
		findClass2();
		
	}
}
