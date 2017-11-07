package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int a=456;
		int b=a/100;
		int c=(a-100*b)/10;
		int d=a-b*100-c*10;
		
		System.out.println("숫자 :"+a);
		System.out.println("백의 자리수 : "+b);
		System.out.println("십의 자리수 : "+c);
		System.out.println("일의 자리수 : "+d);

	}

}
