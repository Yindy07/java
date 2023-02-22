package loopFor;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		int i , sum=0;
		for(i = 1; i<=1000; i++)
		{
			if(i %3 != 0 || i % 15 == 0) {
				//System.out.println(i);
				sum+=i;
				}
			
//			 if(i%3 !=0)
//			 sum+=i;
//			 else if(i%5==0)
//			 sum+=i;
			 
			}
		System.out.println(sum);
				sum=0;
		for(i=1; ; i++)
		{
			if(i %2 != 0)
			{
				sum+=i;
				if(sum>9999) {
					System.out.println("sum : "+sum + "  i : "+ i);
					break;
				}	
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		int num = sc.nextInt(), num2 = sc.nextInt();
		sum=0;
		if(num>num2) for(i=num2; i<=num; i++)
				sum +=i;
		else for(i=num; i<=num2; i++)
			sum +=i;
		System.out.println("합계 : " +sum);
		
		int count=0;
		System.out.print("수를 입력하세요 : ");
		num = sc.nextInt();
		for(i=1; i<=num; i++)
			if(num % i == 0)
				count++;
		if(count == 2)System.out.println(num + "은(는) 소수이다.");
		else System.out.println(num + "은(는) 소수가 아니다.");
	}
}