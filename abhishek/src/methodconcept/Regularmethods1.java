package methodconcept;

public class Regularmethods1 {
static int var;
	public static void main(String[] args) {
		System.out.println("main start");
		// static method call from same class
		summation(20,20);
		//System.out.println("static regular method");

	}
//static regular method
	public static void summation(int x,int y){
		var=x+y;
		System.out.println(var);
	}
	

}
