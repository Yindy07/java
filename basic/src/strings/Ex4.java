package strings;


public class Ex4 {

	public static void main(String[] args) {
		String str = "  Have a nice day  ";
		String result = str.trim(); // trim = 문자열 양쪽 끝 여백 제거 / 원본은 건들지 않음 호출 후 저장해야 사용 가능
		
		System.out.println("--" + str + "--");
		System.out.println("=========trim=========");
		System.out.println("--"+result+"--");
		
		String[] split = result.split(" ");// split = 문자열 분리, 기준을 바탕으로 나뉜다.
		System.out.println("=========split=========");
		for(String p : split)
			System.out.println(p);
			
		String str2 = "010-****-1324";
		//010-****-1234
		
		String replace = str2.replace("*", "^"); //replace((찾으려는 문자열 입력),(변경 될 문자열 ))
		System.out.println("=========replace=========");
		System.out.println("result : " + str2);
		System.out.println("replace : " + replace);
	}
}
