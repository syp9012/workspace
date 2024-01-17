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
*/

public class Ex04 {
	// runnable 인터페이스로 구현
	public static void main(String[] args) {
		Runnable temp1 = new MyThread011();
		Runnable temp2 = new MyThread012();
		
		Thread t1 = new Thread(temp1);
		Thread t2 = new Thread(temp2);
		t1.start();
		t2.start();
	}
	
	
}

class MyThread011 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i+")번째 줄넘기");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

class MyThread012 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t"+i+")번째 뒤돌기");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

