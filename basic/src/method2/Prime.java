package method2;

public class Prime {
	private int num1;

	public int getData() {
		return num1;
	}

	public void setData(int num1) {
		this.num1 = num1;
	}
	public boolean isPrime()
	{
		boolean result = true;
		
		for(int i=2; i<num1; i++) {
		if(num1 % i == 0)
			result = false;
		}
		return result;
	}
	
	
}
