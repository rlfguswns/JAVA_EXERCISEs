package iches.science.chapter06;

public class StudentTest2 {

	public static void main(String[] args) {
		Student stu2 = new Student();
		stu2.studentName = "ȫ�浿";
		stu2.changeStudentId("S001");
		stu2.kor=94;
		stu2.eng=80;
		stu2.math=89;
		stu2.changeStudentId("STU0001");
		stu2.calculateAverage();
		stu2.printStudentInfo();
		
		System.out.println(stu2.studentName);
		System.out.println(stu2.kor);
		System.out.println(stu2.eng);
		System.out.println(stu2.math);
		System.out.println(stu2.calculateAverage());
		System.out.println(stu2.avg);
		
	}

}
