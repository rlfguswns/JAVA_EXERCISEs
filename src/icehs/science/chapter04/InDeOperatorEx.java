package icehs.science.chapter04;

public class InDeOperatorEx {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		System.out.println(++a);
		System.out.println(++b);
		
		int result = --a+b--;
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
	}

}
