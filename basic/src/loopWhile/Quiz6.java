package loopWhile;


import java.util.Random;
import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin, cpu=0;
		Random r = new Random();
		r.nextInt();
		while(true)
		{
			System.out.println("===동전 앞/뒤 맞추기===");
			System.out.print("1.앞면 / 2.뒷면 / 3.종료 ");
			System.out.print("선택 > ");
			try {
			coin = sc.nextInt();}catch (Exception e) {   //select = Integer.parseInt(in.next)); 형 변환 으로 값을 받아 버퍼처리 없이 continue 문만 사용해도 무한 반복되지않고 사용 가능
				sc.nextLine();
				System.out.println("숫자를 입력해야 합니다. : ");
				continue;
			}
			//cpu = r.nextInt(2)+1;
			cpu = (int) (Math.random()*2+1);
			if(cpu == 1) System.out.println("동전의 방향은 : 앞면" );
			else System.out.println("동전의 방향은 : 뒷면" );
			switch(coin)
			{
			case 1 : 
				if(coin == cpu)System.out.println("맞첬습니다!");
				else System.out.println("땡! 틀렸습니다.");
				break;
			case 2 :
				if(coin == cpu)System.out.println("맞첬습니다!");
				else System.out.println("땡! 틀렸습니다.");
				break;
			case 3 :
				System.exit(0);
			}
			}
		}
		
	}
/*
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("== 동전 앞/뒤 맞추기 ==");
			System.out.println("1.앞면 / 2.뒷면 / 3.종료");
			System.out.print("선택 > ");
			int select;
			
			try {
				select = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자를 입력해야 합니다.");
				continue;
			}

			if(select == 3)
				break;
			
			Random r = new Random();
			int com = r.nextInt(2) + 1;
//			System.out.println("com : " + com);
			
			if(select == 1 || select == 2) {
				if(select == com)
					System.out.println("맞췄습니다!");
				else
					System.out.println("땡! 틀렸습니다.");
			}else {
				System.out.println("번호를 다시 입력하세요.");
			}
		}
*/
