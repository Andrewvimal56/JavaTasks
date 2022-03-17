import java.util.Arrays;

public class AnagramProgram {
	public static void main(String[] args) {

		String s[] = { "s", "t", "a", "t", "e" };
		String s3[] = { "t", "a", "s", "t", "e" };

		boolean b = s.equals(s3);
		System.out.println(b);
		if (s.length != s3.length) {
			System.exit(0);
		} else {
			Arrays.sort(s);
			Arrays.sort(s3);
			boolean equals = s.equals(s3);
			System.out.println(equals);
			boolean equals2 = Arrays.equals(s, s3);
			System.out.println(equals2);
		}
		String s1 = "State";
		String s2 = "Taste";
		boolean case1 = s1.equalsIgnoreCase(s2);
		System.out.println(case1);
		char[] s1Array = s1.toLowerCase().toCharArray();
		char[] s2Array = s2.toLowerCase().toCharArray();
		if (s1Array.length != s2Array.length) {
			System.exit(0);
		} else {
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			System.out.println(s1Array);
			System.out.println(s2Array);
			boolean equals = Arrays.equals(s1Array, s2Array);
			System.out.println(" Given Words are Anagram : " + equals);
		}
	}

}
