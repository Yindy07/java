package operators;

public class Ex9 {
	public static void main(String[] args) {
		/*
		 * << >> 산술연산자
		 */
		int data=1;
		System.out.println("data 초기값 : "+ data);  
		data <<=1;
		System.out.println("1. data <<=1 " + data);
		data <<=1;
		System.out.println("2. data <<=1 " + data);
		data <<=1;
		System.out.println("3. data <<=1 " + data);
		System.out.println();
		
		System.out.println("data 초기값 : "+ data);
		data >>=1;
		System.out.println("1. data >>=1 " + data);
		data >>=1;
		System.out.println("2. data >>=1 " + data);
		data >>=1;
		System.out.println("3. data >>=1 " + data);
	}
}

