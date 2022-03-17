
public class StringReverse {

	public static void main(String[] args) {
		String s = "My Name is Vimal";
		String out = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			out = out + charAt;
		}
		System.out.println(out);

		String output = "";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String word = split[i];
			String out1 = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				char charAt = word.charAt(j);
				out1=out1+charAt;
			}
			output=output+out1+" ";
			
		}
		System.out.println(output);
	}
}
