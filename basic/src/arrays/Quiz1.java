package arrays;


public class Quiz1 {

	public static void main(String[] args) {
		int[] arr = {10, 54, 13, 17, 25, 30};
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] % 2 ==0)System.out.println("짝수 : " + arr[i]);
			else System.out.println("홀수 : " + arr[i]);
			}
		}
	} 
/*
 * 향상 for문
 * for(배열에 저장된 데이터를 저장할 변수 : 배열(두 개 이상 데이터 저장소) ){
 * 
 * }
 */
