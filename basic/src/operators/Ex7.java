package operators;

public class Ex7 {
	public static void main(String[] args) {
		/*
		 * 조건연산자(조건무 연산자, 삼항연산자)
		 * (조건식) ? 참 일때 반환할 문장들 : 거짓일 때 반환할 문장들
		 */
		
		int data = 10;
		String result = (data >=10 || data <5)? "참일 때 반환할 문장" : "거짓일 때 반환할 문장";
	    System.out.println(result);
	    
		data = 8;
		result = (data % 2 == 0) ? "짝수" : "홀수";
		System.out.println(data  + " = " + result);
		
		data = 9;
		result = (data % 2 == 0) ? "짝수" : "홀수";
		System.out.println(data + " = " + result);
		
		data = 9;
		int total = (data % 2 == 0) ? --data : ++data; 
		System.out.println(data + " = " + data);
		
			
	}
}
