package iches.science.chapter06;

public class Student {
	String studentName;
	String studentId;
	int kor;
	int eng;
	int math;
	double avg;
	
	public double calculateAverage() {
		avg=(kor+eng+math)/3.0;
		return avg;
	}
	
	public void printStudentInfo() {
		System.out.println("�̸� " + studentName );
		System.out.println("�й� " + studentId );
		System.out.println("���� ���� " + kor );
		System.out.println("���� ����" + eng );
		System.out.println("���� ���� " + math );
	}
	public void changeStudentId(String newId){
		studentId=newId;
	}
}
