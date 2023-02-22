package loopFor;

public class Quiz {

	public static void main(String[] args) {
		int i, sum=0, count=0;
		for(i=1 ;i<5; i++)
		{
			System.out.println(i+" .hello");
		}
		for(i=1;; i++)
		{
			sum+=i;
			if(sum == 528) {
				System.out.println("합이 " + sum+" 일 때 i : " + i);
				break;
			}
		}
		for(i=1; i<=25; i++)
		{
			System.out.print(i + "\t");
			if(i % 5 == 0 )System.out.println();
//			//System.out.printf("%02d",i);
//			if(i<10)
//			System.out.print("  ");
//			else System.out.print(" ");
//			count++;
//			if(count > 4)
//			{
//				System.out.println();
//				count=0;
//			}
		}
					
	}
}
