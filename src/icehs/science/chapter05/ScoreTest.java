package icehs.science.chapter05;
import java.util.Scanner;
public class ScoreTest {

	public static void main(String[] args) {
		System.out.print("���� �л�����?");
		int stuNo=getUserInput();
		int scoreSum=0;
		for(int i=1;i<=stuNo;i++)
		{
			System.out.print(i+"�� ������?");
			scoreSum += getUserInput();
		}
		System.out.println(stuNo+"���� ���� : "+scoreSum);
		System.out.println(stuNo+"���� ��� " +(double)scoreSum/stuNo);

	}
	public static int getUserInput()
	{
		Scanner sc = new Scanner(System.in);
		int input= sc.nextInt();
		return input;
	}

}
