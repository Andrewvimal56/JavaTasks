import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayShort {
	public static void main(String[] args) {
		int ar[] = new int[6];
		ar[1] = 50;
		ar[2] = 20;
		ar[4] = 60;
		ar[0] = 80;
		ar[3] = 10;
		ar[5] = 30;
		System.out.println(ar[2]);
		int length = ar.length;
		System.out.println(length);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				int a = ar[i];
				int b = ar[j];
				if (a > b) {
					int c = ar[i];
					ar[i] = ar[j];
					ar[j] = c;
				}

			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
		List<String> l = new LinkedList<String>();
		Set<String> s = new LinkedHashSet<String>();
		s.add("vimal");
		s.add("is");
		s.add("a");
		s.add("good");
		s.add("guy");
		for (String string : s) {
			System.out.print(string + " ");
		}
		System.out.println();
		l.addAll(s);
		System.out.println(l);
		String string = l.get(3);
		System.out.println(string);

	}

}
