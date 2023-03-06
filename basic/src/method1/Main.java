package method1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class Main {

		@SuppressWarnings("static-access")
		public static void main(String[] args)
		{
			HashSet<String> set = new HashSet<>();
			set.add("data");
			
			ArrayList<String> list = new ArrayList<>(set);
			
			list.add("asd");
			list.add(0, "asdasd");
			list.indexOf("asd");
			list.remove(0);
			list.isEmpty();
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			sc.next();
			
			Random r = new Random();
			r.nextInt(10);
			
			Math.random();
			System.out.println();
			System.out.println(10);
			System.out.println('a');
			System.out.println("asd");
			
			Sub.method03();
			
			Sub sub = new Sub("Asd");
			sub.method01();
			sub.method02();
			sub.method03();
			
			
		/**	Object intData = 10;
			Object doubleData = 10.123;
			Object strData = "string";*/
			
		}
}
