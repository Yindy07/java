package loopWhile;

public class Ex01 {

	public static void main(String[] args) {
		int i=1, sum=0;
		
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1~10까지의 합 : "+sum);
	}

}
