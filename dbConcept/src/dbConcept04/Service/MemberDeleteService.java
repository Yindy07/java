package dbConcept04.Service;

import dbConcept04.DAO.MemberDAO;
import dbConcept04.DTO.MemberDTO;

public class MemberDeleteService {
	
	private MemberDAO memberDao;
	MemberDTO members = null;

	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void checkPassword(String email, String password, String confirmPassword) {
		members = memberDao.selectEmail(email);
		if(members == null) {
			System.out.println("미등록 정보입니다.");
		}
		else {
			if(members.getPassword().equals(password)) {
				memberDao.delete(email);
				System.out.println("정보가 삭제되었습니다.");
				}
			else
				System.out.println("패스워드가 다릅니다.");
			}
		
		
		// 패스워드 확인
		// MemberDAO 객체 내 selectEmail() 메소드를 호출 
		// 저장된 회원 정보와 입력된 회원 정보 검증
		// MemberDAO 객체 내 delete() 호출
	}
}

