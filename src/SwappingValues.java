
public class SwappingValues {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("a : " + a);
		System.out.println("b : "+b);
		int c =a;
		a=b;
		b=c;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}
