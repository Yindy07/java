package conditions;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data;
		System.out.print("수 입력 : ");
		data = input.nextInt();
		
		if(data >100)System.out.println(data+": 100보다 크다.");
		else if(data >50)System.out.println(data+": 50보다 크다.");
		else System.out.println(data + ": 50보다 작다");
		
		input.close();
	}

}