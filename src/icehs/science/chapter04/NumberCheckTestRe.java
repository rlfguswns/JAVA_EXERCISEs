package icehs.science.chapter04;

import java.util.*;

public class NumberCheckTestRe {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("첫번째 수를 입력하세요.");
		int first=getUserInput();
		System.out.println("두번째 수를 입력하세요.");
		int second=getUserInput();
		int a=first*second;
		if(a>=100) System.out.println("세 자리수 이상입니다.");
		else if(a>=10) System.out.println("두 자리 수입니다.");
		else if(a>=0) System.out.println("한 자리 수입니다.");
		else System.out.println("음수는 취급하지 않습니다.");
		

	
	}
	public static int getUserInput()
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
