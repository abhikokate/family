package logicalprogram;

public class Perfectno {

	public static void main(String[] args) {
		int number=7;
		int sum=0;
		
		for(int i=1;i<1;i++) {
			
			if(number%i==0) {
				sum=sum+i;
			}
		}
		if(sum==number) {
			
			System.out.println(" given no is perfect no");
		}
		else {
			
			System.out.println("given no is not perfect no");
		}
	}

}
