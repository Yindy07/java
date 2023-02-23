package arrays;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
			int[] st = new int[4];
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int i=0; double total=0,avg=0;
			 String[] se = {"국어", "영어", "수학"};
			  
			  while(i < st.length-1)
			  {
			  		System.out.print((se[i])+"점수 : ");
					st[i] = sc.nextInt();
								
					if(st[i]>100 || st[i]<0)continue;
					i++;
			  }
			for(i=0; i<st.length; i++)
			{
				total+=st[i];
			}
			avg = total / 3;
			
			System.out.println("총점 : "+ (int)total);
			System.out.printf("평균 : %f\n", avg);
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
