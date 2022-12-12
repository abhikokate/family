package controlstatement;

import java.util.Scanner;

//if else if statement
public class C1 {

	public static void main(String[] args) {
		
     Scanner scan=new Scanner(System.in);
     
     System.out.println("enter the prize of smartphone");
     
     int smartphoneprize=scan.nextInt();
     
     if(smartphoneprize<=10000) {
    	 
    	 System.out.println("purchase intex smartphone");
    	 
     }
     else if(smartphoneprize>10000 && smartphoneprize<=25000) {
    	 
    	 System.out.println("purchase vivo smartphone");
     }
  else if(smartphoneprize>25000 && smartphoneprize<=50000) {
    	 
    	 System.out.println("purchase oneplus smartphone");
     
     
	}    
  else if(smartphoneprize>50000 && smartphoneprize<=100000) {
 	 
 	 System.out.println("purchase apple smartphone");
  
 	 
 		 
 	 
  }
  else  {
 	 
 	 System.out.println("purchase laptop");
  }

	}
} 
  
     
	
	

	
	

	
     