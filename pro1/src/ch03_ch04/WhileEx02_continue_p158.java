package ch03_ch04;

// break와 continue는 목표지점이 다름. 
// break는 바로 위 반복문 자체를 벗어남.
// continue는 i==5
// 외부에서 데이터를 가지고 와서 반복 횟수을 예측하기 힘들때 while문 사용. ex) 게시판 글 리젠.
//continue(p158) 
//참고 break(p156) 예외 - 조건문인 switch 문에서도 사용 가능하다.
public class WhileEx02_continue_p158 {

	public static void main(String[] args) {
		int i = 1;
			while(i <= 10) {
				System.out.println("while:i"+i);
				i++;
				System.out.println("++후:"+i);
				if(i == 5) {
					System.out.println("continue 전 if문의 i="+i);
					continue;
					//System.out.println("continue 전 if문의 i="+i); //Unreachable code
				}//if문
			}//while문
	
		System.out.println("안쪽 while 문 밖"); // Unreachable code, break는 바로 상위의 반복문을 빠져나옴.
	}

}

/* while:i1
 * ++후:2
 * while:i2
 * ++후:3
 * while:i3
 * ++후:4
 * while:i4
 * ++후:5
 * continue 전 if문의 i=5
 * while:i5
 * ++후:6
 * 
 */


