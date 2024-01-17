package ch12_Thread;

/*작업 스레드의 이름
작업 스레드 이름을 Thread-n 대신 다른 이름으로 설정하려면 
Thread 클래스의 setName() 메소드 사용


디버깅할 때 어떤 스레드가 작업을 하는지 조사하기 위해 주로 사용
어떤 스레드가 실행하고 있는지 확인하려면 
정적 메소드인 currentThread()로 스레드 객체의 참조를 얻은 다음 
getName() 메소드로 이름을 출력*/

//하나의 스레드를 여러번 동작시킨다.
public class Ex03 {

	public static void main(String[] args) {
		
		MyThread031 t1 = new MyThread031("임시완");
		MyThread031 t2 = new MyThread031("고윤정");
		MyThread031 t3 = new MyThread031("정우성");
		
		t1.start(); //runable 상태로 변경.
		t2.start();
		t3.start();
	}

}

class MyThread031 extends Thread{
	//필드
	
	
	//생성자
	public MyThread031(String name) {
		super(name); //기본적으로 부모를 호출
		System.out.println("MyThread031(String name) 생성자");
	}
	
	
	//메서드
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			Thread t = Thread.currentThread(); // 현재 실행중인 스레드
			String name = t.getName();
			System.out.println(name+"이(가) java공부("+i+"");
		}	
	}
}
