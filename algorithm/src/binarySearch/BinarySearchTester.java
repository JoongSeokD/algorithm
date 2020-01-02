package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num]; // 요소의 수가 num인 배열
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
	
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.print("검색할 값 : "); // 키 값을 입력 받음
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key); // 배열 x에서 키값이 key인 요소 검색
		
		if (idx < 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
			
	}
	
}
