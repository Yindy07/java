package loopFor;

import java.math.BigInteger;

public class Quiz4 {

	public static void main(String[] args) {
		int i, total = 0, sum=1;
		for(i=1; i<=1000; i++)
		{
			if(i % 4 == 1 && i % 6 == 1)  // 4와 6의 최소공약수 12     i % 12 ==1
			{
				//System.out.println(i);
				total +=i;
			}
		}
		System.out.println("합 : " + total);
		
		
		total=0;
		for(i = 1; i<=30; i++)
		{
			total = total+sum;
			sum*=2;
		}
		System.out.println((i-1)+" 일차 저축 금액 : " + total);
		
		BigInteger mtotal = BigInteger.valueOf(0);   //BigInteger mtotal = new BigInteger.zero; / BigInteger mSeed = new BigInteger.one;
		BigInteger summ = BigInteger.valueOf(1);	//자료형 , 정수형 
		BigInteger two = BigInteger.valueOf(2);		//BigInteger two = new BigInteger("2");
		for(i=1; i<=64; i++)
		{
			mtotal = mtotal.add(summ);
			summ = summ.multiply(two);
			
			System.out.println(i+"번째 사각형 : " + mtotal);
		}
		System.out.println("밀알의 총 갯수 : " + mtotal);
	}
	
}