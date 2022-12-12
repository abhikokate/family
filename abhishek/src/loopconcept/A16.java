package loopconcept;

public class A16 {
// BREAK & CONTINUE
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("iteration start"+i);
			if(i==3) {
				System.out.println("inside if");
				continue;
			}
			else {
				System.out.println("inside else"+i);
			}
		}

	}

}
