package ch07;


// Animal01, Bird,의 실행클래스 
public class Animal01_main {
	public static void main(String[] args) {
//		Animal01 animal = new Animal01();
		Fish fish = new Fish();
		Bird bird = new Bird();
		Lion lion = new Lion();
		
		System.out.println("\n"+fish.toString());
		//Fish에서 오버라이딩 한 sleep(), move()호출
		fish.sleep(); // 눈을 뜨고 잔다
		fish.move(); // 헤엄친다
	
		// Animal01 메소드 호출.
		
		fish.eat("플랑크톤"); // 없음
		fish.sound(); // 없음
		
		System.out.println("\n"+bird.toString());
		
		bird.sleep(); // 나무에서잔다
		bird.move(); // 날아간다
		bird.eat("벌레"); //벌레를 쪼아 먹는다
		bird.sound(); // 짹짹
		
		
		System.out.println("\n"+lion.toString());
		
		lion.sleep(); // 낮잠을 잔다
		lion.move(); // 4발로 달린다.
		lion.eat("소동물"); //얼룩말을 잡아먹는다.
		lion.sound(); // 어흥~ 
		
		// 추상클래스는 자신이 아닌 해당클래스의 자식클래스로 객체를 생성해야된다.
		// 
		Animal01 animal = new Lion();
		
		System.out.println(animal.toString()); // Animal01 [null age= 1 null] 
		
	}

}
