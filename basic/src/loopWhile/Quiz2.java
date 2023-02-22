package loopWhile;


import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 쌀 102,000g     2마리가 있고 하루에 40g 10일마다 2배씩 증가 며칠만에 쌀이 바닥나고 , 쥐의 마리수는 총 몇마리
		//증감식은 탈출문 이후 처리
		int r = 102*1000;
		int m = 2;
		int d=1;
		
		while(true)
		{
			r=r-m*20;
			if(d % 10 == 0)m*=2;
			if(r<=0)break;
			d++;
		}
		System.out.println("쌀이 바닥난 날 : " + d + "일 , 쥐의 총 마리수 : " + m + " 쌀 : "+ r);
		System.out.println();
		
		
		///1*2-2*3+3*4-4*5 ... 같은 규칙으로 합계를 구할 때 합이 100이 넘는 마지막 수 2개를 구하는 프로그램
		
		int total=0, a=1,b=2;
		boolean re = true;
		while(true)
		{
			if(re == true) {
				total += a*b;
				re = false;
				//System.out.println("합계(+) : " +total);
			}
			else {
				total-=a*b;
				re = true;
				//System.out.println("합계(-) : " +total);
			}
			if(total > 100)break;
			a++;
			b++;
		}
//		int data =1;  			짝수일 때 - 홀수일 때 +
//		if(data % 2 == 1)
//			total +=data * (data+1);
//		else total -= data * (data+1);
//		
//		if(total > 100)
//			break;
//		data++;
		System.out.println("합계 : " +total);
		System.out.println("합이 100이 넘을 때 마지막 2개의 수는 : " + a + "," + b);
		
	}

}
