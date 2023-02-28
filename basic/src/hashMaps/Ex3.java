package hashMaps;

import java.util.HashMap;

public class Ex3 {

	public static void main(String[] args) {
		HashMap map = new HashMap(); //<제너릭을 설정 받지 않으면 키 값과 벨류값 모든 데이터 형태로 입력가능
		
		map.put("선풍기", 10);
		map.put("에어컨", 100);
		map.put("건조기", 100);
		
		System.out.println("선풍기 : " + map.get("선풍기") + "만원");
		System.out.println("에어컨 : " + map.get("에어컨") + "만원");
		System.out.println("건조기 : " + map.get("건조기") + "만원");
		System.out.println("없는키 : " + map.get("없는키") + "만원"); ///없는 키를 넣으면 null 값 반환
	}

}
