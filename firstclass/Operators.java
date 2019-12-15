package firstclass;
import java.util.Scanner;

public class Operators {
	public static int max(int x, int y) {
//		if(x > y) {
//			return x;
//		}
//		return y;
		
		//result = (condition) ? (statement1) : (statement2);
		// ter operator
		return (x > y) ? x : y;
	}
	
	public static int max3(int x, int y, int z) {
		// returns max of x, y, z
		return (x > y) ? (x > z ? x : z) : (y > z  ? y : z);
	}
	
	public static void printPattern(int n) {
		// todo
		int counter=1;
		for(int curRow=1; curRow<=n; curRow++) {
			// logic for each row
			for(int j=1; j<=curRow; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}
	
	public static void printPattern2(int n) {
		int counter=1;
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = 0;
			for(int j=1; j<=i; j++) {
				System.out.print(sum + counter);
				sum = sum + counter;
				counter++;
			}
			System.out.println();
		}
	}
	
	public static int takeInput() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		return x;
	}
	
	public static int takeInput(Scanner sc) {
		int x = sc.nextInt();
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// operators
		// Arithmetic
		// + - * / %
		// comparison >, <, >=, <=, ==
		
		// bitwise & | ^ ~
		
		// Maximum of 3 numbers
		
		int x=2, y=2, z=3;
		int largest = x;
		if(y > largest) {
			largest = y;
		} 
		if(z > largest) {
			largest = z;
		}
		System.out.println(largest);
		largest = max(x, max(y, z));
		System.out.println(largest);
		System.out.println(max3(x, y, z));
		
		// && || !
		if(x == 2 && y == 2) {
			
		}

		printPattern(4);
		printPattern2(4);
		
		// taking input!
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		String str = sc.next();
		System.out.println(str);

		
		// error - do not use
//		int a = takeInput();
//		System.out.println(a);
	
		a = takeInput(sc);
		System.out.println(a);
		a = takeInput(sc);
		System.out.println(a);
		
		sc.close();
	}

}






