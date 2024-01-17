package ch14_IO.charIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

//배열의 길이만큼 읽기(p610)
public class ReadEx02_p610 {

	public static void main(String[] args) throws Exception {
		Reader reader= new FileReader("C:\\temp\\test8.txt");
		char[] buffer = new char[100]; //공백으로 채워진 배열(length = 100)
		
		while(true) {
			int data = reader.read(buffer); //배열의 길이만큼 읽기
			if(data == -1) break; //더이상 읽을 수 없다면 -1을 리턴
			for(int i = 0; i < data; i++) { //읽은 문자 수 만큼 반복하면서
 				System.out.println(buffer[i]);; //배열에 저장된 문자 출력
			}
		}
		if(reader != null) {
			reader.close();
		}
		System.out.println("--char 배열로 읽기완료");
	}

}
