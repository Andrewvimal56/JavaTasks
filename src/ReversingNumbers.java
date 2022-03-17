
public class ReversingNumbers {

	public static void main(String[] args) {
		int a = 123456;
		int count = 0;
		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println("Count of given Numbers : " + count);
		int a1 = 123456;
		int sum = 0;
		while (a1 > 0) {
			int rem = a1 % 10;
			sum = sum + rem;
			a1 = a1 / 10;
       }
		System.out.println("Sum of all Numbers : " + sum);

		int a2 = 1234;
		int rev = 0;
		while (a2 > 0) {
			int rem = a2 % 10;
			rev = (rev * 10) + rem;
			a2 = a2 / 10;
		}
		System.out.println("Reversed Numbers : " + rev);

	}

}
