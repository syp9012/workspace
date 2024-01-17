package ch01_02;

public class Ex04_p63 {

	public static void main(String[] args) {
		// 하나의 문자를 ' '로 감싼 것을 문자 리터럴이라고 한다. 
		char v1 = 'A';
		System.out.println("v1="+v1); // A
		
		int v2 = v1;
		System.out.println("v2="+v2); // 65
		System.out.println("v2="+(char)v2); // A int 정수를 문자로의 출력방법.
		
		
		char v3 = 'B';
		System.out.println("v3="+v3); // B
		int v4 = v3;
		System.out.println("v4="+v4); // 66		
		System.out.println("v4="+(char)v4); // B int 정수를 문자로의 출력방법.
		
		int v5 = 65;
		char v6 = (char)v5;
		System.out.println(v5); //  65
		System.out.println(v6); //  A
		
		//A->a
		
		
		int v7 = 65;
		int v8 = v7 + 32;
		System.out.println((char)v8); //a
		
		
		
	}

}
