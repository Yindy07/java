package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<String> num = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int re=0;
		while(true) {
			System.out.println();
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>>");
			re = sc.nextInt();
			switch(re)
			{
			
			case 1 : 
				while(true) {
				System.out.print("연락처 : ");
				String tmp = sc.next();
				System.out.println();
				int index = num.indexOf(tmp);
				
				if(index != -1)	{			
					System.out.println(num.get(index) + "는 등록된 번호입니다. 다시 입력하세요");
					continue;
					}
				else num.add(tmp);
				System.out.print("이름 : ");
				String tmp2 = sc.next();
				//int index2 = name.indexOf(tmp2);
				name.add(tmp2);
				break;
				}
				break;
			case 2 :	
				System.out.print("검색할 연락처: ");
				String tmp = sc.next();
				int index = num.indexOf(tmp);
		
				if(index != -1)	{			
					System.out.println(num.get(index) + "는 존재합니다.");
					System.out.println(name.get(index));
				}
				else System.out.println("검색한 연락처는 목록에 존재하지 않습니다.");
				break;
			case 3 :
				System.out.println("삭제할 연락처: ");
				tmp = sc.next();
				index = num.indexOf(tmp);
				if(index != -1)	{			
					System.out.println(num.get(index)+" 이 번호는 삭제되었습니다. ");
					System.out.println(name.get(index)+" 이 이름은 삭제되었습니다. ");
				}
				else System.out.println("입력한 연락처는 목록에 존재하지 않습니다.");
				break;
			case 4 :
				if(name.isEmpty() == false) {
				System.out.println("모든 연락처 : " + num);
				System.out.println("모든 이름 : " + name);}
				else
				System.out.println("등록된 연락처가 없습니다.");
				break;
			case 5 : System.exit(0);
				
			}
		}
	}
}
/*
Scanner sc = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> mobiles = new ArrayList<>();
		String tel = ""; 
		int index = 0;
		
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 검색");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모두 보기");
			System.out.println("5. 종료");
			System.out.print(">> ");
			String select = sc.next();
			switch (select) {
			case "1" : 
				System.out.print("전화번호 : ");
				tel = sc.next();
				if(mobiles.contains(tel) == false) {
					mobiles.add(tel);
					System.out.print("이름 : ");
					names.add(sc.next());
					System.out.println("등록되었습니다.");
				}else {
					System.out.println("등록된 전화번호입니다.");
				}
				break;
			case "2" : 
				System.out.print("전화번호 : ");
				tel = sc.next();
				index = mobiles.indexOf(tel);
				if(index != -1) {
					System.out.println("이름 : " + names.get(index));
					System.out.println("전화번호 : " + mobiles.get(index));
				}else {
					System.out.println("미등록 정보입니다.");
				}
				break;
			case "3" : 
				System.out.print("전화번호 : ");
				tel = sc.next();
				index = mobiles.indexOf(tel);
				if(index != -1) {
					System.out.println("이름 : " + names.remove(index));
					System.out.println("전화번호 : " + mobiles.remove(index));
					System.out.println("정보가 삭제되었습니다.");
				}else {
					System.out.println("미등록 정보입니다.");
				}
				break;
			case "4" : 
				if(names.isEmpty() == false) {
					for(int i = 0; i < names.size(); i++) {
						System.out.println("이름 : " + names.get(i));
						System.out.println("전화번호 : " + mobiles.get(i));
						System.out.println();
					}
				}else {
					System.out.println("등록된 정보가 없습니다.");
				}
				break;
			case "5" : System.out.println("프로그램을 종료합니다."); System.exit(0);
			default: System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
			System.out.println();
		}
*/