package iches.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco= new Chocolate();
		choco.name="아마도라";
		choco.type="다크";
		choco.price=2200;
		choco.printChocolateInfo();
		int totalPrice = choco.calculateTotalPrice(20);
		System.out.println(choco.name+"초콜렛 20개: "+totalPrice+"원");
		choco.changeChocolateInfo("카페 기리쉬", 2500);
		

	}

}
