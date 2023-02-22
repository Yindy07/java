package loopFor;

import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수 : ");
		int repeat = sc.nextInt();
		int i=1;
		for(; i<=repeat;)
		{
			System.out.println(i + "번 반복");
			i++;
		}
	}
}
