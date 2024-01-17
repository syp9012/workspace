package ch07;


//p340
public class Tire {
	//필드
	public int maxRotation; //최대회전수
	public int accumulatedRotation; //누적회전수
	public String location; //타이어 위치
	
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location; //타이어 위치
		this.maxRotation = maxRotation; //타이어 수명
	}
	
	//메서드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명:" + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크!");
			return false;
		}
	}

	
	
}
