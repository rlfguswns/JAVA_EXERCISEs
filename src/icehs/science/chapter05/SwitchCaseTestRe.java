package icehs.science.chapter05;

public class SwitchCaseTestRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=10;
		int second=20;
		int third=40;
		int fourth=50;
		int fifth=80;
		
		double result = first*second/2*0.6;
		result += (third+fourth)/2*0.13;
		result += fifth*0.27;
		System.out.println("�� ���� : "+result);
		int intResult=(int)result/10;
		switch(intResult)
		{
		case 9: System.out.println("Special Class �Դϴ�."); break;
		case 8: System.out.println("Gold Class �Դϴ�."); break;
		case 7: System.out.println("Silver Class �Դϴ�."); break;
		case 6: System.out.println("Bronze Class �Դϴ�."); break;
		default: System.out.println("Member Class �Դϴ�.");
		}
	}

}
