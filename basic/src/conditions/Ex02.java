package conditions;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("입력 : ");
		int data = input.nextInt();
		
		if(data >10) {System.out.println("종속 문장 실행");
		System.out.println("종속 문장 실행");}
		System.out.println("다음 문장");
		input.close();
	}

}