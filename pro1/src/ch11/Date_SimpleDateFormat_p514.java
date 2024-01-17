package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;


//Date(p514)
/*
java.lang.Object
	java.util.Date
		java.sql.Date

*/
public class Date_SimpleDateFormat_p514 {

	public static void main(String[] args) {
		//java.util.Date now = new java.util.Date(); 로 쓸경우 import안해도 쓸수있다.
		Date now = new Date();
		System.out.println("new Date() ="+now);
		System.out.println("toString() ="+now.toString());
		
		//원하는 형식으로 등록해야된다. 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss/E");
		String dateStr = sdf.format(now);
		System.out.println(dateStr);
		
		
		
		
		
	}

}
