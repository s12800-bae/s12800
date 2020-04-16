package java0416;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone 클래스의 인스턴스를 생성
		Phone obj1 = new Phone();
		//인스턴스를 이용해서 데이터 대입
		obj1.setNum(1);
		obj1.setName("배기훈");
		obj1.setPhoneNumber("01020066576");
		obj1.setEmail("rlgns1129@naver.com");
		//name을 가져와서 출력
		System.out.println("이름: " + obj1.getName());
		//변수에 직접 접근하는 것은 안됩니다.
		
		//Phone 클래스에 만든 static 메소드 호출
		Phone.staticMethod();
		
	}

}
