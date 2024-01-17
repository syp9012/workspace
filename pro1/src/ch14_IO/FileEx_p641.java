package ch14_IO;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*File 클래스
File 클래스로부터 File 객체를 생성

* Files 클래스
Files 클래스는 정적 메소드로 구성되어 있기 때문에 File 클래스처럼 객체로 만들 필요 없음
Files의 정적 메소드는 운영체제의 파일 시스템에게 파일 작업을 수행하도록 위임
*/
public class FileEx_p641 {

	public static void main(String[] args) throws IOException {
//		File dir = new File("C://temp//images");
//		if(dir.exists() == false) {
//			dir.mkdirs();
//		}
//		File f1 = new File("C://temp//f1.txt");
//		File f2 = new File("C://temp//f2.txt");
//		File f3 = new File("C://temp//f3.txt");
//		
//		if(!f1.exists()) {
//			f1.createNewFile();
//		}
//		if(!f2.exists()) {
//			f2.createNewFile();
//		}
//		if(!f3.exists()) {
//			f3.createNewFile();
//		}
		
		File temp = new File("C://temp//");
		File[] contents = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			Date date = new Date(file.lastModified());
			String strDate = sdf.format(date);
			System.out.print(strDate); //millesecond까지 측정되기때문에 중복되지않는값을 구할때 유용하다.
			
			if(file.isDirectory()) {
				System.out.print("\t<DIR>"+"\t"+file.getName()); //용량 확인
			}else {
				System.out.print("\t"+file.getName()+"\t"+file.length()+"\t"); //용량 확인
			}
			System.out.println();
		}
		
	}

}
