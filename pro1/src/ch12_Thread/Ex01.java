package ch12_Thread;

/*
 * 멀티 프로세스와 멀티 스레드
-프로세스: 운영체제는 실행 중인 프로그램을 관리 
-멀티 태스킹: 두 가지 이상의 작업을 동시에 처리하는 것
-스레드: 코드의 실행 흐름
-멀티 스레드: 두 개의 코드  실행 흐름. 두 가지 이상의 작업을 처리
-멀티 프로세스 = 프로그램 단위의 멀티 태스킹 / 멀티 스레드 = 프로그램 내부에서의 멀티 태스킹

*메인 스레드
-메인 스레드는 main() 메소드의 첫 코드부터 순차적으로 실행
-main() 메소드의 마지막 코드를 실행하거나 return 문을 만나면 실행을 종료
-메인 스레드는 추가 작업 스레드들을 만들어서 실행시킬 수 있음
-메인 스레드가 작업 스레드보다 먼저 종료되더라도 작업 스레드가 계속 
 실행 중이라면 프로세스는 종료되지 않음
*/


/*
*방법1. Thread 상속받은 경우


*방법2.Runnable 구현하는 경우 
*/

public class Ex01 {

	//main 스레드
	public static void main(String[] args) {
		MyThread01 t1 = new MyThread01();
		MyThread02 t2 = new MyThread02();
		t1.start(); //실행대기상태(Runnable): 실행을 기다리고 있는 상태로전위시키기.
		t2.start(); //
		
	}

}//Class Ex01 


//Thread 상속받은 경우

	class MyThread01 extends Thread{

		@Override
		public void run() {
			for(int i = 0; i < 1000; i++) {
				System.out.println(i+")춤추기");
			}	
		}
	
}

	 class MyThread02 extends Thread{

		@Override
		public void run() {
			for(int i = 0; i < 1000; i++) {
				System.out.println("\t"+i+"sing~sing");
			}	
		}
	
}
	