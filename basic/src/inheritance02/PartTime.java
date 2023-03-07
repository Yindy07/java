package inheritance02;

//import java.text.DecimalFormat;

public class PartTime extends Employee{
	//alt + shift + s (게터 세터 자동 완성)
	private int time, pay;
	public PartTime(String name, int time, int pay) {
		super(name);//부모 생성자 호출 매개변수 이상의 값을 나열해야한다.
		this.time = time;
		this.pay = pay;
	}
	
//	public String getSalary() {
//		Salary = time*pay;
//		DecimalFormat df = new DecimalFormat("###,###");
//		String num = df.format(Salary);
//		return num;
//	}
	@Override
	public int getSalary() {
		return time*pay;
	}
	
}
