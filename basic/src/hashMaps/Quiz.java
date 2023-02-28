package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap(); //<제너릭을 설정 받지 않으면 키 값과 벨류값 모든 데이터 형태로 입력가능
		
		while(true)
		{
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.print(">>>");
			
			int re= sc.nextInt();
			switch(re)
			{
				case 1 : 
					System.out.print("메뉴 등록 (이름, 가격): ");
					String key = sc.next();
					int value = sc.nextInt();
					map.put(key, value);
					break;
				case 2 :
					Iterator<String> key1 = map.keySet().iterator();
					while(key1.hasNext())
					{
						String key2 = key1.next();
						System.out.println(key2 + " : " + map.get(key2)+ "원"); //map.get(key) == value 뽑아오기
					}
					
					break;
				case 3 : System.out.println("종료");
				System.exit(0);
				default : System.out.println("메뉴를 확인해 주세요");
				break;
			}
		}
	}

}
