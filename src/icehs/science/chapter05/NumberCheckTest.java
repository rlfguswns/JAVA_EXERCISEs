package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		a=2*3;
		if((a>=0)&&(a<10)) System.out.println("한 자리 수입니다.");
		else if((a>=10)&&(a<100)) System.out.println("두 자리 수입니다.");
		else if(a>=100) System.out.println("세 자리 수 이상입니다.");
		else if(a<0) System.out.println("음수는 확인하지 않습니다.");
		
		a=4*5;
		if((a>=0)&&(a<10)) System.out.println("한 자리 수입니다.");
		else if((a>=10)&&(a<100)) System.out.println("두 자리 수입니다.");
		else if(a>=100) System.out.println("세 자리 수 이상입니다.");
		else if(a<0) System.out.println("음수는 확인하지 않습니다.");
		
		a=23*96;
		if((a>=0)&&(a<10)) System.out.println("한 자리 수입니다.");
		else if((a>=10)&&(a<100)) System.out.println("두 자리 수입니다.");
		else if(a>=100) System.out.println("세 자리 수 이상입니다.");
		else if(a<0) System.out.println("음수는 확인하지 않습니다.");
		
		a=4*-3;
		if((a>=0)&&(a<10)) System.out.println("한 자리 수입니다.");
		else if((a>=10)&&(a<100)) System.out.println("두 자리 수입니다.");
		else if(a>=100) System.out.println("세 자리 수 이상입니다.");
		else if(a<0) System.out.println("음수는 확인하지 않습니다.");
	}

}
