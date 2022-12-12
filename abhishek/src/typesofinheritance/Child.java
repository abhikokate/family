package typesofinheritance;
// single level inheritance

public class Child extends Parent {
      public void job() {
    	  System.out.println("job");
      }
	public static void main(String[] args) {
		 
		Child i= new Child();
		i.house();
		i.land();
		 i.car();
		 i.job();
        
	}

}
