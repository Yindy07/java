package arrays;

import java.util.Random;

public class Quiz5 {

	public static void main(String[] args) {
	
		Random r = new Random();
		r.nextInt();
		int[] lottos = new int[6];
		for(int i=0; i<lottos.length; i++) {
			
			lottos[i] = r.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				if(lottos[i] == lottos[j]) {
					i--;
					break;
					}
				}
			}
			
		for(int i=0; i < lottos.length-1; i++) {
			for(int j=i+1; j < lottos.length; j++) {
				if(lottos[i] > lottos[j]) //내림차순  |  lottos[i]>lottos[j]>>오름차순
				{
					int tmp = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = tmp;
				}
			}
			
		}	
		System.out.print("번호 : ");
		for(int i=0; i<lottos.length; i++)
		System.out.print(lottos[i] + " ");
		System.out.println();
	}
}