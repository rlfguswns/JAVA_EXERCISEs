package icehs.science.chapter05;
import java.util.Scanner;
public class DutchCalculator {

	public static void main(String[] args) {
		int a,b,c;
		int sum=0;
		System.out.print("������ �� ������ ����Ǿ�����?");
		int number=getUserInput();
		System.out.println("=========================");
		System.out.println("�� �������� �� ����� �Է��ϼ���.");
		for(int i=1;i<=number;i++)
		{

			System.out.print(i+"�� ��� : ");
			a=getUserInput();
			sum+=a;
		}
		System.out.println("�� ����� "+sum+"�� �Դϴ�.");
		System.out.println("=========================");
		System.out.print("������ �ο����� �Է��ϼ���.");
		b=getUserInput();
		System.out.println("=========================");
		c=sum/b;
		System.out.println("��ġ���� �ݾ���?");
		for(int j=1;j<=(b-1);j++)
		{
			System.out.println(j+" : "+c);
		}
		c=sum-c*(b-1);
		System.out.println(b+" : "+c);
	}
	public static int getUserInput()
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
