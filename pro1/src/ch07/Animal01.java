package ch07;

//abstract (p357)
// 추상메소드가 존재하는 클래스는 반드시 abstract 추상 클래스로 선언해야한다.
// 추상클래스는 외부에서 추상클래스의 객체를 만들어 줄때 new연산자를 이용하지 못한다.
// 자식클래스를 통해서 (추상클래스의 객체를) 생성한다.
public abstract class Animal01 {
	
	String gender;
	int age;
	String kind;
	
	//constructor
	public Animal01() {
		System.out.println("Animal01 진입");
		age = 1;
	}
	
	
	
	void eat(String food){
		System.out.println("동물 eat("+food+")");
	}
	void move(){
		
	}
	void sound() {
		System.out.println("동물sound()");
	}
	
	//추상메소드는 선언부만 존재.
	//body(실행부)가 없다. 
	//{} body 대신 ; semi-colon을 작성한다.
	// 추상클래스를 상속받은 하위 클래스에서 반드시 overriding {}를 작성해야 한다. 
	
	abstract void sleep();
	
	// Object 클래스의 toString을 재정의
	@Override
	public String toString() {
		return "Animal01 [gender=" + gender + ", age=" + age + ", kind=" + kind + "]";
	}
	
	
}
