package basicAlgorithm;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		int num = 0;
		do {
			System.out.print("단 수  : ");
			num = sc.nextInt();
		} while (num < 0);
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
