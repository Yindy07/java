package method2;

public class Max {
	private int num1, num2;

	public int getData1() {
		return num1;
	}

	public void setData1(int num1) {
		this.num1 = num1;
	}

	public int getData2() {
		return num2;
	}

	public void setData2(int num2) {
		this.num2 = num2;
	}
	public int largeNumber(){
		if(num1>num2) return num1;  //max = num1 num1>num2 return max else max=num2 return max;
		else return num2;
	}
	
}
