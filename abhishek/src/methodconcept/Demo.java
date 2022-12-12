package methodconcept;

public class Demo {
	//instance method call in main method
	int x = 10;
	static int y;
	
	public static void main(String[] args) {
	
		Demo var = new Demo();
		int z=var.x;
		System.out.println(z);
		//static variable call in main method
	int y=20;
	System.out.println(y);
	t1();
	var.t2();
	t3(10,30);
	System.out.println(t3(10,30));
	
	}
      //static method
	//instance variable to static method
	public static void t1() {
		Demo var=new Demo();
		
		int p=var.x+y;
		System.out.println(p);
	}
	//instatic method
	   public void t2() {
		   System.out.println(x);
	   }
	   //static method
	   public static int t3(int i,int j) {
		   int sum=i+j;
		   return sum;
	   }
	}

