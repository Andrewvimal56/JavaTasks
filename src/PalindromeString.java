
public class PalindromeString {
	public static void main(String[] args) {
		String s = "Malayalam";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;

		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not A Palindrome");
		}
	}
}
