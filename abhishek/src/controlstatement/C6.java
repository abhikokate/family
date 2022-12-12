package controlstatement;

import java.util.Scanner;

public class C6 {

	public static void main(String[] args) {
		// NESTED IF ELSE
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter state of mallin (true or false)");
		Boolean ismallopen=sc.nextBoolean();
		System.out.println("enter seat avaible or notin 9true or false)");
		Boolean  seatavaible=sc.nextBoolean();
		
		if (ismallopen) {
			if(seatavaible) {
				System.out.println("book ticket for movie");
			}
			else {
				System.out.println("seat noy avianblr");
			}
		}
		else {
			System.out.println("restricted");
		}
	}

}
