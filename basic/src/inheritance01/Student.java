package inheritance01;

public class Student extends Person{
	
	private String subject;
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void info()
	{
		System.out.println("이름: " + getName() + " 나이: " + getAge() + " 과목: " + subject);
	}
}
