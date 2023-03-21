package lambdas;

interface ILambdaEx05<S>{ //아무 알파벳
	void lambda(S data); //아무 알파벳과 같아야 함 제너릭 지정 문자열만 입력가능하게 만들겠다.
}
public class LambdaEx05 {
	public static void main(String[] args) {
		ILambdaEx05<String> ex05 = (data)->{	// 변수명 원하는 걸로 넣어준다.
			System.out.println("a :" + data);	//메서드의 내용을 교체해서 사용할 때
		};
			
			ex05.lambda("문자열");
	
			
			//ILambdaEx05<Integer> ex05 = (da) ->{
			ex05 = da->{
				System.out.println("정수 :" + da);
			};
			//ex05.lambda(50);
	}
}