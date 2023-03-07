package inheritance01;
//(상속받을 클래스명) extends (상속주는 클래스명)
public class Employee extends Person{
	String dept;
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void info()
	{
		System.out.println("이름: " + super.getName() + " 나이: " + getAge() + " 부서: " + dept);
	}
}
