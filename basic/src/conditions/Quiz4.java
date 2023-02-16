package conditions;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학점을 입력하세요(A~F) : ");
		char grade = sc.next().toUpperCase().charAt(0); //toUpperCase() : 입력받은 문자열을 대문자로 변경
		if(grade == 'A' || grade == 'B')System.out.println("참 잘했어요");
		else if(grade == 'C' || grade == 'D')System.out.println("분발합시다");
		///////////////////////////////////////////////////////////////////////////
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		String message ="평년"; //기본값 평년
		if(year % 4 == 0)
		{
			message = year + " : 윤년";
			if(year % 100 == 0)
			{
				message = year+" : 평년";
				if(year % 400 == 0)
					message = year + " : 윤년";
			}
		}
		System.out.println(year+"년은 " + message +"입니다.");
		/*if(year % 400 == 0)System.out.println(year+"년은 윤년입니다.");
		else if(year % 100 == 0 && year % 4 ==0 )System.out.println(year+"년은 평년입니다.");
		else if(year % 100 == 0) System.out.println(year+"년은 윤년입니다.");
		else if(year % 4 == 0)System.out.println(year+"년은 윤년입니다.");
		else System.out.println(year + "년은 평년입니다.");	*/
		sc.close();
	}
}