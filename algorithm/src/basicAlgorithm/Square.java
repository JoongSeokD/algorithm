package basicAlgorithm;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�簢���� ����մϴ�.");
		int num = 0;
		do {
			System.out.print("�� ��  : ");
			num = sc.nextInt();
		} while (num < 0);
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
