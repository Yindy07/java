package arrays;

import java.util.Random;

public class Quiz9 {
	
	public static void main(String[] args) {
		
		int [][] arr = new int[5][6];
		Random r = new Random();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)  // 열의 개수는 행의 0번째 인덱스의 길이
			{
				arr[i][j] = r.nextInt(45)+1;
				for(int c=0; c<j; c++) {
					if(arr[i][j] == arr[i][c]) {
						j--;
						break;
						}
					}
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
	}	
} 
/*
 * int[][] lottos = new int[5][6];
		Random r = new Random();

		for (int row = 0; row < lottos.length; row++) {
			
			for (int i = 0; i < lottos[row].length; i++) {
				lottos[row][i] = r.nextInt(45) + 1; // 1 ~ 45
				for (int j = 0; j < i; j++) {
					if (lottos[row][j] == lottos[row][i]) {
						i--;
						break;
					}
				}
			}

			for (int i = 0; i < lottos[row].length - 1; i++) {
				for (int j = i + 1; j < lottos[row].length; j++) {
					if (lottos[row][i] > lottos[row][j]) {
						int tmp = lottos[row][j];
						lottos[row][j] = lottos[row][i];
						lottos[row][i] = tmp;
					}
				}
			}
		}

		System.out.println("## 결과 ##");
		for (int row = 0; row < lottos.length; row++) {
			for (int i = 0; i < lottos[row].length; i++)
				System.out.printf("%02d ", lottos[row][i]);
			System.out.println();
		}
 */
