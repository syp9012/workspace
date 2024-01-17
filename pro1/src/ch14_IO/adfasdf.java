package ch14_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*보조 스트림(p615)
-다른 스트림과 연결되어 여러 편리한 기능을 제공해주는 스트림. 
 자체적으로 입출력을 수행할 수 없기 때문에 입출력 소스로부터 직접 생성된 입출력 스트림에 연결해서 사용

-입출력 스트림에 보조 스트림을 연결하려면 보조 스트림을 생성할 때 생성자 매개값으로 입출력 스트림을 제공
-보조스트림 변수 = new 보조스트림(입출력스트림);
-보조 스트림은 또 다른 보조 스트림과 연결되어 스트림 체인으로 구성할 수 있음
-문법 > 보조스트림2 변수 = new 보조스트림2(보조 스트림1);
*/


//p618 보조스트림
//문바변환 보조스트림
public class adfasdf {

	public static void main(String[] args) throws Exception {
		//기본스트림 변수 = new 기본스트림();
		//보조스트림 변수 = new 보조스트림(기본스트림)
		adfasdf obj = new adfasdf();
		obj.write("야호");
				
	}
	
	public static void write(String str) throws Exception {
		System.out.println("write()진입 str = "+str);
		//기본스트림 변수 = new 기본스트림();
		FileOutputStream fos = new FileOutputStream("C:\\temp\\test10.txt");
		//보조스트림 변수 = new 보조스트림(기본스트림)
		OutputStreamWriter w= new OutputStreamWriter(fos);
		w.write(str);
	}

	
	
	

}
