package conditions;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data = 0; String message;
		System.out.print("수 입력 : ");
		try {
			//예외가 발생할 코드
		data = input.nextInt(); // Integer.parseINT(변수) : 인트형으로 변환
		} catch (Exception e){
			//예외가 발생 했을 때 동작할 코드를 작성한다.
			System.out.println("문의하세요, 입력 값을 확인 후 다시 시도하세요.");
			System.exit(0);//시스템 종료
			//예외처리 변수의 (e).printStackTrace() : 코드진행 + 문제를 출력해줌 이어서 코드진행
		}
		if(data > 0)
			if(data % 2 == 0)message = data + " 는/은 양의 짝수이다.";
			else message = data + " 는/은 양의 홀수이다.";
		else if (data < 0)
			if(data % 2 == 0)message = data + " 는/은 음의 짝수이다.";
			else message = data + " 는/은 음의 홀수이다.";
		else message = "입력 데이터는 0이다.";
		
		System.out.println(message);
		input.close();
	}

	//try catch : 예외처리 <Exception e> : 최상위 예외처리 / 항상 맨 아래 위치
}