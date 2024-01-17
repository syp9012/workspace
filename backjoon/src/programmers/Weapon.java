package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Weapon {

	   public static void main(String[] args) {
	        // 두 숫자를 지정합니다.
	        int num1 = 4;
	        int num2 = 6;

	        // 두 숫자 중에서 더 큰 숫자를 찾습니다.
	        int maxNum = Math.max(num1, num2);

	        // 공배수를 찾아 출력합니다.
	        System.out.println("공배수: ");
	        for (int i = maxNum; ; i += maxNum) {
	            if (i % num1 == 0 && i % num2 == 0) {
	                System.out.print(i + " ");
	            }
	          
	          
	        }
	    }
	}
