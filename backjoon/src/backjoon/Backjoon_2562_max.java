package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_2562_max {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int[] A = new int[9];
		int max = 0;
		int order = 0;
		int a= 0;
		
		for(int i = 0; i < A.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			A[i] = a;
			if(max < a) {
				max = a;
				order = i+1;
			}
		}
		System.out.println(max);
		System.out.println(order);
		br.close();
	}
		
}
	

