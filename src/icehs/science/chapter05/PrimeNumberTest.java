package icehs.science.chapter05;
import java.util.Scanner;
public class PrimeNumberTest {

	public static void main(String[] args) {
		int a,b;
		int i=2;
		do
		{
			System.out.println("�Ҽ����� �����ϰ� ���� ���ڸ� �Է��ϼ��� : ");
			a=getUserInput();
			while(a%i!=0)
			{
				++i;
			}
			if(i==a) System.out.println(a+"�� �Ҽ��Դϴ�.");
			else System.out.println(a+"�� �Ҽ��� �ƴմϴ�.");
			System.out.println("==========================");
			System.out.println("�ٽ� �Ͻðڽ��ϱ�? �� �ϽǰŸ� 1�� �׸��ϽǰŸ� 2�� �����ּ���.");
			System.out.println("(1) yes           (2)no");
			b=getUserInput();
		}while(b!=2);
		System.out.println("�̿��� �ּż� �����մϴ�.");

		
		/*i=2;
		while(b%i!=0)
		{
			++i;
		}
		if(i==b) System.out.println(b+"�� �Ҽ��Դϴ�.");
		else System.out.println(b+"�� �Ҽ��� �ƴմϴ�.");*/
	}
	public static int getUserInput()
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
