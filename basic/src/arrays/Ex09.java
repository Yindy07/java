package arrays;



public class Ex09 {
	
	public static void main(String[] args) {
		
		int [][] arr = new int[7][6];
		int data=1;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)  // 열의 개수는 행의 0번째 인덱스의 길이
			{
				arr[i][j] = data++;
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)  // 열의 개수는 행의 0번째 인덱스의 길이
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}	
} 
/*
 * package arrays;

public class Ex09 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int data = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = data++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}




 */
