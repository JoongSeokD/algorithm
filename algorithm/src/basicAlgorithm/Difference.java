package basicAlgorithm;

import java.util.Scanner;

public class Difference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a와 b를 입력받아 b-a를 출력합니다.");
		
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		while (a >= b) {
			System.out.println("a보다 큰값을 입력하세요");
			System.out.print("b의 값 : ");
			b = sc.nextInt();
		}
		/* 답안지 답
		int b=0;
		while (true) {
			System.out.print("b의 값：");
			b = sc.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		*/
		
		System.out.println("b - a는 " + (b - a) + "입니다.");
		
		
	}
}
