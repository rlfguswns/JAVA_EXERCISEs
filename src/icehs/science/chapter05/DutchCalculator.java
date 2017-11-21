package icehs.science.chapter05;
import java.util.Scanner;
public class DutchCalculator {

	public static void main(String[] args) {
		int a,b,c;
		int sum=0;
		System.out.print("모임이 몇 차까지 진행되었나요?");
		int number=getUserInput();
		System.out.println("=========================");
		System.out.println("각 차수에서 쓴 비용을 입력하세요.");
		for(int i=1;i<=number;i++)
		{

			System.out.print(i+"차 비용 : ");
			a=getUserInput();
			sum+=a;
		}
		System.out.println("총 비용은 "+sum+"원 입니다.");
		System.out.println("=========================");
		System.out.print("모임의 인원수를 입력하세요.");
		b=getUserInput();
		System.out.println("=========================");
		c=sum/b;
		System.out.println("더치페이 금액은?");
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
