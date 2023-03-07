package constructor;

import java.text.DecimalFormat;

public class PartTime {
	//alt + shift + s (게터 세터 자동 완성)
	private String name;
	private int Salary, time, pay;
	
	public PartTime(String name, int time, int pay) {
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSalary() {
		Salary = time*pay;
		DecimalFormat df = new DecimalFormat("###,###");
		String num = df.format(Salary);
		return num;
	}

	
}
