package loopFor;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		int i , sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		int num = sc.nextInt(), num2 = sc.nextInt();                                 // if(small > big)
		sum=0;																		//		tmp = big
		if(num>num2) for(i=num2; i<=num; i++)										//		big = small
				sum +=i;															//		small = tmp
		else for(i=num; i<=num2; i++)												//		for(i = small; i<=big; i++)
			sum +=i;																//  	sum+=i;
		System.out.println("합계 : " +sum);
		
		int count=0;
		System.out.print("수를 입력하세요 : ");
		num = sc.nextInt();
		for(i=1; i<=num; i++)
			if(num % i == 0)
				count++;
		if(count == 2)System.out.println(num + "은(는) 소수이다.");
		else System.out.println(num + "은(는) 소수가 아니다.");
		
		/*
		 * boolean result = true;
		 * for(int i =2 ; i<num; i++)
		 * {
		 * 	if(num % i == 0)
		 * result = false;}
		 * 
		 * if(result == true) syso data +소수이다
		 * else syso data + 소수가 아니다.
		 * 	 
		 */
	}
}