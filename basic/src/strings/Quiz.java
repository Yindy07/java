package strings;


public class Quiz {

	public static void main(String[] args) {
		String str = "Have a nice day Have a nice day Have a nice day";
		int[] indexs = new int[str.length()];
		int index = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) =='a')
			indexs[index++] = i;
		}
		
		System.out.print("결과 : ");
		for(int i=0; i<index; i++)
			System.out.print(indexs[i] + " ");
		System.out.println();
		
	}
}
