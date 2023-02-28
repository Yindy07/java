package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("김상수"); list.add("이변수");
		list.add("박참조"); list.add("조클래스");
		list.add("지컬렉션");
		
		System.out.println(list);
		
		System.out.print("변경할 위치 : ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		
		System.out.print("변경 데이터 : ");
		String element = input.next();
		//list.set(index, element); //update 변경
		list.add(index, element); //insert 삽입
		
		System.out.println(list);
		System.out.println("====== 결과 ======");
		
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		
	}
}
/*add(index, data);
set(index, data);
get(index);
remove(index);
*/