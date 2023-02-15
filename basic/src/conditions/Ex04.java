package conditions;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("수를 입력:");
		int data = input.nextInt();
		
		if(data % 3 == 0)
			System.out.println(data+" 는/은 3의 배수이다.");
		else System.out.println(data+" 는/은 3의 배수가 아니다.");
//		else if(data % 3 != 0)
//			System.out.println(data+" 는/은 3의 배수가 아니다.");
		input.close();
	}

}