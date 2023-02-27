package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		int num1 = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("총 학급 수 : ");
		num1 = sc.nextInt();		//총 학급 수
		int[] cl = new int[num1];	
		String[][] name = new String[num1][];
		int [][] kor = new int[num1][];
		int [][] mt = new int[num1][];
		int[][] total = new int[num1][];
		double[][] avg = new double [num1][];
		int rankC[][] = new int[num1][];
		int rankA[][] = new int[num1][];
		for(int i=0; i<cl.length; i++) {
			System.out.print((i+1)+"반의 인원수 : ");
			cl[i] = sc.nextInt();			//각 학급의 인원 수
			name[i] = new String[cl[i]];
			kor[i] = new int [cl[i]];
			mt[i] = new int [cl[i]];
			total[i]= new int[cl[i]];
			avg[i] = new double[cl[i]];
			rankC[i] = new int [cl[i]];
			rankA[i] = new int [cl[i]];
			
		}
		
		
		for(int i=0; i<cl.length; i++)
		{
			for(int j=0; j<name[i].length; j++) {
			System.out.print((i+1)+"반의" + (j+1) +"번 째 학생이름:");
			name[i][j] = sc.next();
			System.out.print("국어 : ");
			kor[i][j] = sc.nextInt();
			System.out.print("수학 : ");
			mt[i][j] = sc.nextInt();
			total[i][j] = mt[i][j]+kor[i][j];
			avg[i][j] = (double)total[i][j]/2;
			}
		}
		int[][] total2 = total;
		for(int i=0; i<cl.length; i++)
		{
			for(int j=0; j<rankC[i].length; j++)
			{
				int tmp = total2[i][j];
				total2[i][j] =  total2[i][j+1];
				total2[i][j+1] = tmp;
			}
		}
		
		System.out.println("이름\t국어\t영어\t총점\t반석차\t전교석차\t평균");
		for(int i=0; i<cl.length; i++)
		{
			for(int j=0; j<name[i].length; j++) {
				System.out.println(total2[i][j]);
//				System.out.println
//				(name[i][j] + "\t"+kor[i][j]+ "\t" + mt[i][j]+ "\t"+total[i][j] + "\t\t\t" + avg[i][j]);
			}
		}
	}
} 
