package dbConcept05;

import java.util.Scanner;
public class Main {
	private	static Scanner in = new Scanner(System.in);
	//private static String num, sub, con;
	public static void main(String[] args) {
		BoardService boards = new BoardService();
		BoardDTO dto = new BoardDTO();
		while (true) {
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 번호 검색"); // 번호가 기본키   게시글 검색할 때 마다 조회수 증가
			System.out.println("3. 게시글 제목 검색");  //like 부분일치 like'%2%'
			System.out.println("4. 게시글 모두 보기");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 게시글 수정");
			System.out.println("7. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:in.nextLine();
				System.out.print("게시글 제목 : ");String sub  = in.nextLine();
				System.out.print("게시글 내용 : ");String con  = in.nextLine();
				System.out.print("게시글 작성자 : ");String writer  = in.next();
				dto.setSubject(sub);
				dto.setContent(con);
				dto.setWriter(writer);
				boards.insert(dto); break;
			case 2:	System.out.print("검색할 게시글 번호 : ");String num = in.next();
				boards.selectNum(num); break;
			case 3:	System.out.print("검색할 게시글 제목 : ");sub = in.next();
				boards.selectSubject(sub); break;
			case 4:	boards.selectAll(); break;
			case 5:	
				System.out.print("삭제할 게시글 번호 :"); num = in.next();
				boards.delete(num); break;
			case 6:
				System.out.print("수정할 게시글 번호 : "); num = in.next();
				System.out.print("수정할 제목 : "); sub = in.nextLine();
				System.out.print("수정할 내용 : ");con = in.nextLine();
				boards.update(num, sub, con); break;
			case 7: boards.disconnection();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}	
}
