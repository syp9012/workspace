package ch12_Thread;

/*
 * 스레드 상태(p541)
실행 대기 상태: 실행을 기다리고 있는 상태 
실행 상태: CPU 스케쥴링에 따라 CPU를 점유하고 run() 메소드를 실행. 스케줄링에 의해 다시 실행 대기 상태로 돌아갔다가 다른 스레드가 실행 상태 반복
종료 상태: 실행 상태에서 run() 메소드가 종료되어 실행할 코드 없이 스레드의 실행을 멈춘 상태


* 일시 정지 상태(p543)
스레드가 실행할 수 없는 상태
스레드가 다시 실행 상태로 가기 위해서는 일시 정지 상태에서 실행 대기 상태로 가야야 함 
Thread 클래스의 sleep() 메소드: 실행 중인 스레드를 일정 시간 멈추게 함
매개값 단위는 밀리세컨드(1/1000)

*다른 스레드에게 실행 양보
yield() 메소드: 실행되는 스레드는 실행 대기 상태로 돌아가고, 다른 스레드가 실행되도록 양보 
무의미한 반복을 막아 프로그램 성능 향상

*/

public class Ex05 {
	// runnable 인터페이스로 구현
	public static void main(String[] args) {
		MyThread051 t1 = new MyThread051();
		MyThread052 t2 = new MyThread052();
		
		t1.start();
		t2.start();
	}
	
	
}

class MyThread051 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i+")번째 줄넘기");
			yield(); // 출력 console상으로 보이지는 않으나,
		}
	}	
}

class MyThread052 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t"+i+")번째 뒤돌기");
			
		}
	}
}

