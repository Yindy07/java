package strings;


public class Ex02 {

	public static void main(String[] args) {
		String data1 = "Java is Easy , 그리고 programming 할만하다2222.";
		String data2;
		
		System.out.println("출력 : " + data1);
		data2 = data1.toUpperCase(); //소문자를 대문자로 변환하여 반환시킨다. 원본 변형은 없음
		System.out.println("변환 후 : " + data2);
		
		data2 = data1.toLowerCase(); //대문자를 소문자로 변환하여 반환시킨다. 원본 변형은 없음
		System.out.println("변환 후 : " + data2);
		
		data1.toLowerCase(); // 이렇게 호출만 하는 것은 아무 의미가 없다. 사용하려면 변수에 저장하여 사용
		System.out.println("출력 : " + data1);
	}
}
