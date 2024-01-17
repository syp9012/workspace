package ch06;


// subclass의 객체를 생성했을때 지정하지 않으면 super 클래스의 기본 생성자를 먼저 호출하고 . 
// super 클래스가 먼저 호출되고 subclass 가 그뒤에 호출된다. 

class GrandMother{
	public GrandMother() {
		System.out.println("할머니-기본생성자()");
	}
	public GrandMother(int a) {
		System.out.println("할머니-int1개 짜리 생성자()");
	}
}


class Mother extends GrandMother{
	public Mother() {
		super(100);  
		System.out.println("엄마-기본생성자()");
	}
}


class Daughter extends Mother{
	public Daughter() {
		//super();  // 묵시적임. 안써도 사용됨. 
		System.out.println("딸-기본생성자()");
	}
}

public class Super02_p314 {
	// 
	public static void main(String[] args) {
		new Daughter();
		GrandMother gd = new Daughter();
		System.out.println(gd.toString());
	}
}
