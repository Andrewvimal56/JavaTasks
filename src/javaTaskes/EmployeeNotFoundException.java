package javaTaskes;

public class EmployeeNotFoundException extends Exception {
  
	@Override
	public String getMessage() {
String msg = "Employee Not Found In Unit";
		return msg;
	}
		
	}


