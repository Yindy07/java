package operators;

public class Ex6 {
	public static void main(String[] args) {
		int data1, data2, data3;
		
		data1 = 10;
		data2 = ++data1;//전치연산
		
		data1 = 10;
		data3 = data1++;//후치연산
		
		System.out.println("data1 = " + data1);

		System.out.println("data2 = " + data2);

		System.out.println("data3 = " + data3);
	}
}
