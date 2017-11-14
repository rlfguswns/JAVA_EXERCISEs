package icehs.science.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int sum=0;
		int i=1;
		while(sum<100)
		{
			number=5*i;
			sum+=number;
			
			System.out.println(i++ +". (+" +number+")" +sum);
		}
	}

}
