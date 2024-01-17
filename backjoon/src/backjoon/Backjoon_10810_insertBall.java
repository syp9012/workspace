package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_10810_insertBall {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int basketCount = Integer.parseInt(st.nextToken());
		int ballCount = Integer.parseInt(st.nextToken());
		int [] a = new int[100];
		for(int i =0; i < a.length; i++) {
			a[i] = i;
		}
		
		

		for(int i = 0; i < ballCount; i++) {
			StringTokenizer sr = new StringTokenizer(br.readLine());
			int startBasket = Integer.parseInt(sr.nextToken());
			int endBasket = Integer.parseInt(sr.nextToken());
			int ballNum = Integer.parseInt(sr.nextToken());
			for(int j = startBasket-1; j <= endBasket-1; j++) {
				a[j] = ballNum;
			}
	
		}
		for(int i =0; i < a.length; i++)
		System.out.print(a[i]+" ");

	}
	
}
