package javaTaskes;

public class QuestionsForFrameWork3 {

	// Access instance variable of another class into non static method of this
	// class---Using Object
	public void method1() {
		OuestionsForFrameWork q = new OuestionsForFrameWork();
		System.out.println(q.a);

	}

	public static void main(String[] args) {
		QuestionsForFrameWork3 q3 = new QuestionsForFrameWork3();
		q3.method1();

	}

}

//		

//	}

// Access static method of another class into Non static method of this
// class---Using className.methodName
//	private void method1() {
//		
//		OuestionsForFrameWork.Employee();
//	}
//	public static void main(String[] args) {
//		QuestionsForFrameWork3 q1 = new QuestionsForFrameWork3();
//		q1.method1();
//	}
// Access static method of another class into static method of this
// class---Using className.methodName
//	private static void method1() {
//		
//		OuestionsForFrameWork.Employee();
//	}
//	public static void main(String[] args) {
//             method1();
//	}

// Access static variable of another class into non static method of this
// class---Using className.variableName
//		private  void method1() {
//			
//			int a = OuestionsForFrameWork.a;
//			System.out.println(a);
//		}
//		public static void main(String[] args) {
//			QuestionsForFrameWork3 q = new QuestionsForFrameWork3();
//			q.method1();
//		}

// Access Static variable of another class into static method of this class --->
// Using className.variableName
//	private static  void method1() {
//		
//		 int a = OuestionsForFrameWork.a;
//		System.out.println(a);
//	}
//	public static void main(String[] args) {
//		method1();
//	}
//	
