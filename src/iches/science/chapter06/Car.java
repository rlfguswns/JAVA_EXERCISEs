package iches.science.chapter06;

public class Car {
	int oilAmount;
	double distance;
	
	void addOil(int oil)
	{
		oilAmount+=oil;
		System.out.println("기름"+oil+"L만큼 주유합니다.");
	}
	
	void driveCar(String start, String end, double driveDistance)
	{
		oilAmount-=driveDistance/20;
		System.out.println(start+"에서"+end+"까지"+driveDistance+"km 주행하였습니다.");
		distance+=driveDistance;
	}
	
	void printCarInfo()
	{
		
		System.out.println("[ICE 카] 남은 기름양"+oilAmount+"L, 총 주행거리: "+distance+"km");
	}
	
	double calculateDistance()
	{
		return oilAmount*20.0;
	}
}
