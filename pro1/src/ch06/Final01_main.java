package ch06;


//
public class Final01_main{
	public static void main(String[] args) {
		Final01_p281 obj = new Final01_p281();
		obj.a = 100;
		//obj.fa = 100;
		//The final field Final01_p281.fa cannot be assigned
		
		obj.a();
		obj.fa();
		
		Final02_p281 obj2 = new Final02_p281();
		//obj2.a = 200;
		obj2.a();
		//obj2.fa();
		
	}

}
