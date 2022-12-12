package logicalprogram;

public class Primeno {

	public static void main(String[] args) {
		int number=10;
		int y=0;
		
		for(int i=2;i<=number-1;i++) {
			
			if(number%i==0) {
			y=y+1;
		}
	}	
			if(y>0) {
				
				System.out.println("given number is not prime no");
				
			}
			else {
				
				System.out.println("given no is prime no");
			}
		}

	}


