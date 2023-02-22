package loopWhile;


import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//수를 입력 받았을 때 그 수 사이에 3,6,9는 몇개가 들어있는지 출력 값 입력하면 출력
		
		System.out.print("수 입력 : ");
		int num=sc.nextInt();
		int count=0;
		int k,g;
		for(int i=1; i<=num; i++)
		{
				g=i;
				while(true) {
				k=g%10;
				if(k==3 || k==6 || k==9)count++;
				g=g/10;
				if(g==0)break;
				}
		}
		System.out.println("값 : " + num);
		System.out.println(num+"까지의 3, 6, 9 갯수 : " + count);
		
	}

}
