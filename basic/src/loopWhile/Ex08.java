package loopWhile;

public class Ex08 {

	public static void main(String[] args) {
		int i=0, j;
		
		for(i=1; i<=5; i++) {
			for(j=11; j<=15; j++)
			{
				System.out.println("i: " + i + ", j: " + j);
				if(j==14)break;
			}
			if(j==14)break; 			//break문은 하나의 조건이나 반복문만 탈출
			System.out.println("");
			
		}
	}

}
