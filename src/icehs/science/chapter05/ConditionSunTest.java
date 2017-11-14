package icehs.science.chapter05;

public class ConditionSunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		for(int i=1;i<=30;i++)
		{
			if((i%2==1)&&(i%3!=0)) s+=i;
		}
		System.out.println(s);
	}
}
