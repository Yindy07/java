package output;

public class Exam01 {

	public static void main(String[] args) {
		//출력 후 줄바꿈 있음
		System.out.println("화면에 출려하는 기능");
		//출력 후 개행 이 없음
		System.out.print("화면에 출력하는 기능");
		//출력 후 개행 이 없고, formatString(서식 문자)를 사용할 수 있다.
		System.out.printf("화면에 출력하는 기능");
		/* %d :정수 출력
		 * %s :문자 출력
		 * %f :실수 출력
		 * %.2f:소수점 2째자리까지출력
		 * %02d:숫자를 출력할 때 두자리 구성해서 출력
		 * %04d:숫자를 출력할 때 네자리 구성해서 출력
		 * %02d and %04d : 출력할 데이터가 두자리, 네자리보다 부족하면 0출력
		 */
	}

}
