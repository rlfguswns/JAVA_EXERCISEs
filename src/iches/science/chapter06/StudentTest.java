package iches.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student();
		System.out.println(stu1);
		stu1.studentName="ȫ�浿";
		stu1.kor=80;
		stu1.eng=90;
		stu1.math=100;
		System.out.println(stu1.studentName);
		System.out.println(stu1.kor);
		System.out.println(stu1.eng);
		System.out.println(stu1.calculateAverage());
		System.out.println(stu1.math);
		System.out.println(stu1.avg);
	}

}
