package hashSets;

import java.util.HashSet;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		boolean bool;
		bool = hs.add("라면"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool);
		bool = hs.add("현대인"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool); // 중복값이므로 false 반환

		System.out.println("HashSet : " + hs); 
		System.out.println(hs.remove("라면"));
		System.out.println(hs.remove("김밥")); // 없는 데이터이므로 false 반환
		System.out.println("HashSet : " + hs);
	}

}
