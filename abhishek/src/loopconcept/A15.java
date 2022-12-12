package loopconcept;
//given no is perfect or not-
public class A15 {

	public static void main(String[] args) {
		int no=6;
		int sum=0;
		for (int i=1; i<no;i++) {
			if (no%i==0) {
				sum=sum+i;
				
			}
		}
      if(sum==no) {
    	  System.out.println("perfect no");
      }
      else {
    	  System.out.println("not a perfect no");
      }
	}

}
