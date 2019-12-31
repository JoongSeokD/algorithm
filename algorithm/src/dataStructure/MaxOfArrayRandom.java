package dataStructure;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandom {
	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) { 
			max = a[i] > max ? a[i] : max;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + random.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("�ִ밪�� " + maxOf(height) + "�Դϴ�.");
	}
}
