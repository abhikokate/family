package logicalprogram;

public class Lengthofnumber {

	public static void main(String[] args) {
	   
		int number=1234567;
		int length=0;
		
		while(number!=0) {
			
			number=number/10;
			length=length+1;
		}

		System.out.println("length of no is" + length);
	}

}
