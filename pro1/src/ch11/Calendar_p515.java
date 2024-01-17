package ch11;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
Calendar 클래스(p515)
달력을 표현하는추상클래스
new 연산자를 사용해서 인스턴스를 생성할수 없다.
getInstance()메소드로 컴퓨터에 설정된 시간대기준으로 Calendar 하위 

Date 클래스(p514)
날짜를 표현하는 클래스로 객체 간에 날짜 정보를 주고 받을 때 사용.
Date() 생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만듬.





*/
public class Calendar_p515 {

	public static void main(String[] args) {
		//Calendar cal = new Calendar();		
		// new 연산자를 사용해서 인스턴스를 생성할수 없다.
		// 운영체제에 종속
		Calendar now = Calendar.getInstance();
		int y = now.get(Calendar.YEAR); // 상수 1 
		int mon = now.get(Calendar.MONTH) + 1; // 상수2  //0부터 시작
		int dm = now.get(Calendar.DAY_OF_MONTH); // 상수 5
		int gd = now.get(Calendar.HOUR_OF_DAY); // 상수 11   24시간기준  
		int dw = now.get(Calendar.DAY_OF_WEEK); // 상수 7
		System.out.println(dw); // 리턴 int가 1은 일요일, 2는 월요일
		//일단위 주단위 연간계획,, 기업의 스케줄표
		String strWeek = "";
		
		switch(dw) {
		case Calendar.SUNDAY: 
			strWeek ="일";
			break;
		case Calendar.MONDAY: 
			strWeek ="월";
			break;
		case Calendar.TUESDAY: 
			strWeek ="화";
			break;
		case Calendar.WEDNESDAY: 
			strWeek ="수";
			break;
		case Calendar.THURSDAY: 
			strWeek ="목";
			break;
		case Calendar.FRIDAY: 
			strWeek ="금";
			break;
		case Calendar.SATURDAY: 
			strWeek ="토";
			break;
		}
		System.out.println("오늘은 "+strWeek+"요일입니다.");
	}

}
