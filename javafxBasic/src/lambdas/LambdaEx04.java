package lambdas;

interface ILambdaEx04{
	void lambda(Object data);
}
public class LambdaEx04 {
	public static void main(String[] args) {
		ILambdaEx04 ex04 = (data)->{	// 변수명 원하는 걸로 넣어준다.
			System.out.println("a :" + data);	//메서드의 내용을 교체해서 사용할 때
		};
			
			ex04.lambda("123");
			ex04.lambda(1.256);
	
			ex04 = da ->{
				System.out.println("b :" + da);
			};
			ex04.lambda(50);
	}
}