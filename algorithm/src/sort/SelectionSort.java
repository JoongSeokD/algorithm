package sort;

import java.util.Scanner;

public class SelectionSort {
	// �迭�� ��� a[idx1]�� a[idx2]�� ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// �ܼ� ���� ����
	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;			// ���� ���ĵ��� ���� �κп��� ���� ���� ����� �ε����� ����մϴ�.
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			swap(a, i, min);		// ���� ���ĵ��� ���� �κ��� ù ��ҿ� ���� ���� ��Ҹ� ��ȯ�մϴ�.
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ܼ� ���� ����");
		System.out.print("����� ����");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		selectionSort(x, nx); // �迭x�� �ܼ���������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}
