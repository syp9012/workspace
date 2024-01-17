package ch05_array;

import java.util.Arrays;

//배열복사(p196)
/*배열복사 : 배열 생성시 지정한 길이는 변경이 불가.
* 		얕은 복사(shallow copy) => 주소만 복사.  지역변수라서 특정 지역을 벗어나면 메모리에서 사라진다.
* int[] a = new int[3]; // 참조변수 a에는 heap영역의 주소가 저장된 상태. 값은 0 0 0 으로 초기화 
* int[] b = a; // 참조변수 b에도 heap영역의 주소 저장.
*
* 
* 		깊은 복사(deep copy) => 데이터까지 복사.
*		System.arraycopy(원본배열명, 원본배열의 시작 index number, 새로운배열명, 새로운 배열의 시작 index number, 원본배열에서 복사할 length)	
*/
public class ArrayCopy03_p196 {

	public static void main(String[] args) {
		// 얕은 복사(shallow copy) 예시코드
		int[] oldArr = {1,2,3,4};
		System.out.println("oldArr = "+oldArr); // [I@6a5fc7f7
		int[] newArr;  // 언제든 주소가 들어갈수 있게 변수 설정된 상태.
		//System.out.println("newArr = "+newArr); 
		// 선언한 변수가 초기화 되지 않은 상태에서 변수를 사용하여 에러발생
		//The local variable newArr may not have been initialized
		
		newArr = oldArr;
		System.out.println("newArr = "+newArr); //  
		
		//원본 배열 확인
		System.out.println(Arrays.toString(oldArr));  //1,2,3,4
		
		//원본 배열의 변경되었다면 사본 배열도 변경된다.
		oldArr[0] = 9999;
		//사본 배열 확인ㄴ
		System.out.println(Arrays.toString(newArr)); // 1,2,3,4
		System.out.println(Arrays.toString(oldArr));
		
	}
	

}
