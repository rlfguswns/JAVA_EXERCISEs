package icehs.science.chapter04;

public class AndOrOperation {

	public static void main(String[] args) {
		int a=15;
		int b=16;
		System.out.println(a <= b);
		System.out.println( a == b);
		
		System.out.println((a <= b)&&( a == b));
		System.out.println((a >= b)&( a == ++b));
		System.out.println((a >= b)&&( ++a == b));
		System.out.println(a);
		System.out.println(b);
	}

}
