package basicAlgorithm;

import java.util.Scanner;

public class MaxAndMinNumberOperation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("네 정수의 최댓값과 최소값을 구합니다.");
		System.out.print("a의 값：");
		a = sc.nextInt();
		System.out.print("b의 값：");
		b = sc.nextInt();
		System.out.print("c의 값：");
		c = sc.nextInt();
		System.out.print("d의 값：");
		d = sc.nextInt();

		int max = max(a, b, c, d); 	// a, b, c, d의 최댓값

		System.out.println("최댓값은 " + max + "입니다.");
		
		int min = min(max, b, c, d);
		
		System.out.println("최소값은 " + min + "입니다.");
		
	}
	
	
	static int max(int a, int b, int c, int d) {
		int max = a;
		max = b > max ? b : max;
		max = c > max ? c : max;
		max = d > max ? d : max;
		return max;
	}
	
	static int min(int a, int b, int c, int d) {
		int min = a;
		min = b < min ? b : min;
		min = c < min ? c : min;
		min = d < min ? d : min;
		return min;
	}
}
