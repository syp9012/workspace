package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon_3052_rest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[10];
		int[] rest= new int[10];
		int restTotal = 0;
		
		for(int i =0; i < num.length; i++) {
			int T = Integer.parseInt(br.readLine());
			num[i] = T;
			rest[i] = T % 42;
			for(int j = i+1; j < num.length; j++) {
				if(rest[i] != rest[j]) {
					restTotal+=1;
				}
			}
		}
		System.out.println(restTotal);
		
	}

}
