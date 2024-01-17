package ch01_02;

// 증감연산자 p110 : 1씩 증가(++) 1씩 감소(--);
//++ -- 피연산자 : 다른 연산을 수행하기 전에 증가 혹은 감소하는 것.
//피연산자 ++ -- : 다른 연산을 수행하기 후에 증가 혹은 감소하는 것.
public class IncreaseDecreaseOper_p112 {

	public static void main(String[] args) {
//		입력(input) -> 연산(calculation) -> 출력(output)
//		변수선언은 선언부 끼리 모을것
		
		// 변수선언
		int x = 10;
		int y = 20;
		int z = 0; 
		
		System.out.println("x = "+ x); // 10
		System.out.println("y= "+ y); // 20

		//연산 및 출력
		x++;
		++x;
		System.out.println("x = "+ x); // 12
		
		y--;
		--y;
		System.out.println("y= "+ y); // 18
		
		z = x++; // z = 12
		System.out.println("x= "+ x); // 13
		System.out.println("z= "+ z); // 12
		
		z = y++;
		System.out.println("y= "+ y); // 19
		System.out.println("z= "+ z); // 18
		
		z = ++x + y++;
		System.out.println("x= "+ x); // 14 
		System.out.println("y= "+ y); // 20
		System.out.println("z= "+ z); // 33
		

		
		int result = x + y; 
		System.out.println("result = " + result); // 34
		
		

		
		
		
		
	}

}
