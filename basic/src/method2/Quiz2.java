package method2;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
	/*
	 * 절대 값을 구하는 함수를 정의하시오 (Absolute java)
	 * 
	 * 점수를 받아 A~F 학점을 출력하시오 (Grade.java)
	 * 
	 * 90 a 80 b 70c 60d 그외f
	 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Absolute num = new Absolute();
		System.out.print("수 입력: ");
		num.setData(sc.nextInt());
		
		System.out.println(num.getData() +"의 절댓값은 : " + num.absolute());
		
		Grade grade = new Grade();
		System.out.print("점수 입력 : ");
		grade.setData(sc.nextInt());
		
		System.out.println(grade.getData() + "점은 '" + grade.grade() + "' 학점 입니다.");
		
	}
}

