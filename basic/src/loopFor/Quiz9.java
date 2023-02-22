package loopFor;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		/*System.out.print("값 입력 : ");
		num = sc.nextInt();*/
		System.out.println("1~1000 사이의 완전수 찾기");
		for(i=1; i<1000; i++)
		{
			int num=0;
			for(j=1; j<i; j++)
			{
				if(i%j == 0)
				{
					num+=j;
				}
			}
			if(i==num)System.out.println(i +"의 약수의 합은 " + num + "이므로 "+ i +"는(은) 완전수이다");
		}
		sc.close();
	}
}
	
