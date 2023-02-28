package hashMaps;

import java.util.HashMap;

public class Ex2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap(); //<제너릭을 설정 받지 않으면 키 값과 벨류값 모든 데이터 형태로 입력가능
		
		hm.put(0, 1000);			//(key,value) 키는 중복 불가 벨류값은 중복 가능
		hm.put(1, "hello");			
		hm.put("naver", "https://www.naver.com");
		
		System.out.println(hm.get(0));

		System.out.println(hm.get(1));
		
		System.out.println(hm.get("naver"));
		
		System.out.println(hm);		//모든 값 출력시 중괄호로 나온다.
	}

}
