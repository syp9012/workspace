package ch14_IO.byteIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*입력 스트림과 출력 스트림
프로그램을 기준으로 데이터가 들어오면 입력 스트림, 데이터가 나가면 출력 스트림
프로그램이 다른 프로그램과 데이터를 교환하려면 양쪽 모두 입력 스트림과 출력 스트림이 필요


*바이트 스트림: 그림, 멀티미디어, 문자 등 모든 종류의 데이터를 입출력할 때 사용
-문자 스트림: 문자만 입출력할 때 사용

-자바는 데이터 입출력과 관련된 라이브러리를 java.io 패키지에서 제공
-바이트 입출력 스트림의 최상위 클래스는 InputStream과 OutputStream
-문자 입출력 스트림의 최상위 클래스는 Reader와 Writer

*OutputStream
-OutputStream은 바이트 출력 스트림의 최상위 클래스로 추상 클래스 
-모든 바이트 출력 스트림 클래스는 이 OutputStream 클래스를 상속받아서 만들어짐
-OutputStream 클래스에는 모든 바이트 출력 스트림이 기본적으로 가져야 할 메소드가 정의됨

1 바이트 출력
write(int b) 메소드: 매개값 int(4byte)에서 끝 1byte만 출력. 매개변수는 int 타입


바이트 배열 출력
write(byte[ ] b) 메소드: 매개값으로 주어진 배열의 모든 바이트를 출력
배열의 일부분을 출력하려면 write(byte[ ] b, int off, int len) 메소드를 사용 


*/


public class WriteEx {

	public static void main(String[] args) throws Exception {
		//배열전체출력(p596)
		OutputStream os = new FileOutputStream("C:\\temp\\test1.db");
		byte[] array = {10,50,80,90,100};
		os.write(array);
		os.flush();
		os.close();
		System.out.println("-배열전체출력-------------------\n");
		//close로 인한 runtime Exception 발생.

		OutputStream os2 = new FileOutputStream("C:\\temp\\test2.db");
		byte[] array2 = {10,50,80,90,100};
		os2.write(array2,1,2);  //인덱스 1부터 2개 
		os2.flush();
		os2.close();

		System.out.println("-배열일부출력-------------------\n");
		
	}

}
