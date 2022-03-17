package javaTaskes;

public class Variables1 {
	// we can create object anywhere in the class
	 Variables1 v = new Variables1();
	public static void main(String[] args) {
		// we can't call local variables even using extend because it will act on method
		// block only
		// System.out.println(a);
		// Variables.b
		// System.out.println(Variables.b);
		for (int i = 20; i > 1; i--) {
System.out.println(i);
		}

	}
}
