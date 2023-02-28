package hashSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		
		hs.add("1.대부");
		hs.add("2.반지의 제왕"); 
		hs.add("3.겨울왕국");
		hs.add("4.다크 나이트"); 
		hs.add("5.해리포터");
		hs.add("6.공공의 적");

		for(String data : hs)
			System.out.println(data);		//hashset = 데이터 변경 불가능 변경하려면 ArrayList사용해야함
		
		System.out.println();
		Iterator<String> it =hs.iterator();		
		while(it.hasNext())
		{
			String data2 = it.next();
			System.out.println(data2);
		}
		System.out.println();
		ArrayList<String> list = new ArrayList<>(hs); //hashSet 데이터를 ArrayList로 넣는 방법
		System.out.println(list);
		list.sort(null); //오름차순
		System.out.println("정렬 후");
		System.out.println(list);
		
		Collections.sort(list); //오름차순
		System.out.println();
		System.out.println(list);
		System.out.println("오름차순 후 내림차순으로 변경");
		Collections.reverse(list); //내림차순     | reverse : 데이터 값을 좌우반전
		System.out.println(list);
	}

}
