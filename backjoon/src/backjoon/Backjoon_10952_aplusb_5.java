package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Backjoon_10952_aplusb_5 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while(true) {
				StringTokenizer st = new StringTokenizer(br.readLine());	
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(a != 0 | b != 0) {
					int c = a + b;
					System.out.println(c);
				} else {
					break;
				}
			} 
		} catch(NoSuchElementException e) {
			System.out.println("NoSuchElementException");
		}
		
		
	}

}
