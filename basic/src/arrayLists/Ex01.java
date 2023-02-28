package arrayLists;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // 반복문 사용 시 데이터 타입을 구분하여 사용해야한다. 같은 데이터 타입이 들어있는 어레이리스트를 사용하는게 좋다.
		
		Object data1 = 123;
		Object data2 = 1.23;
		Object data3 = "123";
		
		list.add(123);
		list.add(1.23);
		list.add("문자열");
		
		System.out.println("저장된 데이터 : " + list);
		
		int data4 = (int) list.get(0);
		double data5 = (double)list.get(1);
		String data6 = (String)list.get(2);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//자바의 최상의 클래스는 오브젝트Object e : 모든 데이터 형태 저장 가능 ex)Object data1 = 123; Object data2 = "123";
	}

}
