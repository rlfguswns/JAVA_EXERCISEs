package iches.science.chapter06;

public class Car {
	int oilAmount;
	double distance;
	
	void addOil(int oil)
	{
		oilAmount+=oil;
		System.out.println("�⸧"+oil+"L��ŭ �����մϴ�.");
	}
	
	void driveCar(String start, String end, double driveDistance)
	{
		oilAmount-=driveDistance/20;
		System.out.println(start+"����"+end+"����"+driveDistance+"km �����Ͽ����ϴ�.");
		distance+=driveDistance;
	}
	
	void printCarInfo()
	{
		
		System.out.println("[ICE ī] ���� �⸧��"+oilAmount+"L, �� ����Ÿ�: "+distance+"km");
	}
	
	double calculateDistance()
	{
		return oilAmount*20.0;
	}
}
