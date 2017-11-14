package icehs.science.chapter05;

public class GuGuDanTests {

	public static void main(String[] args) {
		int a;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				a=i*j;
				System.out.print(i+"*"+j+"="+a);
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
