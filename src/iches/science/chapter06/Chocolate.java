package iches.science.chapter06;

public class Chocolate {

		String name;
		String type;
		int price;
		
		String getName() {
			return name;
		}
		int calculateTotalPrice(int count)
		{
			return price*count;
		}
		
		void changeChocolateInfo(String newName, int newPrice)
		{
			name=newName;
			price=newPrice;
			printChocolateInfo();
		}
		void printChocolateInfo()
		{
			System.out.println("�̸�: "+ name +", ����: "+type+", ����:"+price);
		}
	
}
