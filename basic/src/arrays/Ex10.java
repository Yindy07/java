package arrays;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 행의 배열을 만드시겠습니까? : ");
		int length = sc.nextInt();
		int[][] arr = new int[length][];
		
		System.out.println("각 행의 배열을 만드세요!");
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 행의 배열 : ");
			int n = sc.nextInt();
			arr[i] = new int[n];
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				arr[i][j] = j;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}	
} 