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
		System.out.println("예금주 이름 : "+owner);
		System.out.println("계좌번호 : "+acnum);
		System.out.println("계좌에 남아있는 금액은 "+money+"원 입니다.");
	}
	
	int getmoney()
	{
		return money;
	}
}
