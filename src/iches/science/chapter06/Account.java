package iches.science.chapter06;

public class Account {
	String owner;
	String acnum;
	int money;
	
	void deposit(int extramoney)
	{
		money+=extramoney;
	}
	void withdraw(int extramoney)
	{
		money-=extramoney;
	}
	
	void accountInfo()
	{
		System.out.println("������ �̸� : "+owner);
		System.out.println("���¹�ȣ : "+acnum);
		System.out.println("���¿� �����ִ� �ݾ��� "+money+"�� �Դϴ�.");
	}
	
	int getmoney()
	{
		return money;
	}
}
