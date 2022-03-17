public class OddAndEvenProgram {
	public static void main(String[] args) {
		int count=0;
		int count2=0;
		// print odd and Even number
		for (int i = 1; i <=100; i++) {
			 if (i%2==0) {
				 System.out.print("Even : "+i+" ");
				 count++;
			}
			 
			
			 else {
				System.out.println("Odd : "+i+" ");
				count2++;
			}
			 System.out.print(" ");
			
		}
		System.out.println("Even Numbers : "+count);
		System.out.println("Odd Numbers : "+count2);
		
			}

}
