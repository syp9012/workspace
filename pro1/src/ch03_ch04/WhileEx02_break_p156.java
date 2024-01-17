package ch03_ch04;


// 외부에서 데이터를 가지고 와서 반복 횟수을 예측하기 힘들때 while문 사용. ex) 게시판 글 리젠.
// 

//break(p156) - break가 속한 반복문의 실행을 중지할때 사용.
//continue ;; >>
// 예외 - 조건문인 switch 문에서도 사용 가능하다.
public class WhileEx02_break_p156 {

	public static void main(String[] args) {
		int i = 1;
		int j =1;
		while(j<20) {
			while(i <= 10) {
				System.out.println(i);
				if(i == 5) {
					//System.out.println("if문의 "+i);
					break;
				}//if문
				i++;
			}//while문
			System.out.println(j+ "안쪽 while문 밖으로 나온 상태");
			j=j+5;
		}//while문
		System.out.println("외부 while 문 밖"); // Unreachable code, break는 바로 상위의 반복문을 빠져나옴.
	}

}