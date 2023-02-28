package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap(); //<제너릭을 설정 받지 않으면 키 값과 벨류값 모든 데이터 형태로 입력가능
		
		map.put("선풍기", "10");
		map.put("에어컨", "100");
		map.put("건조기", "1000");
		
		Iterator<String> itk = map.keySet().iterator();
		while(itk.hasNext())
		{
			String key = itk.next();
			System.out.println(key + " : " + map.get(key)); //map.get(key) == value 뽑아오기
		}
		
		Iterator<String> itv = map.values().iterator();							//hashset 부모 = set | set 부모 = Collection |
		while(itv.hasNext())
		{
			String value = itv.next();
			System.out.println(value);					// value만 뽑기
		}
	}

}
