package arrayLists;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
//		String data4;
		
		list.add(data1);
		list.add(data2);
		list.add(data3); 
		list.add("좌변수");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("size() : " + list.size()); // list가 사용중인 공간의 크기를 알 수 있다.
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}	
	}
}
