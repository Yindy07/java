package dbConcept03.view;

import java.util.ArrayList;
import java.util.Scanner;

import dbConcept03.dao.MemberDao;
import dbConcept03.dto.MemberDTO;

public class MemberView implements IView{


	String email = "", name="", pw="", id ="";
	int num=0;
	Scanner in = new Scanner(System.in);
	MemberDao member = new MemberDao();
	MemberDTO members = null;
	
	@Override
	public void mainMenu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("1.회원 전체 정보 출력");
			System.out.println("2.회원 정보 조회");
			System.out.println("3.회원 정보 입력");
			System.out.println("4.회원 정보 변경");
			System.out.println("5.회원 정보 삭제");
			System.out.println("0.프로그램 종료");
			System.out.print(">>>"); 
			int re = sc.nextInt();
			switch(re) {
			case 1 :
				selectAll();
				break;
			case 2 : 
				selectId();
				break;
			case 3 :
				insertMember();
				break;
			case 4 :
				updateMember();
				break;
			case 5 : 
				deleteMember();
				break;
			case 0 : 
				disconnection();
				System.exit(0);
				break;
			}
		}
		
	}

	public void disconnection() {
		 member.disconnection();
	}

	@Override
	public void deleteMember() {
		System.out.println("=== 회원 삭제 ===");
		System.out.print("아이디 : "); id = in.next();
		members = member.selectId(id);
		if(member == null) {
			System.out.println("미등록 정보입니다.");
		}else {
			int result = member.deleteMember(id);
			if(result == 1)
				System.out.println("정보가 삭제되었습니다.");
			else
				System.out.println("정상적으로 처리되지 않습니다. 다시 시도하세요.");
		}
	}

	@Override
	public void updateMember() {
		System.out.println("=== 회원 수정 ===");
		System.out.print("아이디 : "); id = in.next();
		System.out.print("이름 : ");	name = in.next();
		System.out.print("이메일 : "); email = in.next();
		members = member.selectId(id);
		if(member == null) {
			System.out.println("미등록 정보입니다.");
		}else {
			members = new MemberDTO();
			members.setId(id);
			members.setName(name);
			members.setEmail(email);
			int result = member.updateMember(members);
			if(result == 1)
				System.out.println("정보가 수정되었습니다.");
			else
				System.out.println("수정이 정상적으로 처리되지 않습니다. 다시 시도하세요.");
		}
	}

	@Override
	public void insertMember() {
		System.out.println("=== 회원 등록 ===");
		System.out.print("아이디 : "); id = in.next();
		System.out.print("패스워드 : ");pw = in.next();
		System.out.print("이름 : "); name = in.next();
		System.out.print("이메일 : "); email = in.next();
		
		members = member.selectId(id);
		if(members == null) {
			members = new MemberDTO();
			members.setId(id);
			members.setPw(pw);
			members.setName(name);
			members.setEmail(email);
			member.insertMember(members);
			System.out.println("회원 등록이 되었습니다.");
		}else {
			System.out.println("등록된 정보입니다.");
		}
	}

	@Override
	public void selectId() {
		System.out.println("=== 회원 검색 ===");
		System.out.print("id : "); id = in.next();
		members = member.selectId(id);
		if(members == null) {
			System.out.println("미등록 정보입니다.");
		}else {
			System.out.println("회원번호 : " + members.getNum());
			System.out.println("아이디 : " + members.getId());
			System.out.println("비밀번호 : " + members.getPw());
			System.out.println("이름 : " + members.getName());
			System.out.println("이메일 : " + members.getEmail());
		}
	}

	@Override
	public void selectAll() {
		ArrayList<MemberDTO> members = member.selectAll(); 
		if(members.isEmpty() == false) {
			for(MemberDTO m : members) {
				System.out.println("회원번호 : " + m.getNum());
				System.out.println("아이디 : " + m.getId());
				System.out.println("비밀번호 : " + m.getPw());
				System.out.println("이름 : " + m.getName());
				System.out.println("이메일 : " + m.getEmail());
				System.out.println();
			}
		}else {
			System.out.println("등록된 정보가 없습니다.");
		}
		System.out.println();
		
	}

}
