package java0416;

public class Phone {
	//전화번호부 만들어보기
	//(분류할수있는)번호, 이름, 전화번호 , 이메일
	
	//데이터를 저장할 변수는 인스턴스가 직접 접근할 수 없도록
	//private으로 생성
	private int num;
	private String name;
	private String phoneNumber;
	private String email;
	
	//인스턴스가 변수를 사용할 수 있도록 해주는 접근자 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// static 메소드 - 인스턴스 변수 사용 못함
	public static void staticMethod() {
		//System.out.println(email); (에러)
		
		//인스턴스 변수는 사용 못하지만
		//지역변수를 생성해서 사용하는 것은 가능
		String msg = "Static Method";
		System.out.println(msg);
	}
	

}
