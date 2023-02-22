package loopWhile;

import java.util.Random;

public class Ex09 {

	public static void main(String[] args) {
		int i=0, j;
		Random r = new Random();
		r.nextInt();
		r.nextDouble();
		
				for(i=1; i<=3; i++) 
					System.out.println((int)(Math.random()*10)+5);
				System.out.println();
				
				for(i=1; i<=3; i++) 
					System.out.println(r.nextInt(10)+1);//1~10
					System.out.println();
					
				int begin = 33;
				int end = 89;
				for(i=1; i<=3; i++) 
					System.out.println(r.nextInt(end - begin +1)+11); // 33~67
				
				System.out.println();
				for(i = 1; i<=3; i++)
					System.out.println((int)(Math.random()*(end - begin +1))+begin);
		}
}


