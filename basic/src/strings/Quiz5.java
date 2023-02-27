package strings;


public class Quiz5 {

	public static void main(String[] args) {

		String data = "김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";

		String strDatas[] = data.split("\n");

		System.out.println("==== 변경 전 str====");
		for (int i = 0; i < strDatas.length; i++) 
			System.out.println(strDatas[i]);
		String[] stDatas = new String[strDatas.length];
		for (int i = 0; i < strDatas.length; i++) {
			stDatas[i] = strDatas[i].replaceAll("[^가-힣]", "");
			stDatas[i] = stDatas[i].replace("년", " :1999년");
		}
		System.out.println("====변경 후 str==== ");
		for (int i = 0; i < stDatas.length; i++) 
			System.out.println(stDatas[i]);
	}
}
/*

 * String str = "김개똥 -2017년\n홍구리 -2015년\n선우선녀 -2018년";  
 * 문자열 데이터를 아래와 같이 변경하여 출력 하시오.
 
String str = "김개똥 -2017년\n홍구리 -2015년\n선우선녀 -2018년";  
System.out.println("==== 변경 전  ====");
System.out.println(str);

str = str.replace("-", ": ");
str = str.replaceAll("[0-9][0-9][0-9][0-9]", "1999");
System.out.println("==== 변경 후  ====");
System.out.println(str);
*/