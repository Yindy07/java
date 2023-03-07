package inheritance03;

import java.util.ArrayList;

public class MemberDaoImpl implements IMemberDAO{
	
	private ArrayList<String> emails;
	private ArrayList<String> names;
	private ArrayList<String> mobiles;
	
	public MemberDaoImpl() {
		 emails = new ArrayList<>();
		 names = new ArrayList<>();
		 mobiles = new ArrayList<>();
	}
	
	@Override
	public void insert(String email, String name, String mobile) {
		// TODO Auto-generated method stub
		if(emails.contains(email)==false) {
		emails.add(email);
		names.add(name);
		mobiles.add(mobile);}
		else System.out.println("중복된 이메일이 있습니다.");
	}

	@Override
	public void selectEmail(String email) {
		int index = emails.indexOf(email);
		if(emails.contains(email))
		{
			System.out.println("이메일\t이름\t전화번호");
			System.out.println(email+"\t"+names.get(index)+"\t"+mobiles.get(index));
		}
		else System.out.println("등록된 회원이 아닙니다.");
	}

	@Override
	public void selectAll() {
		System.out.println("이메일\t이름\t전화번호");
		for(int i=0; i<emails.size(); i++)
		{
			System.out.println(emails.get(i)+"\t"+names.get(i)+"\t"+mobiles.get(i));
		}
		System.out.println();
	}

	@Override
	public void delete(String email) {
		int index = emails.indexOf(email);
		if(emails.contains(email))
		{
			System.out.println("삭제완료");
			emails.remove(index);
			names.remove(index);
			mobiles.remove(index);
		}
		else System.out.println("등록된 회원이 아닙니다.");
	}

	@Override
	public void update(String email, String name, String mobile) {
		int index = emails.indexOf(email);
		if(emails.contains(email))
		{
			System.out.println("변경완료");
			names.set(index, name);
			mobiles.set(index, mobile);
		}
		else System.out.println("등록된 회원이 아닙니다.");
	}
}
