package iches.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco= new Chocolate();
		choco.name="�Ƹ�����";
		choco.type="��ũ";
		choco.price=2200;
		choco.printChocolateInfo();
		int totalPrice = choco.calculateTotalPrice(20);
		System.out.println(choco.name+"���ݷ� 20��: "+totalPrice+"��");
		choco.changeChocolateInfo("ī�� �⸮��", 2500);
		

	}

}
