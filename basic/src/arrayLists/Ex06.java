package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
//		String data4;
		
		list.add(data1);
		list.add(data2);
		list.add(data3); 
		list.add("최변수");
		
		System.out.println("list.indexOf(\"최변수\")" + list.indexOf("최변수")); //indexOf 데이터 포함 여부
		System.out.println("list.indexOf(\"최상수\")" + list.indexOf("최상수"));// -1:데이터 없는 것 -1이외 : 데이터 있다.
		System.out.println("담겨 있는 모든 데이터 : " + list);
		System.out.print("데이터 확인 : ");
		String tmp = sc.next();
		int index = list.indexOf(tmp);
		if(index != -1)				//데이터를 유무판단 동시에  index 값도 가져온다.
			System.out.println(list.get(index) + "는 존재합니다.");
		else System.out.println(tmp + "는 존재하지 않습니다.");
		
		
	}
}
/*add(index, data);
set(index, data);
get(index);
remove(index);
*/