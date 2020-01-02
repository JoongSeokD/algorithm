package binarySearch;
import java.util.Arrays;
import java.util.Scanner;

class StringBinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Java에서 사용하는 키워드입니다.
		String[] x = {
			"abstract",   "assert",       "boolean",   "break",      "byte",
			"case",       "catch",        "char",      "class",      "const",
			"continue",   "default",      "do",        "double",     "else",
			"enum",       "extends",      "final",     "finally",    "float",
			"for",        "goto",         "if",        "implements", "import",
			"instanceof", "int",          "interface", "long",       "native",
			"new",        "package",      "private",   "protected",  "public",
			"return",     "short",        "static",    "strictfp",   "super",
			"switch",     "synchronized", "this",      "throw",      "throws",
			"transient",  "try",          "void",      "volatile",   "while"
		};
		
		System.out.print("원하는 키워드를 입력하세요 : "); // 키값을 입력
		String  key = sc.next();
		int idx = Arrays.binarySearch(x, key); // 배열 x에서 키값이 key인 요소 검색
		
		if (idx < 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}	}
}
