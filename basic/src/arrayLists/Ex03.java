package arrayLists;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Integer data1 = 123;
		Integer data2 = 456;
		int data3 = 789;
		
		
		list.add(data1);
		list.add(data2);
		list.add(data3); 
		
		
		for(Integer i : list) {
			System.out.println(i);
		}
		System.out.println("size() : " + list.size()); // list가 사용중인 공간의 크기를 알 수 있다.
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		
		
	}

}
