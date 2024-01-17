package chap06_3;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.company);
		
		Car car2 = new Car("자가용");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);

	}

}
