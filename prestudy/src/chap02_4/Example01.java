package chap02_4;

public class Example01 {

	public static void main(String[] args) {
		String name = "김자바";
		int age = 25;
		String tel1 = "010", tel2="123", tel3="4567";
		
		System.out.println("이름: "+name);
		System.out.print("나이: "+age+"\n");
		System.out.printf("%8s","전화: "+tel1+"-"+tel2+"-"+tel3);
	}

}

