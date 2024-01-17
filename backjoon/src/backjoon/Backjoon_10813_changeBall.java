package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_10813_changeBall {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int basketCount = Integer.parseInt(st.nextToken());
		int ballCount = Integer.parseInt(st.nextToken());
		int [] a = new int[basketCount];
		for(int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		for(int i =0; i < ballCount; i++) {
		StringTokenizer sr = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(sr.nextToken());
		int B = Integer.parseInt(sr.nextToken());
		int C = a[A-1];
		int D = a[B-1];
		a[A-1] = D;
		a[B-1] = C;
		}
		
		for(int e : a) {
			System.out.print(e+" ");
		}
		

	}
	
}
