package ch12_Thread;

/*
*쓰레드의 동기화 - synchronized
- 한 번에 하나의 쓰레드만 객체에 접근할 수 있도록 객체에 락(lock)을 걸어서 데이터의 일관성을 유지하는 것.
 
* 동기화 메소드와 블록
- 스레드 작업이 끝날 때까지 객체에 잠금을 걸어 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없게 함
  
* 동기화 메소드 및 블록 선언
- 인스턴스와 정적 메소드에  synchronized 키워드 붙임
- 동기화 메소드를 실행 즉시 객체는 잠금이 일어나고, 메소드 실행이 끝나면 잠금 풀림
- 메소드 일부 영역 실행 시 객체 잠금을 걸고 싶다면 동기화 블록을 만듦
 

*/
public class Calculator {
	//필드
	private int memory;
	
	//생성자
	
	//setter, getter 메서드 
	public int getMemory() {
		return memory;
	}
	
	//method chaining 먼저 실행한 메서드의 리턴타입을 확인해 리턴된 타입의 메서드를 사용할수 있다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"현재 memory =" + this.memory);
		
	}
	
	
}
