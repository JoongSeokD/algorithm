package search;

import java.util.Scanner;

public class SeqSearch {
	
	// ����� ���� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�. 
	static int seqSeach(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
			if (i == n) 
				return -1; // �˻����� (-1�� ��ȯ)
			if (a[i] == key)  
				return i; // �˻� ����(�ε����� ��ȯ)
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();
		int idx = seqSeach(x, num, key);
		
		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(key + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		}
		
	}
}
