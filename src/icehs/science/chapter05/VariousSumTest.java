package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		for(int i=1; i<=1000;i++)
		{
			a+=i;
			if(i%2==0) b+=i;
			else c+=i;
		}
		System.out.println("1���� 1000������ �� : "+a);
		System.out.println("1���� 1000���� ¦������ �� : "+b);
		System.out.println("1���� 1000���� Ȧ������ �� : "+c);
	}

}
