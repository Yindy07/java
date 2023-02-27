package strings;


public class Quiz2 {

	public static void main(String[] args) {
		String str = "It is a fun java programming";
		int[] indexs = new int[str.length()];
		String[] abc = {"'a'", "'g'", "공백", "공백을 제외한"};
		int index2 = 0, index = 0, index3=0, index4=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) =='a')
			indexs[0] = ++index;
			if(str.charAt(i) == 'g')
			indexs[1] = ++index2;
			if(str.charAt(i) == ' ')
			indexs[2] = ++index3;
			if(str.charAt(i) != ' ')
			indexs[3] = ++index4;
		}
		
		System.out.print("결과 : ");
		for(int i=0; i<4; i++)
		{
			System.out.println();
			System.out.print(abc[i]+" 개수 : "+indexs[i]);
		}
		
	}
}

/*
		 * "It is a fun java programming" 문자열에서 'a'의 개수와'g'개수와 문자(공백을 제외한)의 총 개수를 출력하시오.
	

		String data = "It is a fun java programming";
		int aCount = 0, gCount = 0, spaceExcludeCount = 0;

		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == 'a')
				aCount++;
			else if (data.charAt(i) == 'g')
				gCount++;
			if (data.charAt(i) != ' ')
				spaceExcludeCount++;
		}
		System.out.println("'a' 문자의 개수 : " + aCount);
		System.out.println("'g' 문자의 개수 : " + gCount);
		System.out.println("공백제외 문자의 개수 : " + spaceExcludeCount);
//		System.out.println("공백제외 문자의 개수 : " + (data.length() - spaceExcludeCount));
*/