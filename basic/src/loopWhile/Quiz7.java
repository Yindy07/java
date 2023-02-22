package loopWhile;


import java.util.Random;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int udg, cpu=0, col=0;
		Random r = new Random();
		r.nextInt();
		int count = 0, count2 = 100;
		while(true)
		{
			System.out.println("===Up & Down Game===");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit");
			System.out.print("> ");
			try {
			udg = sc.nextInt();}catch (Exception e) {   //select = Integer.parseInt(in.next)); 형 변환 으로 값을 받아 버퍼처리 없이 continue 문만 사용해도 무한 반복되지않고 사용 가능
				sc.nextLine();
				System.out.println("숫자를 입력해야 합니다. : ");
				continue;
			}
			switch(udg)
			{
			case 1 : 
				count=0;
				cpu = (int) (Math.random()*100+1);
				System.out.println("<< Game Start >>");
				System.out.println("정답 : " + cpu);
				while(true) {
					System.out.println("<< Player Turn >>");
					System.out.print("Input Number : ");
					try{col=sc.nextInt();}catch(Exception e) {
						sc.nextLine();
						System.out.println("입력범위는 1~100 입니다. : ");
						count++;
						continue;
					}
					if(col>cpu) {
						System.out.println("Down!!");
						count++;
					}
					else if(col<cpu) {
						System.out.println("Up!!");
						count++;
					}
					else if(col==cpu) {
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						count++;
						break;
					}
				}
				break;
			case 2 :
				if(count2>=count) {
					System.out.println("최고기록은 " + count + " 번 입니다.");
					count2=count;
				}
				else System.out.println("최고기록은 " + count2 + " 번 입니다.");	
				break;
			case 3 :
				System.out.println("게임을 종료합니다.");
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
