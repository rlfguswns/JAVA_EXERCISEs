package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySal=1000000;
		int yearSal=12*monthlySal;
		int bonus=monthlySal/5*4;
		int tax=yearSal*10/100;
		int yearSalAfterTax=yearSal-tax;
		int bonusTax=(bonus*55)/1000;
		tax=tax+bonusTax;
		int bonusAfterTax=bonus-bonusTax;
		int totalSal=yearSal+bonus-tax;

		System.out.println("���� : "+yearSal+",  ���� ���� : "+yearSalAfterTax);
		System.out.println("���ʽ� : "+bonus +",  ���� ���ʽ� : "+bonusAfterTax);
		System.out.println("���޾�"+totalSal);

	}

}
