package method1;

public class Sub{
	//접근제어자 : private default protected public
	//private : 클래스 ㄴ ㅐ 에서만 접근 가능 | public = 어디서든 접근 가능 | default = 아무것도 적지 않는다. protected:상속이라는 것을 전제하에 사용(부모 자식과의 접근 시 사용)
	//예약어 : 접근제어자, static, return, 반환자료형(void, 모든 자료형들), final(처음 초기 값을 넣고 그 이후 데이터를 가져가기 위한 목적 상수라는 뜻|데이터 변경이 안됨)
	//, this(자기 자신 인스턴스 참조값), super(부모 인스턴스 참조값)
	// class이름에 소괄호 : 생성자를 호출하는 행위 Ex)Random 변수명 = new Random() <<
	
	//맴버필드, 맴버변수
	private String name;
	//private Integer age;
	
	public Sub() //기본생성자 | 입력 받는 생성자가 있으면 기본 생성자는 안만들어진다
	{	
		
	}
	// 생성자 : class이름과 같아야 하며 , 반환자료형이 없다 | 클래스가 인스턴스로 되면서부터 한번 실행된다.
	public Sub(String name)
	{	
		this.name = name;
		System.out.println(this.name + name);
	}
	
	//메서드
	public void method01()		//메서드명(매개변수, 매개변수) parameter
	{		
		System.out.println("sub class 안에 method01 실행");	
	}
	public void method02()
	{
		System.out.println("sub class 안에 method02 실행");
	}
	public void method02(int data)
	{
		System.out.println("int method02 실행");
	}
	public void method02(String data)
	{
		System.out.println("String method02 실행");
	}
	public void method02(String data, int data2)
	{
		System.out.println("String, int method02 실행");
	}
	public void method02(int data, String data2)			//메서드명이 같더라도 매개변수 자료형으로 구분한다. 자료형이 다르면 사용 가능 변수명은 관여x
	{
		System.out.println("int, String method02 실행");
	}
	public void method02(int data, double data2)
	{
		System.out.println("int, double method02 실행");
	}
	public static void method03() // 프로그램 시작과 동시 메모리에 올라가있음 아무때나 바로 사용 가능 static
	{	
		System.out.println("sub class 안에 method03 실행");
	}
	//메서드 안에 메서드 입력 x class 하위에만 입력 가능
}

