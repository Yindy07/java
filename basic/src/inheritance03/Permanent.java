package inheritance03;
//class 는 확장형 상속 , 인터페이스는 구현의 상속
public class Permanent extends Employee implements IEmployee{
	//alt + shift + s (게터 세터 자동 완성)
	private int Salary;
	
	public Permanent(String name, int Salary) {
		super(name); //this생성자와 super생성자는 공존할 수 없다.
		this.Salary = Salary;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return Salary;
	}
}
