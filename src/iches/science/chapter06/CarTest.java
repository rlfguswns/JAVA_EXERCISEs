package iches.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car c1= new Car();
		c1.oilAmount=5;
		c1.distance=140.0;
		c1.printCarInfo();
		c1.addOil(10);
		c1.printCarInfo();
		c1.driveCar("IT����", "��õ����", 10.17);
		c1.printCarInfo();
		c1.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		c1.printCarInfo();
		System.out.println("���డ�� �Ÿ��� ��"+c1.calculateDistance()+"�Դϴ�.");

	}

}
