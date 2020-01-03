package stringSearch;

import java.util.Scanner;

public class BFmatch {
	static int bfMatch(String txt, String pat) {
		int pt = 0; // txt�� ���󰡴� Ŀ��
		int pp = 0; // pat�� ���󰡴� Ŀ��
		int count = 0; // ��Ƚ��
		int k = -1;

		while (pt != txt.length() && pp != pat.length()) {
			if (k == pt - pp)
				System.out.print("    ");
			else {
				System.out.printf("%2d  ", pt - pp);
				k = pt - pp;
			}
			for (int i = 0; i < txt.length(); i++)
				System.out.print(txt.charAt(i) + " ");
			System.out.println();

			for (int i = 0; i < pt * 2 + 4; i++)
				System.out.print(" ");
			System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
			System.out.println();

			for (int i = 0; i < (pt - pp) * 2 + 4; i++)
				System.out.print(" ");

			for (int i = 0; i < pat.length(); i++)
				System.out.print(pat.charAt(i) + " ");
			System.out.println();
			System.out.println();
			count++;

			if (txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		System.out.printf("�񱳴� %dȸ�����ϴ�.\n", count);
		if (pp == pat.length()) // �˻�����
			return pt - pp;
		return -1; // �˻�����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ؽ�Ʈ��");
		String s1 = sc.next(); // �ؽ�Ʈ�� ���ڿ�

		System.out.print("���ϣ�");
		String s2 = sc.next(); // ���Ͽ� ���ڿ�

		int idx = bfMatch(s1, s2); // ���ڿ� s1���� ���ڿ� s2�� ���Ʈ-���������� �˻�

		if (idx == -1)
			System.out.println("�ؽ�Ʈ�� ������ �����ϴ�.");
		else {
			int len = 0;
			for (int i = 0; i < idx; i++)
				len += s1.substring(i, i + 1).getBytes().length;
			len += s2.length();
		}
	}
}
