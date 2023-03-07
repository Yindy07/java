package inheritance03;

//추상클래스 : 추상메서드를 갖고 있는 클래스
//public abstract class : 추상클래스
public class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	//메서드 -> 추상메서드
	

//	public int getSalary(); // 추상메서드(자식이 무조건 정의해야한다/생략하면 안된다) 내용이 없다.
}
