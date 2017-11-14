package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double one=10;
		double two=20;
		double three=40;
		double four=50;
		double five=80;
		double a,b,c,d;
		
		a=one*two/2;
		b=(three+four)/2;
		c=five;
		a=a*6/10;
		b=b*13/100;
		c=c*27/100;
		d=a+b+c;
		System.out.println("평가 점수 : "+d);
		
		if((d<=100)&&(d>=95)) System.out.println("Special Class 입니다!!");
		else if((d<95)&&(d>=90)) System.out.println("Gold Class 입니다!!");
		else if((d<90)&&(d>=85)) System.out.println("Silver Class 입니다!!");
		else if((d<85)&&(d>=80)) System.out.println("Bronze Class 입니다!!");
		else System.out.println("Member 입니다!!"); 
		
		
		
		
	}

}
