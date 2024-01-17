package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_1546_average {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int [] result = new int[M];
		double [] fakeResult = new double[M];
		int max = 0;
		double fakeSum = 0.0;
		double fakeAvg = 0.0;
		
		for(int i = 0; i < result.length; i++) {
			StringTokenizer sr = new StringTokenizer(bf.readLine());
			result[i] = Integer.parseInt(sr.nextToken());
			if(result[i] > max) {
				max = result[i];
			}
		} 
		
		for(int i = 0; i < result.length; i++) {
			fakeResult[i] = (double)result[i]/max*100;
			fakeSum += fakeResult[i];
		}
		fakeAvg = fakeSum / M;
		System.out.println(fakeAvg);
	}
}
