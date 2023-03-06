package method2;

public class Absolute {
	private int num;

	public int getData() {
		return num;
	}

	public void setData(int num) {
		this.num = num;
	}

	public int absolute(){
		int result = num;
		if(num<0) result*=-1;
		
		return result;
	}
	
}
