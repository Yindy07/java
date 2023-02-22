package loopFor;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, line, star, space, jp;
		System.out.print("홀수를 입력하세요 : ");
		jp = sc.nextInt();
		line = jp;
		star = 1;
		space = line /2 ;
		for(i = 0 ; i<line; i++)
		{
			for(j = 0; j < space; j++)
				System.out.print(" ");
			for(j = 0; j<star; j++)
				System.out.print("★");
			 System.out.println();
			 
			 if(i < line/2)
			 {
				 star += 2;
				 space--;
			 }
			 else {
				 star -= 2;
				 space++;
			 }
			 
		}
		//////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		star = line/2;
		space = 1 ;
		
		for(i = 0 ; i<line; i++)
		{
			for(j = 0; j < star; j++)
				System.out.print("★");
			for(j = 0; j<space; j++)
				System.out.print(" ");
			for(j = 0; j < star; j++)
				System.out.print("★");
			 System.out.println();
			 
			 if(i < line/2)
			 {
				 space += 2;
				 star--;
			 }
			 else {
				 space -= 2;
				 star++;
			 }
			 
		}
		}
}
	
