package inputs;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까?");
		String name = sc.next();
		System.out.print(name+" 님의 국어 점수 : ");
		int ko = sc.nextInt();
		System.out.print(name+" 님의 영어 점수 : ");
		int en = sc.nextInt();
		System.out.print(name+" 님의 수학 점수 : ");
		int ma = sc.nextInt();
		
		System.out.println("=================");
		System.out.println("이 름 : " + name);
		System.out.println("=================");
		System.out.println("국 어 : " + ko);
		System.out.println("영 어 : " + en);
		System.out.println("수 학 : " + ma);
		System.out.println("=================");
		System.out.println("합 계 : " + (ko+en+ma));
		System.out.println("=================");
		
		sc.close();

	}

}
