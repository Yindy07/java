package lambdas;

interface ILambdaEx02{
	void lambda(); //추상메서드
}



public class LambdaEx02 {
	public static void main(String[] args) {
		ILambdaEx02 ex02 = new ILambdaEx02() {//1회성
			@Override
			public void lambda() { //메서드 선언
				System.out.println("메서드 호출");
			}
		};
		ex02.lambda();
		
	}
}
