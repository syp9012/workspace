package ch12_Thread;

public class PrintThread1 extends Thread {
	private boolean stop; //타입에 따라 자동으로 false 초기화
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {  
			System.out.println("running~");
		}
		System.out.println("자원정리!");
		System.out.println("실행종료");
	}
	
	
	
}
