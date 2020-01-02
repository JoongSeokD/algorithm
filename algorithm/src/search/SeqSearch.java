package search;

import java.util.Scanner;

public class SeqSearch {
	
	// 요소의 수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다. 
	static int seqSeach(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
			if (i == n) 
				return -1; // 검색실패 (-1을 반환)
			if (a[i] == key)  
				return i; // 검색 성공(인덱스를 반환)
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		int idx = seqSeach(x, num, key);
		
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
		
	}
}
