package sort;

import java.util.Scanner;

public class QuickSort {
	// �迭�� ��� a[idx1]�� a[idx2]�� ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// �ܼ���������
	static void insertionSort(int[] a, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			int tmp = a[i];
			int j;
			for (j = i; j > left && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}

	// �迭�� ����
	static void quickSort(int[] a, int left, int right) {
		if (right - left < 9)
			insertionSort(a, left, right);
		else {
			int pl = left; // ���� Ŀ��
			int pr = right; // ������ Ŀ��
			int x = a[(pl + pr) / 2]; // �ǹ� (�߾��� ���)

			do {
				while (a[pl] < x)
					pl++;
				while (a[pr] > x)
					pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);
			if (pr - left < right - pl) {
				int temp;
				temp = left;
				left = pl;
				pl = temp;
				temp = right;
				right = pr;
				pr = temp;
			}
			if (left < pr)
				quickSort(a, left, pr);
			if (pl < right)
				quickSort(a, pl, right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ ");
		System.out.print("����� ����");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = sc.nextInt();
		}

		quickSort(x, 0, nx - 1); // �迭 x�� ������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
	}
}