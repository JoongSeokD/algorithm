package basicAlgorithm;

import java.util.Scanner;

public class MaxAndMinNumberOperation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("�� ������ �ִ񰪰� �ּҰ��� ���մϴ�.");
		System.out.print("a�� ����");
		a = sc.nextInt();
		System.out.print("b�� ����");
		b = sc.nextInt();
		System.out.print("c�� ����");
		c = sc.nextInt();
		System.out.print("d�� ����");
		d = sc.nextInt();

		int max = max(a, b, c, d); 	// a, b, c, d�� �ִ�

		System.out.println("�ִ��� " + max + "�Դϴ�.");
		
		int min = min(max, b, c, d);
		
		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
		
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
