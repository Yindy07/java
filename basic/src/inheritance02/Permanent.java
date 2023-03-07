package inheritance02;

public class Permanent extends Employee{
	//alt + shift + s (게터 세터 자동 완성)
	private int Salary;
	
	public Permanent(String name, int Salary) {
		super(name); //this생성자와 super생성자는 공존할 수 없다.
		this.Salary = Salary;
	}
	
	
	@Override
	public int getSalary() {
		return Salary;
	}
}
