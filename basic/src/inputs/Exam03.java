package inputs;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.print("데이터 입력 : ");
		String data = sc.next(); 
		System.out.println("입력 받은 데이터 : " + data);
		
		sc.nextLine(); // enter를 제거하기 위해 사용 / 위에서 입력했던 데이터가 buffer에 남아 있기에 buffer청소용
		System.out.println("데이터 입력 : ");
		data = sc.nextLine(); //공백을 포함한 enter까지 입력
		System.out.println("입력 받은 데이터 : " + data);
		
		sc.close();
		//next:공백과 줄바꿈을 입력 문자열의 끝으로 사용
		//nextLine(); -->줄바꿈만 입력 문자열의 끝으로 사용
	}

}
