package backjoon;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // A와 B 입력 받기
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // 입력이 0인 경우 종료
            if (A == 0 && B == 0) {
                break;
            }

            // A+B 출력
            System.out.println(A + B);
        }

        scanner.close();
    }
}