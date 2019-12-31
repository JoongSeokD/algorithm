package dataStructure;

import java.util.Scanner;

public class ReverseArray {
	static void swap(int[] a, int idx1, int idx2) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		
		int t = a[idx1];
		a[idx1] =  a[idx2];
		a[idx2] = t;
		System.out.println("a[" + idx1 + "]과 a[" + idx2 + "]를 교환합니다." );
	}
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("요소의 수 : ");
//		int num = sc.nextInt();
		int num = 6;
		int[] x = new int[num];
		
//		for (int i = 0; i < num; i++) {
//			System.out.print("x[" + i + "] : ");
//			x[i] = sc.nextInt();
//		}
		x[0] = 5;
		x[1] = 10;
		x[2] = 73;
		x[3] = 2;
		x[4] = -5;
		x[5] = 42;
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬 했습니다.");
//		for (int i = 0; i < num; i++) {
//			System.out.println("x[" + i + "] = " + x[i]);
//		}
	}
	
}
