package conditions;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("두 수 입력:");
		int data1 = input.nextInt();
		int data2 = input.nextInt();
		int max, min;
		if(data1>data2) {max = data1; min = data2;}
		else {max=data2; min=data1;}
		
		System.out.println("max = " + max + ", min = " + min);
		input.close();
	}

}