package basicAlgorithm;

import java.util.Scanner;

public class Difference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� a�� b�� �Է¹޾� b-a�� ����մϴ�.");
		
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		
		System.out.print("b�� �� : ");
		int b = sc.nextInt();
		
		while (a >= b) {
			System.out.println("a���� ū���� �Է��ϼ���");
			System.out.print("b�� �� : ");
			b = sc.nextInt();
		}
		/* ����� ��
		int b=0;
		while (true) {
			System.out.print("b�� ����");
			b = sc.nextInt();
			if (b > a)
				break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		*/
		
		System.out.println("b - a�� " + (b - a) + "�Դϴ�.");
		
		
	}
}
