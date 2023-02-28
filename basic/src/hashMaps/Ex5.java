package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap(); //<제너릭을 설정 받지 않으면 키 값과 벨류값 모든 데이터 형태로 입력가능
		
		map.put("선풍기", 10);
		map.put("에어컨", 100);
		map.put("건조기", 100);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		ArrayList klist = new ArrayList(map.keySet()); //키 값만 뽑아낼 때
		ArrayList vlist = new ArrayList(map.values()); //value 값만 뽑아낼 때
		
		System.out.println(klist.get(0));
		System.out.println(vlist);
	}

}
