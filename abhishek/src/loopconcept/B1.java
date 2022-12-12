package loopconcept;

import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {
	int x=1;
	int y;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no");
	y=sc.nextInt();
	
    while(x<=10) {
    	System.out.println(x*y);
    	x++;
    }
	}

}
