package arrayLists;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		
		//<자료형> : 제너릭(Generic) 사용자가 입력될 데이터의 자료형을 선택할 수 있도록 만든 기능
		//자료형 : Wrapper Class
		/*
		 Wrapper Class 종류
		 * -Byte
		 * -Character
		 * -Short
		 * -Integer
		 * -Long
		 * -Float
		 * -Double
		 * -Boolean
		 */
		ArrayList<Integer> list = new ArrayList<>();
		
		Integer data1 = 123;
		Integer data2 = 456;
		int data3 = 789;
		
		
		list.add(data1);
		list.add(data2);
		list.add(data3); //Wrapper Class로 변환되어 값이 들어간다.
		System.out.println(list);

		int data4 = list.get(0);
		Integer data5 = list.get(1);
		Integer data6 = list.get(2);
		
		System.out.println(data4);
		System.out.println(data5);
		System.out.println(data6);
//		list.add(1.12);  제너릭으로 지정했기 때문에 정수형만 입력 가능
//		list.add("asd");
		
		
	}

}
