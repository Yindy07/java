package conditions;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("수를 입력:");
		int data = input.nextInt();
		
		if(data % 3 == 0)
			System.out.println(data+" 는/은 3의배수이다.");
		if(data % 3 != 0)
			System.out.println(data+" 는/은 3의배수가 아니다.");
		//////////////////////////////////////////////////////////////
		System.out.print("값을 입력:");
		data = input.nextInt();
		System.out.print(data+"의 절대값은 : ");
		if(data < 0)
			data =-data;
		System.out.println(data+" 입니다.");
		//////////////////////////////////////////////////////////////
		System.out.print("두수를 입력:");
		data = input.nextInt();
		int data2=input.nextInt();
		int max=data;
		if(max<data2)
			max=data2;
		System.out.println(data+" 와/과 "+data2+"중 큰 값은 : "+max);
		input.close();
	}

}