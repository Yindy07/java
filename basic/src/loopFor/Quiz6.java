package loopFor;

public class Quiz6 {

	public static void main(String[] args) {
		// 구구단 
		int i, j;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				System.out.println(i + " x " + j + " = " + (i*j));
			System.out.println();
		}
		// 디버깅 : 버그를 잡는 용도, 문법x
		/*
		 	디버깅 순서
		 	1. 브레이크 포인트 설정(Ctrl + Shift + b)
		 	2. 디버깅 시작(F11)
		 	3. 한 줄씩 실행(F6)
		 	4. 디비깅 종료 (Ctrl + F2)
		 */
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		for(i = 1; i <= 21; i+=5) {
			for(j = 0; j < 5; j++) {
				System.out.print(i+j + "\t");
			}
			System.out.println();
		}
		
	}
}
