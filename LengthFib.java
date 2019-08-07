package hello.world;
import java.util.Scanner;

public class LengthFib {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		byte a = scan.nextByte();
		short b = scan.nextByte();
		int c;
		long d;
		float e;
		double f;
		
		c = a + b;
		d = b + c;
		e = c + d;
		f = d + e;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	
	}

}
