package firstclass;

public class Class1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 23;
		int y = 50;
		long zz = 82173;
		
		float f1 = (float)1.2;
		float f2 = (float)1.1;
		double d1 = 1.0;
		double d2 = 1.2;
		
		char c = 'a';
		
		x = c;
		zz = x;
		x = (int)zz;
		
		System.out.print(x);
		
		if(x == 10) {
			System.out.println("x is eq to 10");
		} else if(x > 10) {
			System.out.println("hello!");
			System.out.println("x is gr than 10");
		} else {
			System.out.println("x is lt 10");
		}
		
		// loops
		//for
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
	
		// while
		int j = 0;
		while(j<10) {
			System.out.println(j);
			j++;
		}
		
		// do-while
		j=0;
		do {
			System.out.println(j);
			j++;
		} while(j<10);
		

		
		
	}

}












