package arrays;

public class Quiz8 {
	
	public static void main(String[] args) {
		
		//int col = (int) (Math.random()*9+1);
		//char alpha = (char) (Math.random()*('z'-'a')+'a');
		int [][] arr = new int[5][5];
		char [][] arr2 = new char[5][5];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)  // 열의 개수는 행의 0번째 인덱스의 길이
			{
				int row = (int) (Math.random()*10);
				arr[i][j] = row;
				
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				char alpha = (char) (Math.random()*('z'-'a')+'a'); // = r.nextInt(26)+97; 
				arr2[i][j] = alpha;
			} 
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("alpha");
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)  
			{
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}	
} 
/*
 * 
 */
