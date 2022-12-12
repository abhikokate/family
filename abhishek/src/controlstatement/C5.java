package controlstatement;

import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a;
		
		a = sc.nextInt();
		
		StringBuilder str1 = new StringBuilder(Integer.toString(a));
		StringBuilder str2 = new StringBuilder(Integer.toString(a));
		str1.reverse();
		
		if (str2.compareTo(str1) == 0) {
			System.out.println("palendrom");
		}
		else {
			System.out.println("not palendrom");
		}
	}
}
