package ch06;

public class Car03 {
	//field 
	// [access-modifier][modifier] type variable name = initialization;
	private String company;
	private int price;
	private double fuelEff;
	private char grade;  
	private boolean isNewCar;  
	
	//constructor
	// [public] class name () {}
	
	//method
	// [access-modifier][modifier] return type method name(type variable) { } 
	
	//필드값 제공 => getter
	String getCompany(){
		return company;
	}
	int getPrice(){
		return price;
	}
	double getFuelEff(){
		return fuelEff;
	}
	char getGrade(){
		return grade;
	}
	boolean isNewCar(){
		return isNewCar;
	}
	
	//필드값 변경 => setter
	// 매개변수 있고, 리턴값 없다.
	void setCompany(String company){
		this.company = company;
	}
	void setPrice(int price){
		this.price = price;
	}
	void setFuelEff(double fuelEff){
		this.fuelEff = fuelEff;
	}
	void setGrade(char grade){
		this.grade = grade;
	}
	void setNewCar(boolean isNewCar){
		this.isNewCar = isNewCar;
	}	
	
	
	
	
	/*
	void method-name() {    
	}
	
	void method-name(type variable){    >>> setter ,  main 메소드
	}
	
	type method-name(){     >>> getter
	return type 값;
	
	type method-name(type variable){
	return type 값;
	}
	
	
	*/
}
