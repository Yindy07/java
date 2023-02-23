package arrays;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int i= 0;
			System.out.print("생성할 배열의 길이를 입력 : ");
			try{
				i = sc.nextInt();
				}catch(Exception e) {
				sc.nextLine();
			}
			int[] st = new int[i];
			System.out.println(i+"개의 배열이 생성되었습니다.");
			System.out.println("값을 입력하세요.");
			for(i=0; i<st.length; i++)
			{
				System.out.print(i+1 + "번째 값 : ");
				try{
				st[i]=sc.nextInt();
				}catch(Exception e) {
				sc.nextLine();
				continue;
				}
			}
			System.out.print("배열에 입력된 값은 : ");
			for(i=0; i<st.length; i++)
				System.out.print(st[i] + " ");
			System.out.print("입니다.");
			
			for(i=0; i < st.length-1; i++) {
				for(int j=i+1; j < st.length; j++) {
					if(st[i] > st[j]) //내림차순  |  st[i]>st[j]>>오름차순
					{
						int tmp = st[i];
						st[i] = st[j];
						st[j] = tmp;
					}
				}
				
			}
			System.out.println();
			System.out.print("정렬 후 값은 : ");
			for(i=0; i<st.length; i++)
				System.out.print(st[i] + " ");
			System.out.print("입니다.");
			//System.out.println("배열 데이터 : " + Arrays.toString(st) + "입니다.");
			
			
			
			
			
		}
	} 


/*
 
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
