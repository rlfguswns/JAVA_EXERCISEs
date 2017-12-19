package iches.science.chapter06;

public class Account {
	String owner;
	String acnum;
	int money;
	
	void deposit(int extramoney)
	{
		if(extramoney <0)
		{
			System.out.println("[에러] 금액은 음수가 될 수 없습니다.");
		}
		else {
		System.out.println(extramoney+"원을 입금합니다.");	
		money+=extramoney;
		}
		System.out.println("잔액: "+getmoney()+"원");
	}
	void withdraw(int extramoney)
	{
		if(extramoney <0)
		{
			System.out.println("[에러] 금액은 음수가 될 수 없습니다.");
		}
		else if(money<extramoney)
		{
			System.out.println("[에러] 잔액이 부족합니다.");
		}
		else {
		System.out.println(extramoney+"원을 출금합니다.");
		money-=extramoney;
		}
		System.out.println("잔액: "+getmoney()+"원");
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
