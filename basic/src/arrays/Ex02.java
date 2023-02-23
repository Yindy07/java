package arrays;


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints1 = new int[5];
		
		ints1[0] = 100;
		ints1[1] = 200;
		ints1[2] = 300;
		ints1[3] = 400;
		ints1[4] = 500;
//		ints1[5] = 600;	처음 배열 선언 시 지정한 범위를 벗어나는 행위는 안된다.
		
		System.out.println("ints1[0] : " + ints1[0]);
		System.out.println("ints1[1] : " + ints1[1]);
		System.out.println("ints1[2] : " + ints1[2]);
		System.out.println("ints1[3] : " + ints1[3]);
		System.out.println("ints1[4] : " + ints1[4]);
	} 

}
