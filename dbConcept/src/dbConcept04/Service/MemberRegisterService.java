package dbConcept04.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import dbConcept04.DAO.MemberDAO;
import dbConcept04.DTO.MemberDTO;
import dbConcept04.DTO.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
	 
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	public void regist(RegisterRequest req) {
		if(req.getPassword().equals(req.getConfirmPassword())==false) {
			System.out.println("입력한 비밀번호가 서로 다릅니다.");
			//System.out.println(req.getPassword() + " : " + req.getConfirmPassword() );
			return;
		}
			MemberDTO memberDto = memberDao.selectEmail(req.getEmail());
			if(memberDto == null) {
				MemberDTO member = new MemberDTO();
				member.setEmail(req.getEmail());
				member.setName(req.getName());
				member.setPassword(req.getPassword());
				//memberDto.setRegisterDate(req.getConfirmPassword());		
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm--dd");
				String regDate = sdf.format(date);
				member.setRegisterDate(regDate);
				memberDao.insert(member);
				System.out.println("등록완료");
			}
			else System.out.println("등록된 정보입니다.");
		
		// password == confirmPassword
		// email로 계정 등록 여부 확인
		// memberDao.insert() 계정 등록
	}
}
