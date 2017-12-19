package iches.science.chapter06;

public class AccountTest {

	public static void main(String[] args) 
	{
		Account acc1 = new Account();
		acc1.acnum="123-45-67890";
		acc1.owner="ȫ�浿";
		acc1.money=10000;
		acc1.accountInfo();
		acc1.deposit(20000);
		acc1.deposit(45000);
		acc1.withdraw(-20000);
		acc1.withdraw(45000);
	}

}
