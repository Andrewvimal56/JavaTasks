
public class CharacterClassPrograms {
	public static void main(String[] args) {
		String s1 = "Welcome@123#";
		int uCount = 0, lCount = 0, dCount = 0, sCount = 0;
		String u = "", l = "", d = "", s = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (Character.isUpperCase(c)) {
				u = u + c;
				uCount++;
			} else if (Character.isLowerCase(c)) {
				l = l + c;
				lCount++;

			} else if (Character.isDigit(c)) {
				d = d + c;
				dCount++;
			} else {
				s = s + c;
				sCount++;
			}
		}
		System.out.println("Upper Case Count : " + uCount);
		System.out.println("Lower Case Count : " + lCount);
		System.out.println("Digit Count : " + dCount);
		System.out.println("Special Char Count : " + sCount);
		System.out.println("Upper Case Letters : "+u);
		System.out.println("Lower Case Letters : "+l);
		System.out.println("Digits : "+d);
		System.out.println("Special Characters : "+ s);
	}

}
