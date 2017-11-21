package icehs.science.chapter05;

public class ChangeWhileTest {

	public static void main(String[] args) {
		int i=1,j=1;
		while(i<=10)
		{
			while(j<=i)
			{

				System.out.print("*");
				j++;
			}
				i++;
				System.out.println();
				j=1;
		}


	}

}
