package logicalprogram;

import java.util.Scanner;

public class Plindromeno {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no");
		int number=scanner.nextInt();
		int rem=0;
		int rev=0;
		int y=number;
		while(y!=0) {
			
			rem=y%10;
			rev= rev*10+rem;
			y=y/10;
		}
   
		  if(number==rev) {
			  System.out.println("given no is palindrome no");
		  }
		  else {
			  System.out.println("given no is not palindrome no");
		  }
	}

}
