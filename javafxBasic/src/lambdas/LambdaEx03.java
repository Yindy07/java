package lambdas;

interface ILambdaEx03{
	void lambda(); //추상메서드
}



public class LambdaEx03 {
	public static void main(String[] args) {
		ILambdaEx03 ex03 = ()->{
			System.out.println("메서드 호출");	//메서드의 내용을 교체해서 사용할 때
		};
			ex03.lambda();
			
			ex03 = ()->{
				System.out.println("메서드 호출22"); //메서드 변경
			};
			ex03.lambda();
			
			ex03 =() -> {
				System.out.println("1");
				System.err.println("2");
			};
			ex03.lambda();
	}
}
