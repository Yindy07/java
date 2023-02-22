package loopWhile;


import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=0, sum=0;
		System.out.print("수 입력 :");
		i=input.nextInt();
		
		while(true)
		{
			int tmp = i%10;
			i/=10;
			System.out.print(tmp + " ");
			if(i==0)break;
			
		}
		
	}

}
