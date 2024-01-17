package scissor;

import java.util.Scanner;

public class rockScissor {

	public static void main(String[] args) {
		// 가위 0 바위 1 보 2
		// 승리 1 무승부 1 패배 -1
		Scanner sc = new Scanner(System.in);
		String myTurn = sc.nextLine();
		int myNum = 0;
		
		if(myTurn.equals("가위")) {
			myNum = 0;
		}else if(myTurn.equals("바위")) {
			myNum = 1;
		}else if(myTurn.equals("보")) {
			myNum = 2;
		}
		
		int comNum = (int)(Math.random()*3);
		
		int[][] battle = {{0, -1, 1},
						  {1, 0, -1},
						  {-1, 1, 0}};
		
		
		if(comNum==0) {
			System.out.println("가위");
		}else if(comNum==1) {
			System.out.println("바위");
		}else if(comNum==2) {
			System.out.println("보");
		}
			
			
		if(battle[myNum][comNum] == 1) {
			System.out.println("이겼습니다.");
		}else if(battle[myNum][comNum] == 0) {
			System.out.println("비겼습니다.");
		}else if(battle[myNum][comNum] == -1) {
			System.out.println("졌습니다.");
		}
	
	}

}