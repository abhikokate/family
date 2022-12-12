package starproblem;

import java.util.Scanner;

public class Maxno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      int a;
      int b;
      int c;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no");
 	  a=sc.nextInt();
 	  
 	  System.out.println("enter the no");
 	  b=sc.nextInt();

 	  
 	  System.out.println("enter the no");
 	  c=sc.nextInt();

      
      if(a>b && a>c) { 
    	  
    	  System.out.println(a);
    	  
      }
      
      else if(b>a && b>c) {
    	  System.out.println(b);
      }
      
      else {
    	  System.out.println( c);
      }
	}

}
