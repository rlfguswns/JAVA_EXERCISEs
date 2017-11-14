package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Dong=92;
		int Soon=85;
		
		if((Dong<=100)&&(Dong>=90))
		{
			System.out.println("홍길동 : A학점 입니다.");
		}
		else
		{
			System.out.println("홍길순 : A학점을 받지 못했습니다.");
		}
		
		if((Soon<=100)&&(Soon>=90))
		{
			System.out.println("홍길순 : A학점 입니다.");
		}
		else
		{
			System.out.println("홍길순 : A학점을 받지 못했습니다.");
		}
	}

}
