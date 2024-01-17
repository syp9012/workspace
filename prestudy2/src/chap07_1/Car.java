package chap07_1;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		System.out.println("Car()");
	}
	
	Car(String model){
		this(model,"은색", 250);
		System.out.println("Car(String model)");
	
	}
	
	Car(String model, String color){
		this(model, color, 250);
		System.out.println("Car(String model, String color)");
	}
	
	Car(String model, String color,int maxSpeed){
		this.model = model;
		this.color =color;
		this.maxSpeed= maxSpeed;
		System.out.println("Car(String model, String color,int maxSpeed)");
	}
	
	

}
