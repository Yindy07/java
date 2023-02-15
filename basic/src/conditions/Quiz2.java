package conditions;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 를 입력:");
		int data = sc.nextInt();
		if(data % 5==0) System.out.println(data+"는/은 5의 배수 입니다.");
		else System.out.println(data+"는/은 5의 배수가 아닙니다.");
		
		System.out.print("수 를 입력:");
		data = sc.nextInt();
		if(data > 0 && data <100)System.out.println(data+"는/은 적중범위");
		else System.out.println(data+"는/은 비적중범위");
		
		System.out.print("수 를 입력:");
		data = sc.nextInt();
		if(data % 2 == 0 && data % 3 == 0)System.out.println(data+"은/는 짝수이고 3의배수이다.");
		else System.out.println(data+"은/는 짝수이거나 3의배수가 아니다.");
		sc.close();
	}

}