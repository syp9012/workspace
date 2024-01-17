package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_10818_minMax {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		int max = -1000000;
		int min = 1000000;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int C = Integer.parseInt(st.nextToken());
			A[i] = C;
		}
		for(int i = 0; i < N; i++) {
			if(max <= A[i]) {
				max = A[i];
			}
			if(min >= A[i]) {
				min = A[i];
			}		
		}
		System.out.println(min + " " + max);
	}
		
}
	

