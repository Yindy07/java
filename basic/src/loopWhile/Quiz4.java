package loopWhile;


import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//수를 입력 받았을 때 그 수 사이에 3,6,9는 몇개가 들어있는지 출력 값 입력하면 출력
		int re;
		String id = null, id2, pass=null, pass2; //in,pass는 초기 값 없이 equals를 <비교를 할 수 없기 때문에> null값 입력
		
	
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			re = sc.nextInt();
			switch(re) {
			case 1 : 
				sc.nextLine();
				System.out.print("저장할 아이디 입력 : ");
				id = sc.nextLine();
				
				System.out.print("저장할 비밀번호 입력 : ");
				pass = sc.next();
				break;
			case 2 : 
				sc.nextLine();
				System.out.print("아이디 입력 : ");
				id2 = sc.nextLine();
				
				System.out.print("비밀번호 입력 : ");
				pass2 = sc.next();
					 
				if(id.equals(id2) && pass.equals(pass2))System.out.println("인증 성공 !!!");
				else System.out.println("인증 실패 !!!");
				break;
			case 3 : 
				System.out.println("프로그램 종료 합니다.");
				System.exit(re);
				default : System.out.println("다시 입력하세요");
////			case 4 : System.out.println("id  : " + id + " , id2 : " + id2);
////					System.out.println("pass  : " + pass + " , pass2 : " + pass2);
//			break;
			}
			
			
			
		}
		
	}

}
