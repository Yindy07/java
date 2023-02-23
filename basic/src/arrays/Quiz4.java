package arrays;

import java.util.Scanner;

public class Quiz4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int m = 0, d = 0;
			int week = 0, count=0;
			int [] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			while(true) {
				week=0;
				while(true) {
					System.out.print("월 일 입력 : ");
					try {
					m = sc.nextInt();
					d = sc.nextInt();}catch(Exception e) {
						sc.nextLine();
						System.out.println("숫자만 입력");
						continue;
					}
					if(m>12 || m<=0)continue;
					if(d>day[m-1] || d<=0)continue;
					break;
					}
				String[] w = {"금요일", "토요일", "일요일", "월요일", "화요일", "수요일", "목요일"};
				
				for(int i=0; i<m-1; i++) {
					week+=day[i];}
				
					week = (week+d+1) % 7;
				System.out.printf("2023년 %02d월 %02d일은 %s 입니다.\n", m,d,w[week]);
				count++;
				if(count == 10)break;
			}
		}
	}
/*
 Scanner input = new Scanner(System.in);
		
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		int month[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int mm = 0, dd = 0, total = 0;

		while(true) {
			System.out.print("월 일 입력 : ");
			try {
				mm = Integer.parseInt(input.next());
				dd = Integer.parseInt(input.next());
			} catch (Exception e) {
				continue;
			}
			
			if (mm >= 1 && mm <= 12 && dd >= 1 && dd <= month[mm-1])
				break;
		}

		for (int i = 0; i < mm - 1; i++) {
			total += month[i];
		}
		total += dd;
		total += 5;
		System.out.printf("2023년 %02d월 %02d일은 %s입니다.\n", mm, dd, week[total % 7]);

 */