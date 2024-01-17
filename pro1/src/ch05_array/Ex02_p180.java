package ch05_array;


//
public class Ex02_p180 {

	public static void main(String[] args) {
		//값 목록으로 배열 생성.
		//타입[] 배열변수 = {값, ... , 값};
		double[] arr1 = {0.0, 3.14, 3.3};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//System.out.println(arr1[3]); //ArrayIndexOutOfBoundsException 
		System.out.println("arr1배열의 길이 = " + arr1.length);
		
		// 배열의 길이는 4이다.
		//  인덱스는 0 1 2 3
		// arr1[4]에서의 인덱스는 존재하지 않기 때문에 에러발생.
		// 배열의 길이는 배열생성시 정해지고 변경할수 없다.
		// 유연한 코드를 작성할것.
		
		boolean[] arr2 = {true, false, true};
		System.out.println(arr2[0]);
		System.out.println("arr2배열의 길이 = " + arr2.length);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		
		char[] arr3 = {'a', 66, 'c'};
		System.out.println(arr3[1]);
		System.out.println("arr3배열의 길이 = " + arr3.length);
		
		String[] arr4 = {"하나", "둘", "삼", "사"};
		System.out.println(arr4[0]);
		System.out.println("arr4배열의 길이 = " + arr4.length);
		
		
		
		
		
	} 
	
	

}
