package ch11;

import java.text.DecimalFormat;
import java.text.ParseException;

/*
*DecimalFormat
 -숫자를 형식화된 문자열로 변환
*/

public class DecimalFormat01 {

	public static void main(String[] args) {
		double num = 12345.6789;
		
		//DecimalFormat을 이용하여 숫자를 문자열로 변환.
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");//반올림 됨
		
		String numStr = df.format(num);
		System.out.println(numStr);
			
		//문자열로 변환된 수를 -> 다시 숫자로 변환
		//NumberFormat 클래스의 parse() : 제시한 문자형태의 number를 Number로 변환.
		//public Number parse(String source)throws Parse
		/*
		 * Number 클래스doubleValue() : 제시한 number를 double타입으로 변환한다.
		 * public abstract double doubleValue() Returns the value of the specified
		 * number as a double.
		 * 
		 */
		try {
		Number parsedNum = df.parse(numStr);
		double parsedValue = parsedNum.doubleValue();
		System.out.println(parsedValue);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
