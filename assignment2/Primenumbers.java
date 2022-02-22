
package assignment2;

public class Primenumbers {
	public static void main(String[] args) {

		int num=23;
		
		boolean isprime =false;
		
		for(int i=2; i<=num/2; ++i) {
			
			if(num%i ==0) {
				
				isprime =true;
				
				break;
			  }  		
     }
			if(isprime) {
				System.out.println(num+"is a prime number");
			}
				else {
					System.out.println(num+"is a not a prime number");
			}
			
				
  
}}