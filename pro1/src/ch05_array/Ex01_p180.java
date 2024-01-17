package ch05_array;

// 배열(Array)- 동일 타입을 가진 데이터를 연속 공간에 저장.
// 인덱스(index) - 0부터 1씩 증가.  * 1부터 증가할수 있음(다른 언어에서)

/*배열변수선언		
  타입[] 변수명;	타입 변수명[];
  변수명 = 값;
  
// 값 목록으로 배열 생성(p180)
// new 연산자로 배열 생성(p182)

// 해당 index의 값을 가져오기 : 배열변수 [idx] get
// 배열변수 값 대입 변수명[idx] = 값; set

*/
public class Ex01_p180 {

	public static void main(String[] args) {
		// 값 목록으로 배열 생성(p180)
		// 배열변수 선언 타입[] 변수명;
		int[] arr1 = {10,20,30,4};
		
		
		System.out.println(arr1); // [I@6a5fc7f7   I=array, @=at, 6a5fc7f7 = 16진법 주소. 
		System.out.println(arr1[0]); // 10
		System.out.println(arr1[1]); // 20
		System.out.println(arr1[2]); // 30
		
		arr1[0] = Integer.parseInt("100");
		System.out.println(arr1[0]); // 100
		arr1[1] = 200;
		System.out.println(arr1[1]); // 200
		arr1[2] = arr1[1]*arr1[0];
		System.out.println(arr1[2]); // 20,000
				
	}

}















