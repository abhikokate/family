package loopconcept;

public class A12 {


	//1-100 PRIME NO
	public static void main(String[] args) {
	
		for(int x=2; x<=100;x++) {
	int z=0;
			for (int y=1; y<=x;y++) {
				if (x%y==0) {
				z++;
			}
		}
          if(z==2) {
        	  System.out.print(x + " |");
          }
    }
	}

}
