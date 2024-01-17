package ch03_ch04;

//for(초기화;조건;증감식) {
//		반복실행코드
//}
public class ForInForEx_p153 {

	public static void main(String[] args) {

		for(int i = 2; i < 10; i++) {
			System.out.println("\n-"+i+"단------------");
			for(int j = 1; j < 10; j++) {
				int multi = i*j;
				System.out.println(i+"*"+j+"="+multi);
			}
			
		}

	}
	
}
