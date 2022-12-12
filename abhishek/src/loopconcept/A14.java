package loopconcept;

public class A14 {
// SWAP NO
	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		System.out.println("before "+ a);
		System.out.println("before "+ b);
		
		a=a+b;
		b=a-b;
		
		a=a-b;
		
		System.out.println("after "+ a  );
        System.out.println("after "+ b );
	}

}
