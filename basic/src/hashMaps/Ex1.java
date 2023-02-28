package hashMaps;

import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>(); //<키 데이터 타입, 벨류 데이터 타입>
		
		hm.put(0, "test");			//(key,value) 키는 중복 불가 벨류값은 중복 가능
		hm.put(1, "hello");
		
		System.out.println(hm.get(0));

		System.out.println(hm.get(1));
	}

}
