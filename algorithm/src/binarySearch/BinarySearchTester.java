package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �� : ");
		int num = sc.nextInt();
		int[] x = new int[num]; // ����� ���� num�� �迭
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
	
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]); // �ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}
		
		System.out.print("�˻��� �� : "); // Ű ���� �Է� ����
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key); // �迭 x���� Ű���� key�� ��� �˻�
		
		if (idx < 0) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(key + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		}
			
	}
	
}
