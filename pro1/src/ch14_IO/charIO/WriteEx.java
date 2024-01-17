package ch14_IO.charIO;

import java.io.FileWriter;
import java.io.IOException;

//p604
//파일이 없으면 새로 생성, 기존 파일이 있는경우 덮어씀.
public class WriteEx {

	public static void main(String[] args) throws IOException {
		//문자배열 전체출력
		FileWriter w= new FileWriter("C:\\temp\\test8.txt");
		char[] array = {'a','b','c','d','e','f','z'};
		
		w.write(array);
		w.flush();
		w.close();
		System.out.println("문자배열 전체 출력");
		System.out.println("-------------------------\n");
		
		//문자배열 부분 출력(p606)
		FileWriter w1= new FileWriter("C:\\temp\\test9.txt");
		char[] array1 = {'a','b','c','d','e','f','z'};
		
		w1.write(array1,2,4);//인덱스1부터 3개를 출력
		w1.flush();
		w1.close();
		System.out.println("문자배열 부분 출력");
	}

}
