package dataStructure;

import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) { 
			max = a[i] > max ? a[i] : max;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		System.out.print("��� ��  : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("hegiht[" + i + "] : ");
			height[i] = sc.nextInt();
		}
		
		System.out.println("�ִ밪�� " + maxOf(height) + "�Դϴ�.");
		
	}
	
	
	
	
	
}
