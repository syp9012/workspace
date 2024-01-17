package ch12_Thread;

/*안전하게 스레드 종료하기 
-스레드 강제 종료 stop() 메소드: deprecated(더 이상 사용하지 않음)
-스레드를 안전하게 종료하려면 
사용하던 리소스(파일, 네트워크 연결)를 정리하고 
run() 메소드를 빨리 종료해야 함

-조건 이용 
while 문으로 반복 실행 시 조건을 이용해 run() 메소드 종료를 유도
*/



public class Ex06_p545 {

	public static void main(String[] args) {
		PrintThread1 th = new PrintThread1();
		th.start();
		try {
		Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		th.setStop(true);
	}

}
