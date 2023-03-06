package method02;

import java.util.HashMap;
import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	private static HashMap<String, String> passwords = new HashMap<>();
	private static HashMap<String, String> names = new HashMap<>();
	
	public static void insert(String id, String pass, String name)
	{
		if(passwords.containsKey(id) == false) {
			passwords.put(id, pass);
			names.put(id, name);
		}
		else System.out.println(id + " 중복");
	}
	public static void selectId(String id) {
		if(passwords.containsKey(id) == false) {
			System.out.println("등록되지 않은 아이디입니다.");
		}else {
			System.out.println("## 회원 검색 결과 ##");
			System.out.println("아이디 : " + id);
			System.out.println("비밀번호 : " + passwords.get(id));
			System.out.println("이름 : " + names.get(id));
		}
		System.out.println();
	}
	public static void delete(String id) {
		if(passwords.containsKey(id) == false) {
			System.out.println("등록되지 않은 아이디입니다.");
		}else {
			names.remove(id);
			passwords.remove(id);
			System.out.println(id + " 계정 정보 삭제 완료");
			System.out.println();
		}
	}
	public static void selectAll() {
		
		for(String key : names.keySet()) {
			System.out.println("아이디 : " + key);
			System.out.println("비밀번호 : " + passwords.get(key));
			System.out.println("이름 : " + names.get(key));
		}
	}
	public static void update(String id) {
		Scanner sc = new Scanner(System.in);
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
