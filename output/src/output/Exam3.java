package output;

public class Exam3 {

	public static void main(String[] args) {
		double data1 = 10;
		double data2 = 3;
		System.out.println(data1 / data2);
		System.out.printf("%.3f",data1 / data2);
		
		int data3 = 7;
		System.out.println(); // 엔터효과
		System.out.println(data3);
		System.out.printf("%02d",data3);
		System.out.println(); // 엔터효과
		System.out.printf("%03d",data3+4);
	}

}
