package dbConcept04.main;
import java.util.Scanner;

import dbConcept04.DAO.MemberDAO;
import dbConcept04.DTO.RegisterRequest;
import dbConcept04.Service.ChangePasswordService;
import dbConcept04.Service.MemberAllService;
import dbConcept04.Service.MemberDeleteService;
import dbConcept04.Service.MemberRegisterService;

public class Main {
	private static MemberDAO memberDao = new MemberDAO();
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("명령어를 입력하세요");
			System.out.print("> ");
			String command = sc.nextLine();
			if(command.equalsIgnoreCase("exit")){ //대소문자 무시 알파벳 exit와 같다면 true반환
				memberDao.disconnection();
				System.out.println("종료합니다.");
				break;
			}
			if(command.startsWith("new")){ //startsWith : 시작하는 문자열에 따라서 그에 맞는 종속문장 수행
				processNewCommand(command.split(" "));
				continue;
			} else if(command.startsWith("change")){
				processChangeCommand(command.split(" "));
				continue;
			} else if(command.startsWith("all")) {
				processAllCommand();
				continue;
			} else if(command.startsWith("delete")) {
				processDeleteCommand(command.split(" "));
				continue;
			}
			
			printHelp();
		}
	}
	private static void processNewCommand(String[] arg) {
		if(arg.length != 5){
			printHelp();
			return;
		}
		@SuppressWarnings({ "resource", "unused" })
		Scanner sc = new Scanner(System.in);
		MemberRegisterService regSvc = new MemberRegisterService(memberDao);
		RegisterRequest regirequest = new RegisterRequest();
		regirequest.setEmail(arg[1]);
		regirequest.setName(arg[2]);
		regirequest.setPassword(arg[3]);
		regirequest.setConfirmPassword(arg[4]);
		regSvc.regist(regirequest);
		// MemberRegisterService 객체 생성
		// RegisterRequest 객체 생성 
		// 데이터는 RegisterRequest 객체에 입력
		// regSvc.regist() 호출
	}
	
	private static void processAllCommand() {
		MemberAllService allSvc = new MemberAllService(memberDao);
		allSvc.selectAll();
		// MemberAllService 객체 생성
		// allSvc.selectAll() 호출
	}

	private static void processChangeCommand(String[] arg) {
		if(arg.length != 4) {
			printHelp();
			return;
		}
		@SuppressWarnings({ "resource", "unused" })
		Scanner sc = new Scanner(System.in);
		ChangePasswordService change = new ChangePasswordService(memberDao);
		change.changePassword(arg[1], arg[2], arg[3]);
		// ChangePasswordService 객체 생성
		// change.changePassword() 호출
	}

	private static void processDeleteCommand(String[] arg) {
		if(arg.length != 4) {
			printHelp();
			return ;
		}
		@SuppressWarnings({ "resource", "unused" })
		Scanner sc = new Scanner(System.in);
		MemberDeleteService delete = new MemberDeleteService(memberDao);
		delete.checkPassword(arg[1], arg[2], arg[3]);
		// MemberDeleteService 객체 생성
		// delete.checkPassword() 호출
	}

	private static void printHelp(){
		System.out.println();
		System.out.println("명령어 사용법을 확인하세요.");
		System.out.println("usage : ");
		System.out.println("모든 정보 출력 : all");
		System.out.println("정보 등록 : new [이메일] [이름] [암호] [암호확인]");
		System.out.println("비밀번호 수정 : change [이메일] [현재비밀번호] [변경할비밀번호]");
		System.out.println("정보 삭제 : delete [이메일] [암호] [암호확인]");
		System.out.println("종료 : exit");
		System.out.println();
	}
}
