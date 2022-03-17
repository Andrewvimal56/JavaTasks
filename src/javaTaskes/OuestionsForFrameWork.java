package javaTaskes;

public class OuestionsForFrameWork {
	// Access Non static method into Non Static method --- Direct Access

//	public void Employee() {
//		System.out.println("vimal");
//	}
//	private void Company() {
//		this.Employee();
//
//	}
//	public static void main(String[] args) {
//		OuestionsForFrameWork q = new OuestionsForFrameWork();
//		q.Company();
//	}

	// Access Static method into Non static method--Direct Access

//	public static void Employee() {
//		System.out.println("Vimal");
//	}
//	private void company() {
//		Employee();
//
//	}
//	public static void main(String[] args) {
//		OuestionsForFrameWork q = new OuestionsForFrameWork();
//		q.company();
//	}

	// Access Static method into static method---Direct Access

//	public static void Employee() {
//		System.out.println("Vimal");
//	}
//	public static void company() {
//		Employee();
//
//	}
//	public static void main(String[] args) {
//		
//		company();
//	}
//	
	// Access instance Variable into Non static method---Direct Access

//	 int a = 200;
//
//	private void company() {
//
//		System.out.println(a);
//	}
//
//	public static void main(String[] args) {
//		OuestionsForFrameWork q = new OuestionsForFrameWork();
//		q.company();
//	}
	
	// Access Static variable into Non Static Method ---- Direct Access
	
	static int a = 200;
//
//	private void company() {
//
//		System.out.println(a);
//	}
//
//	public static void main(String[] args) {
//		OuestionsForFrameWork q = new OuestionsForFrameWork();
//		q.company();
//	}	
	
	// Access static variable into Static method---Direct Access
	
//	static int a = 200;
//
//	private static void company() {
//
//		System.out.println(a);
//	}
//
//	public static void main(String[] args) {
//		
//		company();
//	}	
}
