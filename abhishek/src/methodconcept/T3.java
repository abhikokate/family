package methodconcept;
// USE OF 3 VARIABLE ( static, instance) inside static method
   // static variable static method
public class T3 {
	static int y= 20;
	int x= 10;
	
	//static method
	public static void m2() {

		System.out.println(y);
		System.out.println("static method");
	}

	public static void main(String[] args) {
		// instance method call from same class
		T3 ref =new T3();
		T3.m2();
		

	}

}
