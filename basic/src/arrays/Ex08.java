package arrays;



public class Ex08 {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{10,20,30},
			{40,50,60},
			{70,80,90}
		};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
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
