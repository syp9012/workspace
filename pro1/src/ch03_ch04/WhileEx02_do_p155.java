package ch03_ch04;

//do-while
/*while(조건) {
  		조건 성립시 실행문 
  }
  do-while 문법
  do {
  	반복실행코드
  	}while(조건);
	do를 먼저 실행하고 while에 조건을 확인한뒤 성립하면 반복.
*/
public class WhileEx02_do_p155 {
		
	public static void main(String[] args) {
		int i = 100;
		do {
			System.out.println(i);
			i++;
		} while(i<5); //
		
	}

}
