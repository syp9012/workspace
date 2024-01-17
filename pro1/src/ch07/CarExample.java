package ch07;

//p343
//이 클래스는 main 클래스다. 
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		//run()의 리턴값 - 펑크난 타이어의 위치
		/*
		* 0 : 이상없이 잘 움직여요. 
		* 1 : fL 바퀴 터짐, 2: FR바퀴 터짐, 
		* 3: BL 바퀴 터짐, 4: BR 바퀴 터짐.
		*/
		
		for(int i = 0; i < 7; i++) {
			int problemLoc = car.run();
			switch(problemLoc) {
			 case 1:
				 System.out.println("앞왼쪽 한국타이어로 교체");
				 car.fLTire = new HankookTire("앞왼쪽", 15);
				 break;
			 case 2:
				 System.out.println("앞오른쪽 한국타이어로 교체");
				 car.fRTire = new HankookTire("앞오른쪽", 12);
				 break;
			 case 3:
				 System.out.println("뒤왼쪽 금호타이어로 교체");
				 car.bLTire = new KumhoTire("뒤왼쪽", 15);
				 break;
			 case 4:
				 System.out.println("뒤오른쪽 금호타이어로 교체");
				 car.bRTire = new KumhoTire("뒤오른쪽", 12);
				 break;
			}
			System.out.println("\n---------------------------------");
		}
	}
}
