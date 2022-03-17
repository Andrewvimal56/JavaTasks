
public class StringReverseWithoutSpecialchar {
	public static void main(String[] args) {
		String s = "V1i2mal@ll$";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
				if (Character.isAlphabetic(c)) {
					rev=rev+c;
				}
				else {
					
				}
			
		}
		System.out.println(rev);

	}

}
