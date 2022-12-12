package methodconcept;

public class T1 {

	public static void main(String[] args) {
		System.out.println("main method");
		// instance method call from same class
		T1 ref = new T1 ();
    	ref.T1();
		
	}
		
		//instance method
		public void T1() {
			System.out.println("instance method");
		

	}

}
