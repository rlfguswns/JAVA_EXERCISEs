package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int score=75;
		int a=100;
		int b=90;
		int c=80;
		int d=70;
		int e=60;
		System.out.println("A학점 : "+((score>=90)&&(score<100)));
		System.out.println("B학점 : "+((score>=80)&&(score<=89)));
		System.out.println("C학점 : "+((score>=70)&&(score<=79)));
		System.out.println("D학점 : "+((score>=60)&&(score<=69)));

	}

}
