package constructor;

public class Permanent {
	//alt + shift + s (게터 세터 자동 완성)
	private String name;
	private int Salary;
	
	public Permanent(String name, int Salary) {
		this.name = name;
		this.Salary = Salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return Salary;
	}
	
}
