package variableconcept;

public class staticvariable { 
	static int x;
	
	

	public static void main(String[] args) {
		// before update

		System.out.println("value of static variable x is"+ " "+ x);
		
		//afterupdate
		x=30;
		
		System.out.println("value of static variable x is"+ " "+ x);
		//after update
		x=60;

		
		System.out.println("value of static variable x is"+ " "+ x);
	}

}
