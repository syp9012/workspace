package ch07;


//p342
public class KumhoTire extends Tire {
	//필드
	static final String COMPANY = "금호타이어"; //정적필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); 
	}
	
	//메서드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "금호Tire 수명:" + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " 금호Tire 펑크!");
			return false;
		}
	}

	
	
}
