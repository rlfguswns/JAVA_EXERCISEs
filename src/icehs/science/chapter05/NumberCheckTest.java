package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		a=2*3;
		if((a>=0)&&(a<10)) System.out.println("�� �ڸ� ���Դϴ�.");
		else if((a>=10)&&(a<100)) System.out.println("�� �ڸ� ���Դϴ�.");
		else if(a>=100) System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		else if(a<0) System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		
		a=4*5;
		if((a>=0)&&(a<10)) System.out.println("�� �ڸ� ���Դϴ�.");
		else if((a>=10)&&(a<100)) System.out.println("�� �ڸ� ���Դϴ�.");
		else if(a>=100) System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		else if(a<0) System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		
		a=23*96;
		if((a>=0)&&(a<10)) System.out.println("�� �ڸ� ���Դϴ�.");
		else if((a>=10)&&(a<100)) System.out.println("�� �ڸ� ���Դϴ�.");
		else if(a>=100) System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		else if(a<0) System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		
		a=4*-3;
		if((a>=0)&&(a<10)) System.out.println("�� �ڸ� ���Դϴ�.");
		else if((a>=10)&&(a<100)) System.out.println("�� �ڸ� ���Դϴ�.");
		else if(a>=100) System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		else if(a<0) System.out.println("������ Ȯ������ �ʽ��ϴ�.");
	}

}
