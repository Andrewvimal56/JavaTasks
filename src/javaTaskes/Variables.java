package javaTaskes;

public class Variables {
static	int b =20;
public void work() {
	// Local Variable for normal method
	int a= 20;
System.out.println(b);
}
public static void main(String[] args) {
	// Local variable of Main method
	Variables v = new Variables ();
	
  // int b = 10;
	System.out.println(b);
	// We can,t have dublicate variable names in a same class methods
	//int a = 10 ;
	//System.out.println(a+b);
	//v.work(a);
	
	
}

}
