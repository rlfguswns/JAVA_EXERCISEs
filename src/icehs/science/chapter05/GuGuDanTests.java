package icehs.science.chapter05;

public class GuGuDanTests {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i%5!=0)
				{
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
			}
			System.out.println();
		}
	}

}
