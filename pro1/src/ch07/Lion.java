package ch07;


public class Lion extends Animal01 {

	public Lion() {
		kind = "아프리카 사자";
	}
	
	
	@Override
	void eat(String food) {
		System.out.println(food+"를 잡아 먹는다");
	}
	@Override
	void move() {
		System.out.println("4발로 달린다");
	}
	@Override
	void sound() {
		System.out.println("어흥~");
	}
	@Override
	void sleep() {
		
		System.out.println("낮잠을 잔다.");
	}


	@Override
	public String toString() {
		return "Lion [toString()=" + super.toString() + "]";
	}
	
	
	
	
}
