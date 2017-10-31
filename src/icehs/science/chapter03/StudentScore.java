package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		double mathScore=94.7;
		double englishScore=83.2;
		double koreanScore=87.1;
		
		int intms= (int)mathScore;
		int intes= (int)englishScore;
		int intks= (int)koreanScore;
		
		System.out.println(" 수학: " +intms);
		System.out.println(" 영어: " +intes);
		System.out.println(" 국어: " +intks);

	}

}
