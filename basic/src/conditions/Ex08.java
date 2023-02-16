package conditions;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data; String message;
		System.out.print("수 입력 : ");
		data = input.nextInt();
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

}