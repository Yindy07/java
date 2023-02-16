package conditions;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, max, min;
		System.out.print("세 수를 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		max = num1;
		min = num2;
		if(max < num2)
			{max=num2;
			min = num1;}
		if(max < num3)
			max = num3;
		else if(min > num3)
			min = num3;
		
		System.out.println(num1 + " ," + num2 + " ," + num3 + "중 최댓값 : "+ max + "  최솟값 : " + min);
		
		System.out.print("정수를 입력 : ");
		num1 = sc.nextInt();
		
		if(num1 == 0) { System.out.print("다시 입력하세요 : "); }
		else if(num1 % 12 == 0)System.out.println(num1 + " 은(는) 3의 배수이면서, 4의 배수입니다.");
		else if(num1 % 3 == 0)System.out.println(num1 + " 은(는) 3의 배수입니다.");
		else if(num1 % 4 == 0)System.out.println(num1 + " 은(는) 4의 배수입니다.");
		else System.out.println(num1 + " 은(는)3의배수도 4의배수도 아닙니다.");
		sc.close();
		
		/*
		 * if(max < num2 && num2 < num3)
			{max = num3;
			min = num1;}
		else if (max > num2 && max > num3 && num2 < num3)
			min = num2;
		else if(max < num2 && num2 > num3 && max < num3)
			{max = num2;
			min = num1;}
		else if(max < num2 && num2 > num3 && max > num3)
			max = num2;
		else if(max > num2 && max < num3)
			{max = num3;
			 min = num2;}
		 */
		
	}

}