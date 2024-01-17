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

public class ReadEx {
	
	public static void main(String[] args) {
		//바이트 배열로 읽기(p599)
		InputStream is= null;
		try {
			is = new FileInputStream("C:\\temp\\test1.db");
			while(true) {
				int data = is.read(); 
				if(data == -1) break;
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 찾지 못해요");
		} catch (IOException e) {
			System.out.println("입출력이 잘못되었습니다.");
		} catch (Exception e) {
			System.out.println("예외발생");
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("--바이트 배열로 읽기완료");
		
	}

}
