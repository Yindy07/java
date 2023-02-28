package hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap(); //<제너릭을 설정 받지 않으면 키 값과 벨류값 모든 데이터 형태로 입력가능
		
		map.put("선풍기", 10);
		map.put("에어컨", 100);
		map.put("건조기", 100);
		
		System.out.print("키 입력 : ");
		String key = sc.next();
		
		System.out.print("값 입력 : ");
		int val = sc.nextInt();
		
		System.out.println(map);
		
		System.out.println(key + "키 검색 결과 : " + map.containsKey(key));
		System.out.println(val + "값 검색 결과 : " + map.containsValue(val));
		
	}

}
