package javaTaskes;

public class EmployeeIdIncorrectException extends Exception{
	@Override
	public String getMessage() {
		System.out.println("Id incorrect");
		return super.getMessage();
	}

}
