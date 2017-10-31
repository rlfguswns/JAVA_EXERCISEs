package icehs.science.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		long bill = 7000000000L;
		System.out.println("Original Value :" +bill);
		double doubleBill=bill;
		System.out.println("double형으로 변환 :" +doubleBill);
		int intBill = (int) bill;
		System.out.println("int형으로 강제변환 :" +intBill);

	}

}
