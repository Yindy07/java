package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3); 
		list.add("최변수");
		

		System.out.println("담겨 있는 모든 데이터 : " + list);
		
		System.out.print("삭제 데이터 입력(데이터 삭제) : ");
		String tmp = sc.next();
		System.out.println("list.remove(tmp) : " + list.remove(tmp));//데이터 유무와 상관 없이 삭제가 진행
		System.out.println("담겨 있는 모든 데이터 : " + list);
		
		
		System.out.print("삭제 데이터 입력(인덱스 삭제 : ");
		tmp = sc.next();
		int index = list.indexOf(tmp);
		if(index != -1)
		System.out.println("list.remove(index) : " + list.remove(index)); // 데이터가 있을 때에만 삭제해줘
		System.out.println("담겨 있는 모든 데이터 : " + list);
		
	}
}
/*add(index, data);
set(index, data);
get(index);
remove(index);
*/