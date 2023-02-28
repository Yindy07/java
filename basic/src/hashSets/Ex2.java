package hashSets;

import java.util.HashSet;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet<>();
		hs.add(123);
		hs.add(1.23);
		hs.add("순대");
		hs.add(1.23);

		System.out.println("HashSet : " + hs); // set = 제너릭이 정해져 있지 않다면 모든 자료형 입력 가능 중복값 허용하지 않음

	}

}
