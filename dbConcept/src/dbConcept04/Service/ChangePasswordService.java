package dbConcept04.Service;

import dbConcept04.DAO.MemberDAO;
import dbConcept04.DTO.MemberDTO;

public class ChangePasswordService {
	private MemberDAO memberDao;
	MemberDTO members = null;
	public ChangePasswordService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void changePassword(String email, String oldPw, String newPw) {
		// 이메일 등록여부 확인.
		// 패스워드 확인 및 MemberDAO.update() 호출 
		
		members = memberDao.selectEmail(email);
		if(members != null) {
			members = new MemberDTO();
			members.setEmail(email);
			if(members.getPassword().equals(oldPw)) {
			members.setPassword(oldPw);
			members.setRegisterDate(newPw);
				memberDao.update(members);
				System.out.println("정보가 수정되었습니다.");
				}
			else System.out.println("비밀번호가 틀립니다. 다시 시도하세요.");
				}
		else
			System.out.println("미등록 정보 입니다.");
			}
	}