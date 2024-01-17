package ch05_array;


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
public class ArrayCopy02_p196 {
	public static void main(String[] args) {
		int[] a; // 참조 변수 a 는 heap 주소 저장.
		{
			int[] b = new int[3]; // 참조 변수 b 는 heap 주소 저장. 0 0 0
			b[2] = 20;
			System.out.println(b[2]); //
			
			a = b;// 참조변수 a 는 참조변수 b의 주소가 대인 -> 주소 복사.
			System.out.println(a[2]);
			System.out.println(a[2]);
		}
		
		//System.out.println(b[2]); // b는 출력 불가. 지역변수 b 의 범위를 벗어남. System.out.println(b[2]);
		System.out.println(a[2]); // b는 출력 불가. 지역변수 b 의 범위를 벗어남.
		
	} // main
	

}
