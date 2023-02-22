package loopWhile;


import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dg, cpu=0, d1,d2,d3, dt, count=0;  //dt = 다이스 총 합계
		int win =0, lose=0, draw=0, total=0; //total = 전적
		int gm=0, gb=0;   //gm = 충전금액 , gb = 배팅금액
		char pl;
		Random r = new Random();
		r.nextInt();
		
		while(true)
		{
			System.out.println("===Up & Down Game===");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println("4. Game money Recharge");
			System.out.print(">> ");
			try {
			dg = sc.nextInt();}catch (Exception e) {   //select = Integer.parseInt(in.next)); 형 변환 으로 값을 받아 버퍼처리 없이 continue 문만 사용해도 무한 반복되지않고 사용 가능
				sc.nextLine();
				System.out.println("숫자를 입력해야 합니다. : ");
				continue;
			}
			switch(dg)
			{
			case 1 : 
				
				while(true) {
					if(gm <=0) {
						System.out.println("배팅금액을 모두 잃었습니다. 종료합니다.");
					break;}
					
					if(count==3) {
						System.out.println("============ 경고 누적으로 인한 종료 ============");
						System.exit(0);}
					else {
					dt=0;
					cpu = (int) (Math.random()*(18-3+1) + 3);
					System.out.println("<< 게임을 시작합니다. >>");
					System.out.println("보유금액 : " + gm);
					System.out.println("주사위를 돌리겠습니다.");
					d1=(int) (Math.random()*6+1);
					d2=(int) (Math.random()*6+1);
					d3=(int) (Math.random()*6+1);
					System.out.println("1번째 주사위 : " + d1);
					System.out.println("2번째 주사위 : " + d2);
					System.out.println("3번째 주사위 : " + d3);
					dt=d1+d2+d3;
					System.out.println("당신의 주사위 총 합 : "+ dt);
					try {System.out.print("배팅 금액을 정해주세요 : " );
					gb=sc.nextInt();}catch(Exception e){
						sc.nextLine();
						System.out.println("숫자를 입력해야 합니다. : ");
						continue;
					}
					finally {
						if(gb>gm) {
						System.out.println("보유금액보다 높은 금액을 배팅할 수 없습니다.");
						count++;
						System.out.println("게임을 재 실행합니다. (경고3번 누적시 : 자동 종료) : " + count);	
						continue;}
					}
					
					//catch()
					System.out.println("=== 결과 ===");
					System.out.println("당신의 눈 : " + dt);
					System.out.println("상대의 눈 : " + cpu);
					if(cpu > dt) {
						System.out.println("졌습니다. " + gb + "원을 잃습니다.");
						lose++;
						total++;
						gm-=gb;
					}
					else if(cpu < dt) {
						System.out.println("이겼습니다. " + gb + "원을 얻었습니다.");
						win++;
						total++;
						gm+=gb;
					}
					else {
						System.out.println("무승부 입니다.");
						draw++;
						total++;
						}
					while(true) {
						System.out.print("게임을 계속하시겠습니까? (y/n) : ");
						//sc.nextLine();
						pl = sc.next().toLowerCase().charAt(0);
						if(pl =='n' || pl =='y')break;
						System.out.println("y 또는 n 으로 입력하세요.");
						}
				    if(pl == 'n') {
						System.out.println("게임을 종료합니다.");
						break;}
					}
				}
				break;
			case 2 :
				System.out.println("현재 " + total+ "전 "+ win+ "승 "+ lose+ "패 입니다.");
				System.out.println("보유 금액 : " + gm);
				break;
			case 3 :
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			case 4 : System.out.print("충전 금액 입력 : ");gm +=sc.nextInt();
			break;
 			 }
			}
		}
	}
/*
		Scanner sc = new Scanner(System.in);
		int record, win, draw, lose, seed = 10000;
		record = win = draw = lose = 0;

		while (true) {
			System.out.println("=== Dice Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print(">> ");
			String select = sc.next();

			switch (select) {
			case "1":
				System.out.println("게임을 시작합니다.");
				while(true) {
					if(seed <= 0) {
						System.out.println("배팅금액을 모두 잃었습니다. 종료합니다.");
						break;
					}
					record++;
					System.out.println("배팅 금액 : " + seed);
					System.out.println("주사위를 돌리겠습니다.");
					Random r = new Random();
					int userTotal = 0;
					for (int i = 1; i <= 3; i++) {
						int tmp = r.nextInt(6) + 1;
						System.out.println(i + "번째 주사위 : " + tmp);
						userTotal += tmp;
					}
					System.out.println("당신의 주사위 총 합 : " + userTotal);
					int comTotal = r.nextInt(18 - 3 + 1) + 3; // 3 ~ 18
	
					int bet = 0;
					while (true) {
						System.out.print("배팅 금액을 정해주세요 : ");
						try {
							bet = sc.nextInt();
						} catch (Exception e) {
							sc.nextLine();
							System.out.println("숫자로 입력하세요.");
							continue;
						}
	
						if (bet >= 1 && bet <= seed)
							break;
					}
	
					System.out.println(" === 결과 === ");
					System.out.println("당신의 주사위 총 합 : " + userTotal);
					System.out.println("상대의 주사위 총 합 : " + comTotal);
	
					if (userTotal > comTotal) {
						System.out.println("이겼습니다. " + bet + "원을 얻었습니다.");
						win++;
						seed += bet;
					} else if (userTotal < comTotal) {
						System.out.println("졌습니다. " + bet + "원을 잃습니다.");
						lose++;
						seed -= bet;
					} else {
						System.out.println("무승부 입니다.");
						draw++;
					}
					
					char yn = 0;
					while(true) {
						System.out.print("게임을 계속하시겠습니까? (y/n) : ");
						yn = sc.next().toUpperCase().charAt(0);
						if(yn == 'Y' || yn == 'N')
							break;
						System.out.println("y 또는 n 으로 입력하세요.");
					}
					
					if(yn == 'N') {
						System.out.println("게임을 종료합니다.");
						break;
					}
					System.out.println();
				}
				break;
			case "2":
				System.out.printf("현재 %d전 %d승 %d무 %d패 입니다.\n", record, win, draw, lose);
				break;
			case "3":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}
*/
