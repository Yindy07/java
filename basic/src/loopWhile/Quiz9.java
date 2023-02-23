package loopWhile;


import java.util.Random;
import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int udg, cpu=0, col=0, cpu2=0; //cpu2= 컴퓨터 답 // col=사용자 답 cpu = 맞춰야할 답
		int ca = 1, ca2 =1000; //ca=난수 최소값 ca2 =난수 최대값
		Random r = new Random();
		r.nextInt();
		int pw = 0, pl = 0, cw = 0,cl = 0; //pw = 플레이어승 cw = 컴터승, pl=플레이어 패, cl=컴퓨터 패 
		int pc=0, cc=0; // pc=컴퓨터 누적 승, cc=플레이어 누적 승   
		while(true)
		{
			pw=0; cw=0;					//게임이 새로 시작될 때 마다 조건문 탈출을 위한 변수들 0으로 초기화
			System.out.println("===Up & Down Game==="); //게임의 메뉴 설명을 위한 출력문
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit");			//
			System.out.print("> ");
			try {
			udg = sc.nextInt();}catch (Exception e) {   //select = Integer.parseInt(in.next)); 형 변환 으로 값을 받아 버퍼처리 없이 continue 문만 사용해도 무한 반복되지않고 사용 가능
				sc.nextLine();
				System.out.println("숫자를 입력해야 합니다. : ");//문자열을 입력 받았을 때 오류를 처리하기 위한 예외처리
				continue;
			}
			switch(udg)
			{
			case 1 : 
				ca=1; ca2=1000;							//게임이 시작될 때마다 랜덤한 값의 최소값과 최대값을 기본값으로 초기화
				cpu = (int) (Math.random()*1000+1);		//찾아야 할 랜덤한 변수 입력
				System.out.println("<< Game Start >>");
				System.out.println();
				//System.out.println("정답 : " + cpu);
			while(true) {								//정답을 맞출 때 까지 반복하기 위한 반복문
				while(true) {
					System.out.println("<< Player Turn >>");
					while(true) {//입력범위보다 크거나 작은 값을 입력하였을 때 올바른 값이 입력될 때 까지 반복하기 위한 반복문
					System.out.print("Input Number : ");	
					try{col=sc.nextInt();}catch(Exception e) {
						sc.nextLine();							//플레이어 값 입력 밑 숫자를 제외한 다른 문자를 입력 받았을 때 오류를 처리하기 위한 예외처리
						System.out.println("입력범위는 1~1000 입니다. : "); //입력범위 설명을 위한 출력문
						continue;
					}
					if(col>=ca && col<=ca2)break;		//입력범위보다 크거나 작은 값을 입력하였을 때 경고하기 위한 조건문
					System.out.println((ca-1)+"보다 크거나 "+(ca2+1) + "보다 작은 값을 입력하세요");
					}
					
					if(col>cpu) {						//플레이어 값이 찾아야 하는 값보다 클 경우 Down을 출력하여 더 낮은 값을 입력하도록 조건 밑 출력
						System.out.println("Down!!");
						ca2=col-1;						//최대값을 플레이어가 입력한 값보다 1낮은 값으로 변경
						System.out.println("사용자가 "+ col+ "을(를) 불렀기 때문에 컴퓨터의 난수 최대값" + ca2 + "(으)로 조정"); // 최대값이 변경되었으므로 알려주기 위한 출력
						break;
					}
					else if(col<cpu) {					//플레이어 값이 찾아야 하는 값보다 작을 경우 Up을 출력하여 더 높은 값을 입력하도록 조건 및 출력
						System.out.println("Up!!");
						ca=col+1;						//최소값을 플레이어가 입력한 값보다 1 높은 값으로 변경
						System.out.println("사용자가 "+ col+ "을(를) 불렀기 때문에 컴퓨터의 난수 최소값" + ca + "(으)로 조정"); // 최소값이 변경되었으므로 알려주기 위한 출력
						break;
					}
					else if(col==cpu) {				//플레이어의 값과 찾는 값이 일치할 경우 플레이어의 승리 카운트1 증가 밑 컴퓨터의 패배 카운트1증가
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						pw++;
						cl++;
						break;
					}
					
					}
				pc+=pw;  // 플레이어의 승리 변수를 저장하기 위해 기록될 변수에 저장
				if(pw == 1 || cw == 1)break;	//반복문 탈출을 위한 조건문
				System.out.println();
				//System.out.println("맞추어야 하는 정답 : " + cpu);
				System.out.println("컴퓨터가 다음에 부를 값 : " + ca + " ~ " + ca2 + "사이");	//컴퓨터가 부를 최소값과 최대값을 변수를 통해 출력
				while(true) {					
					System.out.println("<< Computer Turn >>");
					cpu2 = (int) (Math.random()*(ca2-ca+1) + ca); //설정된 최소값과 최대값 사이에서 랜덤한 값을 입력받기 위한 랜덤함수
					System.out.println("Input Number : " + cpu2);	//cpu가 입력한 변수 출력
					if(cpu2 > cpu) {				//컴퓨터의 값이 찾아야하는 값보다 클 경우  Down을 출력하여 더 낮은 값을 입력하도록 조건 밑 출력
						System.out.println("Down!!");
						ca2=cpu2-1;					//최대값을 컴퓨터가 입력한 값보다 1낮은 값으로 변경
						System.out.println("컴퓨터가 "+ cpu2+ "을(를) 불렀기 때문에 컴퓨터의 난수 최대값" + ca2 + "(으)로 조정"); // 최대값이 변경되었으므로 알려주기 위한 출력
						break;
					}
					else if(cpu2 < cpu) {			//컴퓨터 값이 찾아야 하는 값보다 작을 경우 Up을 출력하여 더 높은 값을 입력하도록 조건 및 출력
						System.out.println("Up!!");
						ca=cpu2+1;					//최소값을 컴퓨터가 입력한 값보다 1 높은 값으로 변경
						System.out.println("컴퓨터가 "+ cpu2+ "을(를) 불렀기 때문에 컴퓨터의 난수 최소값" + ca + "(으)로 조정");  // 최소값이 변경되었으므로 알려주기 위한 출력
						break;
					}
					else if(cpu == cpu2) {  //컴퓨터의 값과 찾는 값이 일치할 경우 컴퓨터의 승리 카운트1 증가 밑 플레이어의 패배 카운트1증가
						System.out.println("컴퓨터가 정답을 맞췄습니다!!");
						cw++;
						pl++;
						break;
					}
				}
				cc+=cw;		//컴퓨터의 승리 변수를 저장하기 위해 기록될 변수에 저장
				if(pw == 1 || cw == 1)break;		//반복문 탈출을 위한 조건문
				System.out.println();
				//System.out.println("맞추어야 하는 정답 : " + cpu);
				System.out.println("컴퓨터가 다음에 부를 값 : " + ca + " ~ " + ca2 + "사이"); //컴퓨터가 부를 최소값과 최대값을 변수를 통해 출력
				}
			break;	
			case 2 :
					System.out.println("현재 스코어");		//플레이어 밑 컴퓨터 전적을 출력하기 위한 출력문
					System.out.println("플레이어 : " + pc +"승 "+ pl + "패");
					System.out.println("컴퓨터 : " + cc +"승 "+ cl + "패");
					break;
				
			case 3 :
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			default : System.out.println("메뉴를 다시 확인해주세요.");
 			 }
			}
		}
	}
/*
		Scanner input = new Scanner(System.in);
		
		int userWin = 0; // 사용자 승점
		int userLose = 0; // 사용자 패점
		int comWin = 0; // 컴퓨터 승점
		int comLose = 0; // 컴퓨터 패점
		int userInput = 0;
		int menuSel = 0;
		while (true) {
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit");
			System.out.print("> ");
			try {
				menuSel = Integer.parseInt(input.next()); // 메뉴 선택변수
			} catch (Exception e) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			int comMax = 100; // 상대 컴퓨터가 난수를 만들 때 사용하는 최대값
			int comMin = 1; // 상대 컴퓨터가 난수를 만들 때 사용하는 최소값
			// 향후 사용자와 컴퓨터의 UP, Down 정보를 바탕으로 변한다.

			switch (menuSel) {
			case 1:
				System.out.println("<< Game Start >>");
				int target = (int) (Math.random() * 100 + 1); // target : 맞추어야 하는 정답을 생성하고.
				System.out.println("정답 : " + target);
				while (true) { // 정답을 맞출 때까지 반복되는 게임 반복문

					/* =========== 사용자 턴 시작 ============= *//*
					System.out.println("<< Player Turn >>");
					try {
						System.out.print("Input Number : ");
						userInput = Integer.parseInt(input.next()); // 정답을 맞추려는 플레이어 입력
					} catch (Exception e) {
						System.out.println("다시 입력하세요.");
						continue;
					}
					
					if (userInput > target) { // 플레이어의 시도에 따른 결과 출력
						System.out.println("Down!!");
						comMax = userInput - 1;
						/*
						 * 플레이어가 부른 값이 정답보다 큰 경우, 1 작은 값으로 설정한다. 
						 * ex)답이 50일 때 사용자가 55를 불렀다면, 
						 * 컴퓨터는 부를 수 있는 최대 값을 54로 세팅한다.
						 *//*
						System.out.println("사용자가 " + userInput + "을(를) 불렀기 때문에 컴퓨터의 난수 최대값 " + comMax + "(으)로 조정");
					} else if (userInput < target) {
						System.out.println("Up!!");
						comMin = userInput + 1;
						/*
						 * 플레이어가 부른 값이 정답보다 작은 경우, 1 큰 값으로 설정한다. 
						 * ex) 답이 50일 때 사용자가 45를 불렀다면, 
						 * 컴퓨터는 부를 수 있는 최소 값을 46으로 세팅한다.
						 *//*
						System.out.println("사용자가 " + userInput + "을(를) 불렀기 때문에 컴퓨터의 난수 최소값 " + comMin + "(으)로 조정");
					} else {
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						userWin++; // 사용자 승리 1점
						comLose++; // 컴퓨터 패배 1점
						break; // 정답일 때 게임 반복문을 탈출함.
					}
					
					System.out.println("맞추어야 하는 정답 : " + target);
					System.out.println("컴퓨터가 다음에 부를 값 : " + comMin + " ~ " + comMax + " 사이");
					/* =========== 사용자 턴 종료 ============= *//*
					System.out.println("사용자 턴이 끝났습니다. 계속하려면 엔터키를 누르세요.");
					System.in.read();

					/* =========== 컴퓨터 턴 시작 ============= *//*
					System.out.println("<< Computer Turn >>");
					int computerInput = (int) (Math.random() * (comMax - comMin + 1) + comMin);
					// 컴퓨터는 새롭게 변경된 최소, 최대 값을 바탕으로 난수를 생성하여 입력한다.

					System.out.println("InputNumber : " + computerInput);
					if (computerInput > target) {
						System.out.println("Down!!");
						comMax = computerInput - 1;
						/*
						 * 컴퓨터가 스스로 부른 값이 정답보다 큰 경우, 
						 * 컴퓨터는 부를 수 있는 [최대값]을 컴퓨터 스스로가 부른 값보다 1만큼 작은 값으로
						 * 설정한다. 
						 * ex)답이 50일 때 컴퓨터가 53을 불렀다면 컴퓨터는 부를 수 있는 최대 값을 52로 세팅한다.
						 *//*
						System.out.println("컴퓨터가 " + computerInput + "을(를) 불렀기 때문에 컴퓨터 난수 최대값 " + comMax + "(으)로 조정");
					} else if (computerInput < target) {
						System.out.println("Up!!");
						comMin = computerInput + 1;
						/*
						 * 컴퓨터가 스스로 부른 값이 정답보다 작은 경우, 
						 * 컴퓨터는 부를 수 있는 [최소값]을 컴퓨터 스스로가 부른 값보다 1만큼 큰 값으로
						 * 설정한다. 
						 * ex)답이 50 인데 컴퓨터가 47을 불렀다면 컴퓨터는 부를 수 있는 최소값을 48로 세팅한다.
						 *//*
						System.out.println("컴퓨터가 " + computerInput + "을(를) 불렀기 때문에 컴퓨터 난수 최소값 " + comMin + "(으)로 조정");
					} else {
						System.out.println("컴퓨터가 정답을 맞췄습니다!!");
						userLose++; // 사용자 패배 1점
						comWin++; // 컴퓨터 승리 1점
						break; // 컴퓨터가 정답을 맞추면 게임 반복문을 탈출한다.
					}
					System.out.println("맞추어야 하는 정답 : " + target);
					System.out.println("컴퓨터가 다음에 부를 값 : " + comMin + " ~ " + comMax + " 사이");
					// 플레이어, 컴퓨터 모두 1턴 지나감, 게임 반복문 처음으로 돌아간다.
				}
				break; // case 1: break;
			case 2:
				System.out.println("현재 스코어");
				System.out.println("플레이어 : " + userWin + "승 " + userLose + "패");
				System.out.println("컴퓨터 : " + comWin + "승 " + comLose + "패");
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}
*/
