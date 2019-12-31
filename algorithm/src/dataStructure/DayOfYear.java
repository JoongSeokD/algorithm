package dataStructure;

import java.util.Scanner;

public class DayOfYear {
	// �� ���� �� ��
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����
	};

	// ���� year���� �����ΰ�? (���⣺1����⣺0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// ���� y�� m�� d���� ������ ����ϼ��� ���մϴ�.
	static int dayOfYear(int y, int m, int d) {
		while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return d;
	}
	
	// ���� y�� m�� d���� ������ ���� �� ���� ���մϴ�.
	static int leftDayOfYear(int y, int m, int d) {
		while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return 365 + isLeap(y) - d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry; // �� ���� ?

		System.out.println("������ ��� �� ���� ���մϴ�.");

		do {
			System.out.print("�⣺");
			int year = sc.nextInt(); // ��
			System.out.print("����");
			int month = sc.nextInt(); // ��
			System.out.print("�ϣ�");
			int day = sc.nextInt(); // ��

			System.out.printf("���� %d��°�Դϴ�.\n", dayOfYear(year, month, day));

			System.out.printf("������ ���� �� ���� %d���Դϴ�.\n", leftDayOfYear(year, month, day));
			
			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�)��");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}
