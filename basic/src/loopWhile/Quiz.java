package loopWhile;


import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		//영문자 q 가 입력될 때 까지 반복을 수행하세요 입력된 문자는 출력되게하세요
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.printf("문자입력 : ");
			char alpha = sc.nextLine().toLowerCase().charAt(0); //ㅣlowercase : 대문자를 소문자로 변환
			if(alpha =='q')
			{System.out.println("시스템 종료");
				break;}
			else System.out.println("입력된 문자는 : " + alpha + " 다시 입력하세요");
		}
		 
		//입력된 수의 각 자리수의 합을 구하는 프로그램을 작성하라
		
		int i=0 ,sum=0;
		System.out.print("수 입력  : ");
		i = sc.nextInt();
		
		while(true)
		{
			sum += i % 10;
			i/=10;
			if(i==0)break;
		}
		System.out.println("입력된 수의 각 자리수 합은 : " + sum);
		//입력된 수를 거꾸로 정수형 변수에 담아 출력하시오 ex)123 -> 321 12345->54321 실제 정수가 되도록 출력
		System.out.println();
		System.out.print("수 입력  : ");
		i = sc.nextInt();
		int total=0;
		while(true)
		{
			total*=10;
			total += i % 10;
			i/=10;
			if(i==0)break;
		} 
		System.out.println("입력된 수의 거꾸로 정수형은 : " + total);
		
	}

}
