package methodconcept;

public class Demo2 {

	public static void main(String[] args) {
		Demo.t1();
		
		Demo var=new Demo();
		var.t2();

		Demo.t3(10, 30);
		System.out.println(Demo.t3(10, 30));
	}

}
