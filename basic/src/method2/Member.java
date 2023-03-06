package method2;

import java.util.HashMap;
import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	private HashMap<String, String> passwords = new HashMap<>();
	private HashMap<String, String> names = new HashMap<>();
	
	public void insert(String id, String pass, String name)
	{
		if(passwords.containsKey(id) == false) {
			passwords.put(id, pass);
			names.put(id, name);
		}
		else System.out.println(id + " 중복");
	}
	public void selectId() {
		
	}
	public void delete(String id) {
		if(passwords.containsKey(id)) {
			passwords.remove(id);
			names.remove(id);
		}
		else System.out.println("등록된 id가 아닙니다.");
		}
	public void selectAll() {
		
		for(int i=0; i<passwords.size(); i++)
			System.out.println(passwords.keySet()+"\t"+passwords.get(i)+"\t"+names.get(i));
	}
	public void update(String id) {
		if(passwords.containsKey(id)) {
			System.out.print("변경할 비밀번호 : ");
			String pass = sc.next();
			System.out.print("변경할 이름 : ");
			String name = sc.next();
			passwords.put(id, pass);
			names.put(id, name);
		}
		else System.out.println("등록된 id가 아닙니다.");
		}
	}
