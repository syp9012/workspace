package ch07;

//Animal01 클래스로부터 field, method를 상속
public class Bird extends Animal01 {
	
	public Bird() {
		kind = "닭";
	}
	
	
	@Override
	void eat(String food) {
		System.out.println(food+"를 쪼아 먹는다");
	}
	
	@Override
	void move() {
		System.out.println("날아간다");
	}
	@Override
	void sound() {
		System.out.println("짹짹");
	}
	
	@Override
	void sleep() {
		System.out.println("나무에서 잔다.");
	}


	@Override
	public String toString() {
		return "Bird [toString()=" + super.toString() + "]";
	}
	
	
	
	
}
