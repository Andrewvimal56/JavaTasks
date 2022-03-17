package javaTaskes;

public class Public {
	public static void main (String[]args) throws EmployeeIdIncorrectException {
		String id ="12345";
	if (id.startsWith("34")) {
		System.out.println("Employee Present");
		}
	else {
		try {
			throw new EmployeeIdIncorrectException();
		}
	
		finally {
			System.out.println("correct");
		}
		
	}	
		
	}}
//	
//		else {
//			try {
//				
//				
//					
//			}}}}
//}
////			catch(EmployeeIdIncorrectException e){
//				e.printStackTrace();
//				System.out.println("Correct");
//			}
//			finally {
//				System.out.println("Correct");
//			}
// }

//	public static void main(String[] args)  {
//		//throw new EmployeeNotFoundException();
//	Public p = new Public();
//	p.search();
//	
//	}
