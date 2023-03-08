package inheritance05;

import java.util.ArrayList;
//MVC = Model:데이터관리(DAO<-Repository,Service<-blabla-Service) View: 화면출력 Control : 제어/입력
public class MemberServiceImpl implements IMemberService{
	/*
	 MemberMain : 사용자 입력 값을 전달받아 MemberServiceImpl 안 Method 호출
	 MemberServiceImpl 
	 : MemberMain에서 전달한 데이터를 받아 데이터검증 및 MemberDaoImpl Method호출 
	 : 데이터 검증은 사용자 입력 값에 따라 등록/미등록 출력
	 MemberDaoImpl : 데이터 저장소 관리(Create, Read, Update, Delete)
	 */
	int index;
	IMemberDAO memberDao = new MemberDaoImpl();
	@Override
	public void insert(String email, String name, String mobile) {
		
		index = memberDao.findIndexByEmail(email);
		if(index==-1) {
		MemberDTO member = new MemberDTO();
		member.setEmail(email);
		member.setMobile(mobile);
		member.setName(name);
		
		memberDao.insert(member);
		System.out.println("회원 등록이 되었습니다.");
		}
		else System.out.println("등록된 정보입니다.");
	}

	@Override
	public void selectEmail(String email) {
		index = memberDao.findIndexByEmail(email);
		if(index==-1) System.out.println("미등록 정보입니다.");
		else {
			MemberDTO member = memberDao.selectEmail(index);
			System.out.println("이메일 : " + member.getEmail());
			System.out.println("이름 : " + member.getName());
			System.out.println("전화번호 : " + member.getMobile());
		}
		
	}

	@Override
	public void selectAll() {
		ArrayList<MemberDTO> members = memberDao.selectAll();
		if(members.isEmpty() == false)
		{
			for(MemberDTO m : members) {
				System.out.println("이메일 : " + m.getEmail());
				System.out.println("이름 : " + m.getName());
				System.out.println("전화번호 : " + m.getMobile());
				System.out.println();
			}
		}
		else System.out.println("등록된 정보가 없습니다.");
		
	}

	@Override
	public void update(String email, String name, String mobile) {
		index = memberDao.findIndexByEmail(email);
		if(index==-1) System.out.println("미등록 정보입니다.");
		else memberDao.update(index, name, mobile);
		
	}

	@Override
	public void delete(String email) {
		index = memberDao.findIndexByEmail(email);
		if(index==-1) System.out.println("미등록 정보입니다.");
		else {
		memberDao.delete(index);
		System.out.println("삭제되었습니다.");}
	}
	
}
