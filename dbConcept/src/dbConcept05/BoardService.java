package dbConcept05;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class BoardService implements IBoardService{
	private BoardDAO boardDao;
	public BoardService() {
		boardDao = new BoardDAO();
	}
	@Override
	public void insert(BoardDTO board) {
		
		if(board.getSubject() == null || board.getSubject().isEmpty()) {
			System.out.println("제목은 필수 사항입니다.");}
			board.setNum(boardDao.selectMaxNum());
			board.setHit(0);
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String regDate = sdf.format(date);
			board.setWriteTime(regDate);
			boardDao.insert(board);
			System.out.println("등록 완료");
	}

	@Override
	public void selectNum(String n) {
		int num = 0;
		try {
		num = Integer.parseInt(n);}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
		BoardDTO boardDto = boardDao.selectNum(num);
		if(boardDto != null) {
			boardDao.updateHit(num);
			System.out.println("게시글번호\t게시글 제목\t게시글 내용\t게시글 작성자\t게시글 작성일\t게시글 조회수");
			System.out.print(boardDto.getNum() + "\t");
			System.out.print(boardDto.getSubject() + "\t");
			System.out.print(boardDto.getContent() + "\t");
			System.out.println(boardDto.getWriter()+ "\t");
			System.out.print(boardDto.getWriteTime() + "\t");
			System.out.print(boardDto.getHit()+1);
			
		}
		else System.out.println("입력하신 게시글 번호는 없습니다.");
	}

	@Override
	public void selectSubject(String subject) {
		if(subject== null || subject == "") {
			System.out.println("필수 항목입니다. 입력하세요.");
			return;
		}
		ArrayList<BoardDTO> boards = boardDao.selectSubject(subject);
		if(boards.isEmpty() == false) {
			System.out.println("번호\t제목\t내용\t작성자\t작성일\t조회수");
			for(BoardDTO board : boards) {
				System.out.println(board.getNum() + "\t" + board.getSubject() + "\t"
						+ board.getContent() +"\t" +board.getWriter() + "\t"
						+ board.getWriteTime() + "\t" + board.getHit());
			}
		}else {
			System.out.println("게시글을 등록 후 이용하세요.");
		}
	}

	@Override
	public void selectAll() {
		Collection<BoardDTO> boardDto = boardDao.selectAll();
		if(boardDto.isEmpty() == false) {
			System.out.println("게시글번호\t게시글 제목\t게시글 내용\t게시글 작성자\t게시글 작성일\t게시글 조회수");
			for (BoardDTO board : boardDto) {
				System.out.println(board.getNum() + "\t" + board.getSubject() + "\t"
						+ board.getContent() +"\t" +board.getWriter() + "\t"
						+ board.getWriteTime() + "\t" + board.getHit());
			}
		}else {
			System.out.println("등록된 정보가 없습니다.");
		}
		System.out.println();
	}

	@Override
	public void delete(String n) {
		int num = 0;
		try {
		num = Integer.parseInt(n);}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
	//	BoardDTO boardDto = boardDao.selectNum(num);
		int result = boardDao.delete(num);
		if(result == 1)
		System.out.println("삭제완료");
		else System.out.println("등록된 정보가 없습니다.");
	}

	@Override
	public void update(String n, String subject, String content) {
		int num = 0;
		try {
		num = Integer.parseInt(n);}
		catch(Exception e) {
			e.printStackTrace();
		}
		BoardDTO boardDto = boardDao.selectNum(num);
		if(boardDto != null) {
			boardDto.setNum(num);
			boardDto.setSubject(subject);
			boardDto.setContent(content);
			boardDao.update(boardDto);
			System.out.println("수정완료");
		}
		else System.out.println("미등록된 정보입니다.");
	}

	public void disconnection() {
		boardDao.disconnection();
	}
}
