package conditions;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String data;
		
		System.out.println("1. 쉬운 게임");
		System.out.println("2. 어려운 게임");
		System.out.println("3. 나가기");
		System.out.print(">>>>> ");
		data = input.next();
		
		if(data.equals("1")) //문자열과 문자열을 비교할 때 == 대신 .equals 사용
			System.out.println("쉬운 게임 시작");
		if(data.equals("2"))
			System.out.println("어려운 게임 시작");
		if(data.equals("3"))
			System.out.println("종료 합니다");
		input.close();
	}

}