package icehs.science.chapter05;
import java.util.Scanner;
public class PrimeNumberTest {

	public static void main(String[] args) {
		int a,b;
		int i=2;
		do
		{
			System.out.println("소수인지 판정하고 싶은 숫자를 입력하세요 : ");
			a=getUserInput();
			while(a%i!=0)
			{
				++i;
			}
			if(i==a) System.out.println(a+"은 소수입니다.");
			else System.out.println(a+"은 소수가 아닙니다.");
			System.out.println("==========================");
			System.out.println("다시 하시겠습니까? 더 하실거면 1을 그만하실거면 2를 눌러주세요.");
			System.out.println("(1) yes           (2)no");
			b=getUserInput();
		}while(b!=2);
		System.out.println("이용해 주셔서 감사합니다.");

		
		/*i=2;
		while(b%i!=0)
		{
			++i;
		}
		if(i==b) System.out.println(b+"은 소수입니다.");
		else System.out.println(b+"은 소수가 아닙니다.");*/
	}
	public static int getUserInput()
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
