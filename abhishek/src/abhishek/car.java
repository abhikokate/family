package abhishek;

public class car {
	String maker="BMW";
	int drive=4;
	String colour="red";

	//Action method
	public void skidding() {
	System.out.println( maker + " is skidding ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

//object creates
{
	car referencevar=new car();
	
	
	referencevar.skidding();
	
} 

}
}