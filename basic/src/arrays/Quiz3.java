package arrays;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				int i= 0;
				System.out.print("생성할 배열의 길이를 입력 : ");
				try{
					i = sc.nextInt();
					}catch(Exception e) {
					sc.nextLine();
				}
				int[] st = new int[i];
				System.out.println(i+"개의 배열이 생성되었습니다.");
				System.out.println("데이터를 입력하세요.");
				for(i=0; i<st.length; i++)
				{
					System.out.print(i+1 + "번째 데이터 : ");
					try{
					st[i]=sc.nextInt();
					}catch(Exception e) {
					sc.nextLine();
					continue;
					}
				}
				System.out.print("배열 데이터 : ");
				for(i=0; i<st.length; i++)
					System.out.print(st[i] + " ");
			}
			System.out.print(" 입니다.");
			//System.out.println("배열 데이터 : " + Arrays.toString(st) + "입니다.");
			
			
			
			
			
		}
	} 


/*
 Scanner sc = new Scanner(System.in);

		String[] subjects = { "국어", "영어", "수학", "과학", "사회" };
		int scores[] = new int[subjects.length+1];

		for (int i = 0; i < subjects.length; i++) {
			while (true) {
				System.out.print(subjects[i] + "점수 : ");
				try {
					scores[i] = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
					continue;
				}
				if (scores[i] >= 0 && scores[i] <= 100)
					break;
			}
			scores[scores.length-1] += scores[i];
		}
		
		System.out.println("총점 : " + scores[scores.length-1]);
		double average = scores[scores.length-1] / (double)subjects.length;
		System.out.printf("평균 : %.2f\n", avera
 * */


























/*
 while(true)
			{
					System.out.print("국어점수 : ");
					st[i] = sc.nextInt();
					if(st[i]>100 || st[i]<0)continue;
					i++;
					if(i==1)break;
			}
			while(true)
			{
					System.out.print("영어점수 : ");
					st[i] = sc.nextInt();
					if(st[i]>100 || st[i]<0)continue;
					i++;
					if(i==2)break;
			}
			while(true)
			{
					System.out.print("수학점수 : ");
					st[i] = sc.nextInt();
					if(st[i]>100 || st[i]<0)continue;
					i++;
					if(i==3)break;
			}*/
