package sort;

import java.util.Scanner;

public class ShellSort {

	static void shellSort(int[] a, int n) {
		for (int h = n / 2; h > 0; h/=2) 
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j>= 0 && a[j] > tmp; j -= h) 
					a[j + h] = a[j];
				a[j + h] = tmp;
			}
					
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("셸정렬 버전1");
		System.out.print("요소의 수 : ");
		int[] x = new int[sc.nextInt()];
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		shellSort(x, x.length);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
