package java0416;

public class Student {
	//인스턴스 변수를 선언
	//public이 붙으면 클래스 안에서도 사용할 수 있고
	//인스턴스를 만들어서 인스턴스를 이용해서 사용이 가능
	public int num;
	public String name;
	public int koreaScore;
	public int mathScore;
	public int engScore;
	
	//합계를 구해서 리턴하는 메소드
	public int sum() {
		int total = koreaScore + mathScore + engScore;
		//System.out.println("세 과목의 합계: " + total );
		return total;
	}
	//3개의 정수를 받아서 kor, eng, mat에 대입하는 메소드
	public void set(int n1, int n2, int n3) {
		koreaScore = n1;
		mathScore = n2;
		engScore = n3;
	}
	//학교 이름을 저장하기 위한 변수
	static public String schoolName = "환일고등학교";


	public void disp() {
		System.out.println("번호: " + num);
		System.out.println("이름: " + name);
		System.out.println("국어점수: " + koreaScore);
		System.out.println("영어점수: " + mathScore);
		System.out.println("수학점수: " + engScore);
		System.out.println("학교이름: " + schoolName);
	}
}