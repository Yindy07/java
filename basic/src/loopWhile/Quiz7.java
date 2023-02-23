package loopWhile;


import java.util.Random;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);                //스캐너 사용을 위해 스캐너 선언
		int udg, cpu=0, col=0;								//udg = 스위치 문 사용을 위한 변수, cpu:랜덤값 변수, col=사용자 값을 위한 변수
		Random r = new Random();							//랜덤 함수를 사용하기 위해 r이라는 랜덤변수 선언
		r.nextInt();										//Int형 변수 선언
		int count = 0, count2 = 100;						//count = 플레이어 정답 횟수 카운트를 위한 변수 , count2 = 플레이어 정답 횟수를 기록할 변수
		while(true)// 게임을 끝내기 전까지 반복하기 위한 반복문 선언
		{
			System.out.println("===Up & Down Game===");	//게임 설명을 위한 출력문
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit"); 		//*/
			System.out.print("> ");
			try {
			udg = sc.nextInt();}catch (Exception e) {   //select = Integer.parseInt(in.next)); 형 변환 으로 값을 받아 버퍼처리 없이 continue 문만 사용해도 무한 반복되지않고 사용 가능 //스위치 문 케이스 번호 값 입력
				sc.nextLine();
				System.out.println("숫자를 입력해야 합니다. : "); //문자열이 들어올 경우 예외처리를 통해 다시 입력받도록 처리
				continue;
			}
			switch(udg)
			{
			case 1 : 
				count=0;							//새로운 게임이 시작되면 정답을 맞추기 위해 시도한 횟수를 0으로 초기화
				cpu = (int) (Math.random()*100+1); //1~100사이 랜덤한 값 을 입력받기위해 랜덤함수 사용 
				System.out.println("<< Game Start >>");
				System.out.println("정답 : " + cpu); //동작을 확인하기 위해 정답을 출력
				while(true) {						// 랜덤한 값을 맞출 때 까지 반복문 실행
					System.out.println("<< Player Turn >>");
					System.out.print("Input Number : ");
					try{col=sc.nextInt();}catch(Exception e) {	//입력범위에 벗어나는 값이 입력되었을 때 예외처리를 통해 올바른 값이 입력될 때 까지 반복하는 예외처리문
						sc.nextLine();
						System.out.println("입력범위는 1~100 입니다. : ");
						count++;							//플레이어의 값이 입력 될 때마다 count를 1씩 증가시켜 몇번의 시도를 하였는지 확인하기 위한 변수
						continue;
					}
					if(col>cpu) {
						System.out.println("Down!!"); //입력한 값이 랜덤한 값보다 클 경우 Down을 출력하여 더 낮은 수를 입력하도록 설명
						count++;
					}
					else if(col<cpu) {
						System.out.println("Up!!"); // 입력한 값이 랜덤한 값보다 작을 경우 Up을 출력하여 더 높은 수를 입력하도록 설명
						count++;
					}
					else if(col==cpu) { 			// 입력한 값과 랜덤한 값이 같다면 정답을 출력 후 반복문 종료
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						count++;
						break;
					}
				}
				break;
			case 2 :
				if(count2>=count) {
					System.out.println("최고기록은 " + count + " 번 입니다."); //정답을 시도한 횟수가 기본 값보다 작다면 작은 값을 출력 후 기록할 변수에 작은 값을 저장
					count2=count;
				}
				else System.out.println("최고기록은 " + count2 + " 번 입니다.");	//저장 된 값이 시도한 횟수보다 작다면 저장된 값을 출력
				break;
			case 3 :
				System.out.println("게임을 종료합니다.");	//게임을 끝내기 위한 출력
				System.exit(0);
 			 }
			}
		}
	}
/*
		Scanner sc = new Scanner(System.in);
		int bestScore = 0;
		while (true) {
			System.out.println("=== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit");
			System.out.print(">> ");
			String select = sc.next();

			switch(select) {
				case "1": 
					System.out.println("<< Game Start >> ");
					Random r = new Random();
					int com = r.nextInt(100) + 1;
					System.out.println("com : " + com);
					int currentScore = 0;
					
					while(true){
						currentScore++;
						System.out.println("<< player turn >> ");
						System.out.print("input number : ");
						int user = 0;
						try {
							user = sc.nextInt();
						} catch (Exception e) {
							System.out.println("숫자를 입력하세요.");
							sc.nextLine();
							continue;
						}
						if(user < 1 || user > 100) {
							System.out.println("입력 범위는 1 ~ 100 입니다.");
							continue;
						}
							
						if(user > com)
							System.out.println("Down!!");
						else if(user < com)
							System.out.println("Up!!");
						else {
							System.out.println("플레이어가 정답을 맞췄습니다.!!");
							if(bestScore > currentScore || bestScore == 0) {
								bestScore = currentScore;
							}
							break;
						}
					}
					break;
				case "2": System.out.println("최고 기록은 " + bestScore + "번 입니다.");
							break;
				case "3": System.out.println("프로그램을 종료합니다."); System.exit(0);
				default : System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}
*/
