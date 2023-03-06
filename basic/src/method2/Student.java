package method2;

public class Student {
	//alt + shift + s (게터 세터 자동 완성)
	private String name;
	private int kor, eng, math;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int Math) {
		this.math = Math;
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
