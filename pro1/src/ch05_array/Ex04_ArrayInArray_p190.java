package ch05_array;

public class Ex04_ArrayInArray_p190 {

	// 다차원 배열안의 배열
	public static void main(String[] args) {
		// 3명이 5과목 시험 점수를 저장하기 위한 배열 변수를 선언 하시오;
		// 가변길이의 배열 
		int[][] scores1 = {
							{100, 100, 100, 100, 100},
		 				    {90, 91, 92, 93},
						    {80, 81, 82}
		 				  };
		for(int i = 0; i < scores1.length ; i++) {
			// 학생 1명의 과목수 만큼 반복.
			for(int j = 0; j < scores1[i].length; j++) {
				System.out.print(scores1[i][j]+"\t");
			}
			System.out.println(); // 줄바꿈
		}
		
		
		
		System.out.println(); // 줄바꿈
		System.out.println("-----------------------------------------");
		System.out.println(); // 줄바꿈
		
		
		
		
		
		
		
		// 1명이 5과목 시험 점수를 저장하기 위한 배열 변수를 선언 하시오;
		// 값 목록을 사용하여 선언하시오.
		// 배열변수명
		
		int[] scores = {100, 100, 100, 100, 100};
		for(int i = 0; i < 5; i++) {
			System.out.print(scores[i]+"\t");
		}
		System.out.println(); // 줄바꿈
	}

}
