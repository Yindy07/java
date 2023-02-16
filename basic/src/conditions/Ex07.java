package conditions;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data;
		System.out.print("수 입력 : ");
		String message;
		data = input.nextInt();
		if(data % 2 == 0) //data가 짝수인경우
		{
			if(data % 3 == 0) 
				message = (data+ " 는/은 짝수이고,  3의 배수이다.");
			else message = (data + " 는/은 짝수이지만, 3의 배수는 아니다.");
		}
		/////////////////////////////////////////////////////
		else // data가 홀수인 경우
			if(data % 3 == 0)message = (data + " 는/은 홀수이고, 3의배수이다.");
			else message = (data + " 는/은 홀수이지만, 3의배수도 아니다.");
		System.out.println(message);
		input.close();
	}

}