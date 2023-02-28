package hashSets;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("라면");
		hs.add("김밥");
		hs.add("순대");
		hs.add("김밥");

		System.out.println("HashSet : " + hs); // set = 중복 값 입력이 안되며 저장 순서도 어느 규칙에 따라 랜덤.

		ArrayList<String> list = new ArrayList<>();

		list.add("라면");
		list.add("김밥");
		list.add("순대");
		list.add("김밥");

		System.out.println("ArrayList : " + list);
	}

}
