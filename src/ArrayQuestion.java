
public class ArrayQuestion {
	public static void main(String[] args) {

		int ar[] = { 22, 37, 89, 13, 44, 39 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				int a = ar[i] % 10;
				int b = ar[j] % 10;
				if (a > b) {
					int c = ar[i];
					ar[i] = ar[j];
					ar[j] = c;
				}

			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}
}
