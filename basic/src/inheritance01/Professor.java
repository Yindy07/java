package inheritance01;

public class Professor extends Person{
	
	private String major;
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public void info()
	{
		System.out.println("이름: " + getName() + " 나이: " + getAge() + " 전공: " + major);
	}
	
}
