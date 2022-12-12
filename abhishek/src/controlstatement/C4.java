package controlstatement;

import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		Scanner im = new Scanner (System.in);
		
        System.out.println("enter the first number");
        int x = im.nextInt();
        
        System.out.println("enter the second number");
        int y = im.nextInt();
        
        System.out.println("enter the third number");
        int z = im.nextInt();
        
        System.out.println("iarger no is :");
     
        if (x>y && x>z) {
        	System.out.println(x);
        }
        if (y>x && y>z) {
        	System.out.println(y);
        }
        else {
        	System.out.println(z);
        }
       
        }
	}
	


