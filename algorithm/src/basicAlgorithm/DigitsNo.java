package basicAlgorithm;

import java.util.Scanner;

public class DigitsNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �ڸ����� ���մϴ�.");
		int n;
		do {
			System.out.print("������ : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		int no = 0;
		while (n > 0) {
			n /= 10;
			no++;
		}
		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
		
	}
}
