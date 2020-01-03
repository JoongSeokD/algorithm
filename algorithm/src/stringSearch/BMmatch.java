package stringSearch;

import java.util.Scanner;

public class BMmatch {
static int bmMatch(String txt, String pat) {
	int pt; // txt�� ���󰡴� Ŀ��
	int pp; // pat�� ���󰡴� Ŀ��
	int txt_len = txt.length(); // txt�� ���ڼ�
	int pat_len = pat.length(); // pat�� ���ڼ�
	int[] skip = new int[Character.MAX_VALUE + 1]; // skip ���̺�
	int count = 0; // ��Ƚ��
	int k = -1;

	// skip ���̺� �����
	for (pt = 0; pt <= Character.MAX_VALUE; pt++)
		skip[pt] = pat_len;
	for (pt = 0; pt < pat_len - 1; pt++)
		skip[pat.charAt(pt)] = pat_len - pt - 1;
	// pt == pat_len - 1��.
	// �˻�
	while (pt < txt_len) {
		pp = pat_len - 1; // pat�� ������ ���ڿ� �ָ�

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

		while (txt.charAt(pt) == pat.charAt(pp)) {

			if (pp == 0)
				return pt; // �˻�����
			pp--;
			pt--;
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
		}
		pt += skip[txt.charAt(pt)];
	}
	return -1; // �˻�����
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�ؽ�Ʈ��");
		String s1 = sc.next(); // �ؽ�Ʈ�� ���ڿ�
	
		System.out.print("���ϣ�");
		String s2 = sc.next(); // ���Ͽ� ���ڿ�
	
		int idx = bmMatch(s1, s2); // ���ڿ� s1���� ���ڿ� s2�� BM������ �˻�
	
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
