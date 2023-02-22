package loopFor;

import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수 : ");
		int repeat = sc.nextInt();
		
		for(int i=1; i<=repeat; i++)
		{
			System.out.println(i + "번 반복");
		}
		sc.close();
	}
}
