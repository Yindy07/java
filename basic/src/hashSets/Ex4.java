package hashSets;

import java.util.HashSet;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		System.out.println("isEmpty() : " + hs.isEmpty());
		boolean bool;
		bool = hs.add("라면"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool);
		bool = hs.add("현대인"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool); // 중복값이므로 false 반환

		System.out.println("isEmpty : " + hs.isEmpty());
		
		if(hs.contains("고길동1"))
		System.out.println("데이터가 존재합니다.");
		else
		System.out.println("데이터가 존재하지 않습니다"); // 
		
	}

}
