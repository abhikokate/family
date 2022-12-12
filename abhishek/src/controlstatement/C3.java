package controlstatement;
// program of nested ifelse statement

public class C3 {

	public static void main(String[] args) {
		
		int a = 45;
		int b = 80;
		int c = 50;
		System.out.println("larger no is:");
		if(a > b && a > c ) {
			System.out.println(a);
			
		}
		if (b>a && b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
