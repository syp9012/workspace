package ch07;


//p342
public class HankookTire extends Tire {
	//필드
	static final String COMPANY = "한국타이어";
	//생성자-필드초기화 => new Tire("앞왼쪽",6)
	//파라미터가 있는 생성자를 선어나면 기본생서자는 자동추가x
	
	public HankookTire(String location, int maxRotation) {
		//상위 Tire클래스에는 기본생성자가 없으므로 명시적으로 선언한 생성자를 호출해야 한다
		//super(): 부모생성자 호출
		//참고 super:부모클래스 참조변수
		super(location, maxRotation); 
	}
	
	//메서드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "한국Tire 수명:" + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " 한국Tire 펑크!");
			return false;
		}
	}

	
	
}
