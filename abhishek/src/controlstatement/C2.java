package controlstatement;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amt");
		int amt=scan.nextInt();
		
		
		if(amt<500) {
			System.out.println("buy simple cake");
		}
		else if(amt>500 && amt<=1000) {
			System.out.println("buy ice cake");
		}
		else if(amt>500 && amt<=1000) {
			System.out.println("buy choklet cake");
		
		}
		else if(amt>500 && amt<=1000) {
			System.out.println("buy strabery cake");
	}
		else {
			System.out.println("buy some ....");
		}
	}
}
