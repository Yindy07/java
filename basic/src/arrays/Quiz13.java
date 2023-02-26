package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		int grade, num1 = 0, num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("총 학급 수 : ");
		num1 = sc.nextInt();		//총 학급 수
		int[] cl = new int[num1];	
		String[][] name = new String[num1][];
		int [][] kor = new int[num1][];
		int [][] mt = new int[num1][];
		for(int i=0; i<cl.length; i++) {
			System.out.print((i+1)+"반의 인원수 : ");
			cl[i] = sc.nextInt();			//각 학급의 인원 수
			name[i] = new String[cl[i]];
			kor[i] = new int [cl[i]];
			mt[i] = new int [cl[i]];
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
			}
		}
		System.out.println("이름\t국어\t영어\t총점\t반석차\t전교석차\t평균");
		for(int i=0; i<cl.length; i++)
		{
			for(int j=0; j<cl[i]; j++) {
				System.out.println
				(name[i][j] + "\t"+kor[i][j]+ "\t" + mt[i][j]+ "\t");
			}
		}
	}
}

