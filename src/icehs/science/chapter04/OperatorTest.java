package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int a=64;
		System.out.println("¦���Դϱ�? : "+(a%2==0));
		System.out.println("3�� ����Դϱ�? : "+(a%3==0));
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : "+((a%2==0)&&(a%7==0)));
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : "+((a%2==0)||(a%7==0)));

	}

}
