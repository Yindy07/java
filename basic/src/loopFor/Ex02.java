package loopFor;

public class Ex02 {

	public static void main(String[] args) {
		int i, total = 0;
		for(i = 1; i<=100; i++)
			{total += i;}
		System.out.println("for문이 종료 된 후 : " + i);
		System.out.println("1~100 : " + total);
		//////////////////////////////////////////////

		total=0;
		for(i = 333; i<=897; i++)
			{total += i;}
		System.out.println("for문이 종료 된 후 : " + i);
		System.out.println("333~897 : " + total);
		//////////////////////////////////////////////

		total=0;
		for(i = 1; i<=100; i+=2)
			{total += i;}
		System.out.println("for문이 종료 된 후 : " + i);
		System.out.println("1~100 안 홀수 합 :  " + total);
		
		//////////////////////////////////////////////
		total=0;
		for(i = 2; i<=100; i+=2)
			{total += i;}
		System.out.println("for문이 종료 된 후 : " + i);
		System.out.println("1~100 안 짝수 합 :  " + total);
		
		
		//////////////////////////////////////////////
		total=0; int count = 0;
		for(i=1; i<=100; i++) {
			
			if(i%2==1) {
				total = total+i;
			count++;}
		}
		System.out.println("1~100 안 홀수 합 :  " + total);
		System.out.println("1~100 안 홀수 개수 : " + count);
	}
}
