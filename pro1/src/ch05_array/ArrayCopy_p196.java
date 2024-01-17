package ch05_array;

import java.util.Arrays;

//배열복사(p196)
/*배열복사 : 배열 생성시 지정한 길이는 변경이 불가.
 * 		깊은 복사(deep copy) => 데이터 까지 복사.  // arraycopy 
 * 
 * 		얕은 복사(shallow copy) => 주소만 복사. // 
*		System.arraycopy(원본배열명, 원본배열의 시작 index number, 새로운배열명, 새로운 배열의 시작 index number, 원본배열에서 복사할 length)	
*/
public class ArrayCopy_p196 {

	
	// 매개변수, parameter, argument, 인수, 인자... 
	public static void main(String[] args) {
		String[] oldArr = {"바나나", "기차", "비행기", "백두산"};  // 값목록 배열 생성
		String[] newArr = new String[10]; // new 연산자 배열 생성 
		
		// 향상된 for문
		for(String oldArr1 : oldArr) {
			System.out.printf("%7s",oldArr1);
		}
		System.out.println("\n-아래는 복사전 new배열------------------------");

		// 향상된 for문
		for(String newArr1 : newArr) {
			System.out.printf("%7s",newArr1);
		}

		System.out.println("\n-아래는 복사후 new배열------------------------");
		
		// 배열 복사
		long b =1;
		System.arraycopy(oldArr, 0, newArr, 2, 3);
		// oldArr 배열의 인덱스번호 1 부터 3가지 elements를 newArr 인덱스 번호 2부터 넣겠다. 
		
		for(String newArr1 : newArr) {
			System.out.printf("%7s",newArr1);
		}
		
		// 원본 배열을 수정후 사본 배열이 수정되는지 확인
		//polymorphism 다형성
	
		
		System.out.println("\n--------원본 배열을 수정후 사본 배열이 수정되는지 확인");
		
		oldArr[3] = "한라산";
	
		
		System.out.println(oldArr[3]);
		System.out.println(Arrays.toString(oldArr));		
		System.out.println(Arrays.toString(newArr));	
		
	} // main
		
}