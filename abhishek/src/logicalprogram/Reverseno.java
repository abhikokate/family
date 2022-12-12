package logicalprogram;

public class Reverseno {

	public static void main(String[] args) {
		int number=12345;
		int reminder=0;
		int reverseno=0;
		
		 while(number!=0) {
			 
			 reminder=number%10;
			 reverseno=reverseno*10+reminder;
			 number=number/10;
			 
		 }
		 System.out.println(reverseno);
	}

}
