package constructor;

public class Student {
	//alt + shift + s (게터 세터 자동 완성)
	private String name;
	private int kor, eng, math;
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	public double getAverage() {
		//String result = String.format("%.2f",getTotal()/3.0); private int result2 = Double.parseDouble(result); return result2;
		return (double)getTotal()/3;
	}
	
}
