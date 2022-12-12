package methodconcept;
//use of 3 variable inside instance method

public class T4 {
	static int y= 20;
	int x= 10;
	public void m2 () {
		System.out.println(y);
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		// instance method call from same class
		T4 ref = new T4 ();
		ref.m2 ();

	}

}
