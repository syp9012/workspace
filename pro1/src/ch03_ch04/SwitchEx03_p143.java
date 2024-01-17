package ch03_ch04;


// break 문이 없는 switch 문.
public class SwitchEx03_p143 {

	public static void main(String[] args) {
		// 봄 : 3, 4, 5 , 여름 :6, 7, 8 , 가을 : 9, 10, 11 , 겨울 : 12, 1, 2
		int month = (int)(Math.random()*12)+1;
		System.out.println("month="+month);
		switch(month) {
		case 12:

		case 1:

		case 2:
			System.out.println("겨울");
			break;
		case 3:

		case 4:

		case 5:
			System.out.println("봄");
			break;
		case 6:

		case 7:

		case 8:
			System.out.println("여름");
			break;
		case 9:

		case 10:

		case 11:
			System.out.println("가을");
			break;
		default :
			System.out.println("default");
			break;
		}

	}
}
