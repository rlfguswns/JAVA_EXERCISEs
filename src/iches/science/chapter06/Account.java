package iches.science.chapter06;

public class Account {
	String owner;
	String acnum;
	int money;
	
	void deposit(int extramoney)
	{
		if(extramoney <0)
		{
			System.out.println("[����] �ݾ��� ������ �� �� �����ϴ�.");
		}
		else {
		System.out.println(extramoney+"���� �Ա��մϴ�.");	
		money+=extramoney;
		}
		System.out.println("�ܾ�: "+getmoney()+"��");
	}
	void withdraw(int extramoney)
	{
		if(extramoney <0)
		{
			System.out.println("[����] �ݾ��� ������ �� �� �����ϴ�.");
		}
		else if(money<extramoney)
		{
			System.out.println("[����] �ܾ��� �����մϴ�.");
		}
		else {
		System.out.println(extramoney+"���� ����մϴ�.");
		money-=extramoney;
		}
		System.out.println("�ܾ�: "+getmoney()+"��");
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
