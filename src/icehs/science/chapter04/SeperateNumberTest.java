package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int a=456;
		int b=a/100;
		int c=(a-100*b)/10;
		int d=a-b*100-c*10;
		
		System.out.println("���� :"+a);
		System.out.println("���� �ڸ��� : "+b);
		System.out.println("���� �ڸ��� : "+c);
		System.out.println("���� �ڸ��� : "+d);

	}

}
