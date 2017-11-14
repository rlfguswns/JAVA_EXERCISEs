package icehs.science.chapter05;

public class SumAndAverageTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		for(int i=1;i<=500;i++)
		{
			s+=i;
		}
		System.out.println("ÇÕ°è : "+s);
		
		double ave=s/500.0;
		System.out.println("Æò±Õ : "+ave);
	}

}
