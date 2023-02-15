package operators;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력:");
		int data = sc.nextInt();
		String result = (data % 2 ==0)? "짝수" : "홀수";
		System.out.println(data + " = " + result);
		
		result = (data % 3 ==0)? "3의 배수이다" : "3의 배수가 아니다";
		System.out.println(data + " = " + result);
		
		System.out.print("두수 입력:");
		data = sc.nextInt();
		int data2 = sc.nextInt();
		
		System.out.println("data: "+ data + ", data2: " + data2);
		result = (data == data2)? data+"과/와"+data2+"는 같은 수 입니다." : (data2 > data)? data2+"과/와"+
		data+"중 큰 수는"+data2+"입니다." : data+"과/와"+
				data2+"중 큰 수는"+data+"입니다.";
		System.out.println(result);
		sc.close();
	}
}

