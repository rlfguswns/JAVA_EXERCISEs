package icehs.science.chapter04;

import java.util.*;

public class NumberCheckTestRe {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("ù��° ���� �Է��ϼ���.");
		int first=getUserInput();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		int second=getUserInput();
		int a=first*second;
		if(a>=100) System.out.println("�� �ڸ��� �̻��Դϴ�.");
		else if(a>=10) System.out.println("�� �ڸ� ���Դϴ�.");
		else if(a>=0) System.out.println("�� �ڸ� ���Դϴ�.");
		else System.out.println("������ ������� �ʽ��ϴ�.");
		

	
	}
	public static int getUserInput()
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
