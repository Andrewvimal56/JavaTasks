
public class VowelsAndConsonants {
	public static void main(String[] args) {
		String s = "Welcome To Chennai";
		int vCount = 0, cCount = 0;
		String vowels = "", cons = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
					|| c == 'u') {
				vowels = vowels + c;
				vCount++;

			} else {
				cons = cons + c;
				cCount++;
			}
		}
		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + cons);
		System.out.println("Vowels Count : " + vCount);
		System.out.println("Consonants Count : " + cCount);
	}
}
