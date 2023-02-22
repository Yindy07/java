package loopFor;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, num, x, y;
		System.out.print("값 입력 : ");
		num = sc.nextInt();
		System.out.print("2부터 " + num + " 까지의 소수들은 ");
		for(i = 2; i<num; i++)
		{
			int count=0;
			for(j = 1; j<=i; j++) {
			if(i % j == 0)
			count++;
			}
			
			if(count == 2)System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(x=0; x<=10; x++)
		{
			for(y=0; y<=10; y++)
			{
				if((3*x) + (2*y) == 10)
				{
					System.out.println("3x+2y=10을 만족하는 x y :" + x+", " + y);
				}
			}
		}
	}
}
	
