package ch06;

// p257  매개변수는 parameter argument 등으로 불린다. 
public class Car04 {
	
	// field [access-modifier][modifier] (field type) (field name) [= 초기값];
	// 필드 속성
	private int gas; //상태변수
	private String dir;
	
	// constructor public (class name) (매개변수){}
	
	
	// method  [access-modifier][modifier] (return type) (method name)([매개변수]){} 
	// 메소드 동작
	// 연료주입
	void setGas(int gas) {
		this.gas += gas; // 매개변수 gas에 저장된 값을 필드 gas에 대입.
	}
	
	// 가스 잔량조회.
	int getGas() {
		return gas;
	}
	
	// 가스 잔량확인. 
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없어요."+ getGas());
			return false;
		}
		System.out.println("gas가 있어요. 현재가스량:" + getGas());
		return true;
	}
	
	// 움직이다.
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달린다. gas 잔량 : " + gas);
				gas -= 1;	
			} 
			System.out.println("멈춥니다. gas 잔량 : "+ gas);
			return; // return 메소드 자체가 종료;
			}
		}
	
	
	void setDir(String dir) {
		this.dir = dir;
	}
	
	void getDir() {
		System.out.println(dir);
	}
	
	
	// 중간에 멈추는 것. 
	
	// 방향 전환
	
	
}
