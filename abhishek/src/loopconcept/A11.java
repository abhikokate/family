package loopconcept;

import java.util.Scanner;

public class A11 {
     //PRIME NO
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the no");
		
		int no = sc.nextInt();
		int y=0;
		for (int x=2; x<(no-1);x++) {
			if(no%x==0) {
				y++;
			}
		}
if (y==0) {
	System.out.println("given no is prime no");
	
}
else {
	System.out.println("given no is not prime no");
}
	}

}
