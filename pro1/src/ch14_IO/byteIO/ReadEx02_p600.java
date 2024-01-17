package ch14_IO.byteIO;


/*InputStream
-InputStream은 바이트 입력 스트림의 최상위 클래스로, 추상 클래스 
-모든 바이트 입력 스트림은 InputStream 클래스를 상속받아 만들어짐
-InputStream 클래스에는 바이트 입력 스트림이 기본적으로 가져야 할 메소드가 정의됨 

*1 바이트 입력
-read() 메소드: 입력 스트림으로부터 1byte를 읽고 int(4byte) 타입으로 리턴. 
			  리턴된 4byte 중 끝 1byte에만 데이터가 들어 있음 
-더 이상 입력 스트림으로부터 바이트를 읽을 수 없다면 read() 메소드는 -1을 리턴. 
 읽을 수 있는 마지막 바이트까지 반복해서 한 바이트씩 읽을 수 있음

*바이트 배열로 읽기(p599)
-read(byte[ ] b) 메소드: 입력 스트림으로부터 주어진 배열의 길이만큼 바이트를 읽고 
					   배열에 저장한 다음 읽은 바이트 수를 리턴
-read(byte[ ] b)도 입력 스트림으로부터 바이트를 더 이상 읽을 수 없다면 -1을 리턴.
 읽을 수 있는 마지막 바이트까지 반복해서 읽을 수 있음 


*/



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx02_p600 {
	
	public static void main(String[] args) throws Exception{
		//배열의 길이만큼 읽기(p600)
		InputStream is= new FileInputStream("C:\\temp\\test1.db");
		byte[] buffer = new byte[100]; //0으로 채워진 배열(length = 100)
		
		while(true) {
			int data = is.read(buffer); //배열의 길이만큼 읽기
			if(data == -1) break; //바이트를 더이상 읽을 수 없다면 -1을 리턴
			for(int i = 0; i < data; i++) { //읽은 바이트 수 만큼 반복하면서
 				System.out.println(buffer[i]);; //배열에 저장된 바이트 출력
			}
		}
		if(is != null) {
			is.close();
		}
		System.out.println("--바이트 배열로 읽기완료");
	}
}
