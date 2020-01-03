package stringSearch;

import java.util.Scanner;

public class KMPmatch {
	static int kmpMatch(String txt, String pat) {
		int pt = 1; // txt�� ���󰡴� Ŀ��
		int pp = 0; // pat�� ���󰡴� Ŀ��
		int count = 0; // ��Ƚ��
		int[] skip = new int[pat.length() + 1]; // skip ���̺�
		int k = -1;

		// skip ���̺� �����
		System.out.println("skip ���̺� �����");
		skip[pt] = 0;
		while (pt != pat.length()) {
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
			if (pat.charAt(pt) == pat.charAt(pp))
				skip[++pt] = ++pp;
			else if (pp == 0)
				skip[++pt] = pp;
			else
				pp = skip[pp];
		}

		// �˻�
		System.out.println("�˻�");
		pt = pp = 0;
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
			} else if (pp == 0)
				pt++;
			else
				pp = skip[pp];
		}

		System.out.printf("�񱳴� %dȸ�Դϴ�.\n", count);
		if (pp == pat.length()) // ������ ��� ���ڸ� ����
			return pt - pp;
		return -1; // �˻�����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ؽ�Ʈ��");
		String s1 = sc.next(); // �ؽ�Ʈ�� ���ڿ�

		System.out.print("���ϣ�");
		String s2 = sc.next(); // ���Ͽ� ���ڿ�

		int idx = kmpMatch(s1, s2); // ���ڿ� s1���� ���ڿ� s2�� KMP������ �˻�

		if (idx == -1)
			System.out.println("�ؽ�Ʈ�� ������ �����ϴ�.");
		else {
			int len = 0;
			for (int i = 0; i < idx; i++)
				len += s1.substring(i, i + 1).getBytes().length;
			len += s2.length();

			System.out.println((idx + 1) + "��° ���ڿ� ��ġ�մϴ�.");
			System.out.println("�ؽ�Ʈ��" + s1);
			System.out.printf(String.format("���ϣ�%%%ds\n", len), s2);
		}
	}
}
