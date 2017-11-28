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
		System.out.println("이름 " + studentName );
		System.out.println("학번 " + studentId );
		System.out.println("국어 성적 " + kor );
		System.out.println("영어 성적" + eng );
		System.out.println("수학 성적 " + math );
	}
	public void changeStudentId(String newId){
		studentId=newId;
	}
}
