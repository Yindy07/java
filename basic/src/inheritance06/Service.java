package inheritance06;

import java.util.ArrayList;


public class Service implements Im{
	int index;
	IControlM members = new ControlM();
	
	@Override
	public void insert(String id, String name, String pass) {
		index = members.mS(id);
		if(index==-1) {
		DTO member = new DTO();
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		
		members.insert(member);
		System.out.println("회원 등록이 되었습니다.");
		}
		else System.out.println("등록된 정보입니다.");
	}

	@Override
	public void mS(String id) {
		index = members.mS(id);
		if(index==-1) System.out.println("미등록 정보입니다.");
		else {
			DTO member = members.mindex(index);
			System.out.println("아이디 : " + member.getId());
			System.out.println("이름 : " + member.getName());
			System.out.println("비밀번호 : " + member.getPass());
		}
		
	}

	@Override
	public void delete(String id) {
		index = members.mS(id);
		if(index==-1) System.out.println("미등록 정보입니다.");
		else {
			members.delete(index);
			System.out.println("삭제완료");}
		
	}

	@Override
	public void update(String id, String cpass, String pass) {
		index = members.mS(id);
		if(index==-1) System.out.println("미등록 정보입니다.");
		else {
			DTO member = members.mindex(index);
			if(member.getPass().equals(cpass)==false) System.out.println("현재 비밀번호가 틀립니다.");
			else {
			members.update(index, cpass, pass);
			System.out.println("수정완료");}
			}
	}

	@Override
	public void sAll() {
		ArrayList<DTO> membere = members.sAll();
		if(membere.isEmpty() == false)
		{
			System.out.println("ID\t 이름 \t 비밀번호");
			for(DTO list : membere)
			{
				System.out.println(list.getId()+ "\t " + list.getName() + "\t " + list.getPass());
			}
		}
	}

}
