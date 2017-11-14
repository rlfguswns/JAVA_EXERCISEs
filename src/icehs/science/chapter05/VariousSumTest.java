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
		System.out.println("1부터 1000까지의 합 : "+a);
		System.out.println("1부터 1000까지 짝수들의 합 : "+b);
		System.out.println("1부터 1000까지 홀수들의 합 : "+c);
	}

}
