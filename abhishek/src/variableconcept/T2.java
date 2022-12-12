package variableconcept;

public class T2 {
	//global variable
	//instance variable
	int x=30;
	

	public static void main(String[] args) {
		// create first object
		T2 ref= new T2();
		//create second object
		T2 ref1= new T2();
		ref1.x=40;

		System.out.println("First object of x-" + ref.x);
		System.out.println("Second object of x-" + ref1.x);

	}

}
