package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<String> num = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> mail = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int re=0;
		while(true) {
			System.out.println();
			System.out.println("1.회원 등록");
			System.out.println("2.회원 확인"); //이메일로 검색하여 있으면 이름, 전화번호, 이메일출력 / 없으면 없음 출력
			System.out.println("3.회원 삭제"); // 이메일로 검색하여 있으면 이름 ,전화번호 ,이메일 삭제 / 없으면 없음 출력
			System.out.println("4.회원 수정"); // 이메일로 검색하여 있으면 이름과 전화번호 수정 / 없으면 없음 출력
			System.out.println("5.종료");
			System.out.print(">>>");
			re = sc.nextInt();
			switch(re)
			{
			
			case 1 : 
				while(true) {
				System.out.print("E-mail : ");
				String tmp = sc.next();
				int index = mail.indexOf(tmp);
				
				if(index != -1)	{			
					System.out.println(mail.get(index) + "는 등록된 E-mail입니다. 다시 입력하세요");
					continue;
					}
				else mail.add(tmp);
				System.out.print("이름 : ");
				tmp = sc.next();
				name.add(tmp);
				System.out.print("전화번호 : ");
				tmp = sc.next();
				
				num.add(tmp);
				break;
				}
				break;
			case 2 :	
				System.out.print("확인할 E-mail : ");
				String tmp = sc.next();
				int index = mail.indexOf(tmp);
		
				if(index != -1)	{			
					System.out.println("name : "+name.get(index)+"/ E-mail : "+mail.get(index)  + "/ phone : "+num.get(index) );
				}
				else System.out.println("없음");
				break;
			case 3 :
				System.out.println("삭제할 E-mail : ");
				tmp = sc.next();
				index = mail.indexOf(tmp);
				if(index != -1)	{			
					System.out.print(name.remove(index) +" "+ num.remove(index)+" " + mail.remove(index) + " ");
					System.out.println("삭제");
				}
				else System.out.println("없음");
				break;
			case 4 :
				System.out.print("확인할 E-mail : ");
				tmp = sc.next();
				index = mail.indexOf(tmp);
				if(index != -1)	{			
					System.out.print("수정 할 이름 : ");
					String element = sc.next();
					name.set(index, element);
					System.out.print("수정 할 전화번호 : ");
					element = sc.next();
					num.set(index, element);
					System.out.println("수정 완료!!");
				}
				else System.out.println("없음");
				break;
			case 5 :
				System.out.println("시스테 종료");
				System.exit(0);
			case 6 : 
				System.out.println(name);
				System.out.println(num);
				System.out.println(mail);
				
				default : System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}
}
/*
	/*
		 * 회원 등록 : 이름(중복 허용), 전화번호(중복 허용), 이메일(중복 허용 안됨) 
		 * 회원 확인 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 출력 / 없으면 없음 출력 
		 * 회원 삭제 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 삭제 / 없으면 없음 출력 
		 * 회원 수정 : 이메일로 검색하여 있으면 이름과 전화번호 수정 / 없으면 없음 출력
		 

		Scanner in = new Scanner(System.in);

		ArrayList<String> mobile = new ArrayList<String>();
		ArrayList<String> email = new ArrayList<String>();
		ArrayList<String> name = new ArrayList<String>();

		int index;
		String em = "";
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 확인");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : ");
				em = in.next();
				if (email.contains(em) == false) {
					email.add(em);
					System.out.print("이름 : ");
					name.add(in.next());
					System.out.print("전화번호 : ");
					mobile.add(in.next());
					System.out.println("회원정보가 등록되었습니다.");
				} else {
					System.out.println("등록된 회원입니다.");
				}
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : ");
				em = in.next();
				index = email.indexOf(em);
				if (index != -1) {
					System.out.println("이메일 : " + email.get(index));
					System.out.println("이름 : " + name.get(index));
					System.out.println("전화번호 : " + mobile.get(index));
				} else {
					System.out.println("등록되지 않은 회원 입니다.");
				}
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : ");
				em = in.next();
				index = email.indexOf(em);
				if (index != -1) {
					name.remove(index);
					mobile.remove(index);
					email.remove(em);
					System.out.println("회원정보 삭제되었습니다.");
				} else {
					System.out.println("등록되지 않은 회원 입니다.");
				}
				break;

			case 4:
				if (name.size() != 0) {
					System.out.println("=== 회원 정보 모두 보기 ===");
					for (int i = 0; i < name.size(); i++) {
						System.out.println("이메일 : " + email.get(i));
						System.out.println("이름 : " + name.get(i));
						System.out.println("전화번호 : " + mobile.get(i));
						System.out.println();
					}
				} else {
					System.out.println("회원 등록 후 이용하세요.");
				}
				break;
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : ");
				em = in.next();
				index = email.indexOf(em);
				if (index == -1) {
					System.out.println("입력한 이메일을 확인하세요.");
				} else {
					System.out.print("이름 : ");
					name.set(index, in.next());
					System.out.print("전화번호 : ");
					mobile.set(index, in.next());
					System.out.println("회원 정보 수정이 완료되었습니다.");
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
			System.out.println();
		}
*/