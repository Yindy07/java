package variables;

public class Exam02 {

	public static void main(String[] args) {
		
		int data =123, result;
		char ch ='C';
		
		data = data + 10;
		ch = 'C' + 3;
		result = data + ch;
		System.out.println("data = " + data);
		System.out.println("ch = " + ch);
		System.out.println("ch = " + (int)ch);//강제형변환
		System.out.println("result = " + result);
	}

}
