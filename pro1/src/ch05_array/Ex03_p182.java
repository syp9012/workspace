package ch05_array;


// new 연산자로 배열생성(p182) // 타입[] 배열 변수 = new 타입[길이];
// 값 목록으로 배열 생성	// 타입[] 배열변수 = {값,...,값};
// 데이터타입에 따라 자동으로 값초기화(p183 표 참곤)
public class Ex03_p182 {

	//메인메소드는 무조건 있어야한다. 진입메소드 = 메인메소드
	public static void main(String[] args){
		
		// 
		int[] arr1 = {0,10,20};
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+i+"] = "+arr1[i]);
		}
		// 정수의 기본형 타입의 배열 arr2를 생성    // 초기값 : 0
		int[] arr2 = new int[10];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
		// 실수의 기본형 타입의 배열 arr3를 생성     // 초기값 : 0.0  배열은 주소값이 저장이 되기 때문에 자동형변환(promotion)이 되지 않는다.
		System.out.println("------------------------------------");
		double[] arr3 = new double[10];
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3["+i+"] = "+arr3[i]);
		}
		// 문자의 기본형 타입의 배열 arr4를 생성     // 초기값 : 공백  
		System.out.println("------------------------------------");
		char[] arr4 = new char[10];
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("arr4["+i+"] = "+arr4[i]);
		}
		// 문자열의 기본형 타입의 배열 arr5를 생성     // 초기값 : null  
		System.out.println("------------------------------------");
		String[] arr5 = new String[10];
		for(int i = 0; i < arr5.length; i++) {
			System.out.println("arr5["+i+"] = "+arr5[i]);
		}
		// boolean 타입의 배열 arr6를 생성     // 초기값 : false  
		System.out.println("------------------------------------");
		boolean[] arr6 = new boolean[10];
		for(int i = 0; i < arr6.length; i++) {
			System.out.println("arr6["+i+"] = "+arr6[i]);
		}
		
		//new 연산자로 배열생성
		
		
		// 값 목록으로 배열생성
		
		
		// new 연산자와 값 목록으로 배열생성
		String[] arr9 = new String[] {"대한","민국","독립"};
		// String[] arr10 = new String[3] {"대한","민국","독립"};  
		// Cannot define dimension expressions when an array initializer is provided
		// 주의 : new 연산자+값목록으로 배열 생성시에는 길이를 명시하지 x
		// 실수가 발생할수도 있기때문에 배열 length 기재 못하게 수정.
		// 초기 값을 알면 값목록으로 배열생성 값을 모르면 new 연산자로 배열생성.
		
	
	}

}
