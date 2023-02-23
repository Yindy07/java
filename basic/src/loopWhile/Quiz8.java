package loopWhile;


import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dg, cpu=0, d1,d2,d3, dt, count=0;  //dt = 다이스 총 합계 d1,d2,d3 플레이어의 랜덤한 다이스 값을 받기 위한 변수 선언, cpu=컴퓨터의 랜덤한 다이스 값, count==경고 누적을 위한 변수
		int win =0, lose=0, draw=0, total=0; //total = 전적
		int gm=0, gb=0;   //gm = 충전금액 , gb = 배팅금액
		char pl; //게임 진행을 여부를 묻기 위해 자료형 변수 선언
		Random r = new Random(); //랜덤 함수를 사용하기 위해 선언
		r.nextInt();
		
		while(true)	//게임이 끝날 때 까지 반복하기 위해 반복문 선언
		{
			System.out.println("===Up & Down Game===");  //게임 메뉴를 출력하기 위한 출력문
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println("4. Game money Recharge");//
			System.out.print(">> ");
			try {
			dg = sc.nextInt();}catch (Exception e) {   //select = Integer.parseInt(in.next)); 형 변환 으로 값을 받아 버퍼처리 없이 continue 문만 사용해도 무한 반복되지않고 사용 가능 //게임 메뉴선택을 위해 스위치문에 들어갈 변수 값 입력
				sc.nextLine();
				System.out.println("숫자를 입력해야 합니다. : "); //숫자가 아닌 문자열이 들어갔을 경우 오류가 뜨지 않기 위해 예외처리
				continue;
			}
			switch(dg)
			{
			case 1 : 
				
				while(true) { //게임을 진행하기 위해 반복문 선언
					if(gm <=0) {	//가지고 있는 시드머니가 0보다 작거나 0이되면 게임이 종료되도록 조건문 선언
						System.out.println("배팅금액을 모두 잃었습니다. 종료합니다.");
					break;}
					
					if(count==3) { //가지고 있는 시드머니보다 높은 금액을 배팅했을 경우 경고 누적으로 인해 종료되도록 조건문 선언
						System.out.println("============ 경고 누적으로 인한 종료 ============");
						System.exit(0);}
					else {
					dt=0; //게임이 시작되었을 때 플레어의 다이스 총 합을 0으로 초기화
					cpu = (int) (Math.random()*(18-3+1) + 3); //컴퓨터의 다이스 총 합을 3~18의 랜덤한 값으로 받기 위해 선언
					System.out.println("<< 게임을 시작합니다. >>");	
					System.out.println("보유금액 : " + gm);		// 게임이 시작되면 보유 금액을 알기위해 출력
					System.out.println("주사위를 돌리겠습니다.");		//게임의 진행을 위한 출력문
					d1=(int) (Math.random()*6+1);	//플레이어의 랜덤한 다이스 값을 받기 위해 선언
					d2=(int) (Math.random()*6+1);
					d3=(int) (Math.random()*6+1);
					System.out.println("1번째 주사위 : " + d1);	//플레이어의 랜덤한 다이스 값을 보기 위한 출력문
					System.out.println("2번째 주사위 : " + d2);
					System.out.println("3번째 주사위 : " + d3);
					dt=d1+d2+d3;
					System.out.println("당신의 주사위 총 합 : "+ dt);	//플레이어의 랜덤한 다이스 값의 총 합
					try {System.out.print("배팅 금액을 정해주세요 : " );	//배팅할 금액 선언
					gb=sc.nextInt();}catch(Exception e){
						sc.nextLine();
						System.out.println("숫자를 입력해야 합니다. : ");//숫자가 아닌 다른 문자가 들어왔을 경우 오류가 나지 않기 위해 예외처리 선언
						continue;
					}
					finally {					//finally : 예외처리에서 무조건 실행되는 문
						if(gb>gm) {					
						System.out.println("보유금액보다 높은 금액을 배팅할 수 없습니다.");	//보유금액보다 높은 금액을 배팅하였을 경우 안내하기 위한 출력문 
						count++;						//경고 누적을 위한 변수 카운트
						System.out.println("게임을 재 실행합니다. (경고3번 누적시 : 자동 종료) : " + count);	//경고 누적 횟수를 보여주기 위한 출력문
						continue;}
					}
					
					//catch()
					System.out.println("=== 결과 ===");			
					System.out.println("당신의 눈 : " + dt);			//게임 결과를 알려주기 위한 출력문
					System.out.println("상대의 눈 : " + cpu);
					if(cpu > dt) {								//플레이어의 총 합이 컴퓨터의 총 합보다 작을 경우
						System.out.println("졌습니다. " + gb + "원을 잃습니다.");	
						lose++;									//플레이어의 패배 카운트1 증가와 총 전적 카운트1 증가
						total++;
						gm-=gb;									//시드머니에서 배팅한 금액을 차감
					}
					else if(cpu < dt) {						//플레이어의 총 합이 컴퓨터의 총 합보다 클 경우
						System.out.println("이겼습니다. " + gb + "원을 얻었습니다.");	
						win++;								// 플레이어의 승리 카운트1 증가와 총 전적 카운트1 증가
						total++;
						gm+=gb;									//시드머니에서 배팅한 금액만큼 증가
					}
					else {
						System.out.println("무승부 입니다.");		//플레어의 총 합과 컴퓨터의 총합이 같을 경우
						draw++;									//플레이어의 무승부 카운트1 증가와 총 전적 카운트1 증가
						total++;
						}
					while(true) {								//게임 진행 여부를 묻기 위해 반복문 선언
						System.out.print("게임을 계속하시겠습니까? (y/n) : ");
						//sc.nextLine();
						pl = sc.next().toLowerCase().charAt(0);	//y or n을 입력 받기 위한 자료형 변수 입력문 대문자로 입력하였을 시 소문자로 변경하여 인식하기 위해 toLowerCase사용
						if(pl =='n' || pl =='y')break;				//y or n을 입력 받았을 때 반복문 탈출
						System.out.println("y 또는 n 으로 입력하세요."); //y or n을 제외한 다른 문자를 받았을 경우 무한 반복 밑 설명을 위한 출력
						}
				    if(pl == 'n') {								//'n'을 입력 받았을 때 반복문 탈출을 위한 조건문
						System.out.println("게임을 종료합니다.");
						break;}
					}
				}
				break;
			case 2 :
				System.out.println("현재 " + total+ "전 "+ win+ "승 "+ draw +"무 "+lose+ "패 입니다."); //플레이어의 총 전적을 보여주기 위한 출력문
				System.out.println("보유 금액 : " + gm);			//플레이어의 보유 금액을 알려주는 출력문
				break;
			case 3 :
				System.out.println("게임을 종료합니다.");			//게임 종료
				System.exit(0);
			case 4 : System.out.print("충전 금액 입력 : ");gm +=sc.nextInt(); //시드머니를 입력받기 위한 입력 밑 출력문
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
