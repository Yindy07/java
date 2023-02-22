package loopWhile;


import java.util.Random;
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rsp, cpu=0;
		Random r = new Random();
		r.nextInt();
		while(true)
		{
			System.out.println("===가위 바위 보 게임===");
			System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보 / 0.종료 / >>");
			try {
			rsp = sc.nextInt();}catch (Exception e) {
				sc.nextLine();
				continue;
			}
			
			switch(rsp) {
			case 1 : 
				System.out.println("======= 결 과 =======");
				System.out.println("가위를 선택하셨군요!?");
				cpu = r.nextInt(3)+1;
				if(cpu == 1) {System.out.println("컴퓨터는 가위를 냈어요!");
				System.out.println("Draw");
				System.out.println();
				}
				else if(cpu == 2)
				{System.out.println("컴퓨터는 바위를 냈어요!");
				System.out.println("Lose");
				System.out.println();
				}
				else if(cpu == 3)
				{System.out.println("컴퓨터는 보를 냈어요!");
				System.out.println("Win");
				System.out.println();
				}
				break;
			case 2 :
				System.out.println("======= 결 과 =======");
				System.out.println("바위를 선택하셨군요!?");
				cpu = r.nextInt(3)+1;
				if(cpu == 1) {System.out.println("컴퓨터는 가위를 냈어요!");
				System.out.println("Win");
				System.out.println();
				}
				else if(cpu == 2)
				{System.out.println("컴퓨터는 바위를 냈어요!");
				System.out.println("Draw");
				System.out.println();
				}
				else if(cpu == 3)
				{System.out.println("컴퓨터는 보를 냈어요!");
				System.out.println("Lose");
				System.out.println();
				}
				break;
			case 3 :
				System.out.println("======= 결 과 =======");
				System.out.println("보를 선택하셨군요!?");
				cpu = r.nextInt(3)+1;
				if(cpu == 1) {System.out.println("컴퓨터는 가위를 냈어요!");
				System.out.println("Lose");
				System.out.println();
				}
				else if(cpu == 2)
				{System.out.println("컴퓨터는 바위를 냈어요!");
				System.out.println("Win");
				System.out.println();
				}
				else if(cpu == 3)
				{System.out.println("컴퓨터는 보를 냈어요!");
				System.out.println("Draw");
				System.out.println();
				}
				break;
			case 0 : System.out.println("종료");
			System.exit(0);
			default : System.out.print("0~3  입력하세요 : ");
			System.out.println();
			
			}
		}
		
	}

}
/*
		Scanner in = new Scanner(System.in);

		int select;
		while (true) {
			System.out.println("\n==== 가위 바위 보 게임 ====");
			System.out.println("1.가위 / 2.바위 / 3.보 / 0.종료");
			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (select < 1 || select > 3) {
				System.out.println("확인 후 다시 입력하세요.");
				continue;
			}

			int com = (int) (Math.random() * 3 + 1);
			System.out.println("com : " + com);

			System.out.println(" ==== 결과 ==== ");

			switch (select) {
			case 1:
				System.out.println("당신은 가위를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("당신은 바위를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("당신은 보를 선택하셨습니다.");
				break;
			}

			if (com == 1) {
				System.out.println("컴퓨터는 가위를 선택했습니다.");
			} else if (com == 2) {
				System.out.println("컴퓨터는 바위를 선택했습니다.");
			} else if (com == 3) {
				System.out.println("컴퓨터는 보를 선택했습니다.");
			}

			if (select == com) {
				System.out.println("비겼습니다.");
			} else if ((select == 1 && com == 3) || (select == 2 && com == 1) || (select == 3 && com == 2)) {
				// 사용자의 승리조건 : 가위 > 보 || 바위 > 가위 || 보 > 바위
				System.out.println("이겼습니다.");
			} else {// 컴퓨터의 승리
				System.out.println("졌습니다.");
			}
		}
*/
