package java0416;

public class InstanceVariable {

	public static void main(String[] args) {
		//Student1 클래스의 인스턴스를 생성
		//클래스이름 변수명 = new 클래스이름();
		Student obj1 = new Student();
		//인스턴스를 이용해서 프로퍼티 접근
		obj1.num = 1;
		obj1.name = "배기훈";
		//obj1.schoolName = "한성고등학교";
//		obj1.koreaScore = 100; 
//		obj1.mathScore = 99;
//		obj1.engScore = 98;
		obj1.set(100, 98, 99);
		
		//다른 인스턴스 생성
		Student obj2 = new Student();
		obj2.num = 2;
		obj2.name = "임성현";
		//obj2.schoolName = "송곡고등학교";
		obj2.koreaScore = 1;
		obj2.mathScore = 2;
		obj2.engScore = 3;
		
		//Student1.schoolName = "환일고등학교";
		//클래스 안에 static 없이 만들어진 변수는 인스턴스마다 별도로 생성 -프로퍼티
		obj1.disp();
		obj1.sum();
		obj2.disp();
		obj2.sum();
		
		//정수를 리턴하는 메소드를 호출
		//메소드의 호출 결과를 다른 변수에 저장
		int total = obj1.sum();
		double avg = total/ 3.0;
		System.out.println("합계 : "+total+" 평균: "+avg);
		int total1 = obj2.sum();
		double avg1 = total1/ 3.0;
		System.out.println("합계 : "+total1+" 평균: "+avg1);
		
	}

}
