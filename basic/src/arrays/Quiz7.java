package arrays;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			String[] name = new String[5];
			int[] age = new int[5];
			
			for(int i=0; i<name.length; i++) {
				System.out.println(i+1 + "번째 정보 입력");
				System.out.print("이름 : ");
				name[i] = sc.next();
				System.out.print("나이 : ");
				age[i] = sc.nextInt();
			}
			for(int i=0; i<age.length; i++)
			{
				System.out.println(i+1 + "정보");
				System.out.println("이름 : " + name[i] + ", 나이 : " + age[i] + "세");
			}
			
			for(int i=0; i < age.length-1; i++) {
				for(int j=i+1; j < age.length; j++) {
					if(age[i] > age[j]) //내림차순  |  st[i]>st[j]>>오름차순
					{
						int tmp = age[i];
						age[i] = age[j];
						age[j] = tmp;
						
						String tmp2 = name[i];
						name[i] = name[j];
						name[j] = tmp2;
					}
				}
			}
			System.out.println("### 정렬 결과 ###");
			for(int i=0; i<age.length; i++)
			{
				System.out.println(i+1 + "정보");
				System.out.println("이름 : " + name[i] + ", 나이 : " + age[i] + "세");
			}
				
			
			
			
			
			
		}
	} 