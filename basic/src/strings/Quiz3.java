package strings;


public class Quiz3 {

	public static void main(String[] args) {
		String str = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		
		int total=0;
		String[] split = str.split("-");
		for(int i=0; i<split.length; i++)
		{
			String tmp ="";
			for(int j=0; j<split[i].length(); j++) {
			if(split[i].charAt(j) >='0' && split[i].charAt(j) <='9')
				tmp += split[i].charAt(j);
			}
			total+= Integer.parseInt(tmp);
			System.out.print(tmp);
			if(i<split.length-1)System.out.print(" + ");
		}
		System.out.println(" = " + total); //|정규표현식|[^a-z] 알파벳 소문자 가 아닌 것들 | 캐럿[^] : 부정의 의미로 사용
		
		//정규표현식 : 이메일, 아이디 비번 체크시 사용
	
	}
}
/*
 * “FF590-2DX83-M81LZ-XDM7E-MKUT4” 문자열에 있는 정수의 합계를 구하세요. ex) 590 + 283 + 81 + 7
 * + 4 = 965
 */
/*String data = "FF590-2DX83-M81LZ-XDM7E-MKUT4";

String strDatas[] = data.split("-");
int[] intDatas = new int[strDatas.length];
int i;
for (i = 0; i < strDatas.length; i++) {
	String tmp = "";
	for (int j = 0; j < strDatas[i].length(); j++) {
		if (strDatas[i].charAt(j) >= '0' &&
				strDatas[i].charAt(j) <= '9')
			tmp += strDatas[i].charAt(j);// 2+8+3 = 283
	}
	intDatas[i] = Integer.parseInt(tmp);
}

int total = 0;
System.out.print("결과 : ");
for (i = 0; i < intDatas.length; i++) {
	total += intDatas[i];
	if (i < intDatas.length - 1)
		System.out.print(intDatas[i] + " + ");
}
System.out.println(intDatas[i - 1] + " = " + total);*/