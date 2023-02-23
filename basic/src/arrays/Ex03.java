package arrays;


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];
		System.out.println("arr.length : " + arr.length);
		for(int i = 0; i < arr.length; i++)   //배열 변수명.length : 현재 배열 의 사이즈를 알 수 있는 기본함수
			arr[i] = (i+1)*100;
//		arr[5] = 600;	처음 배열 선언 시 지정한 범위를 벗어나는 행위는 안된다.
		
		for(int i = 0; i < arr.length; i++)   //배열 변수명.length : 현재 배열 의 사이즈를 알 수 있는 기본함수
			System.out.println("arr[" + i +"] : " + arr[i]);
		
		for(int data : arr) { //데이터 가지고 오는
			System.out.println(data);
			
		}
		
	} 
/*
 * 향상 for문
 * for(배열에 저장된 데이터를 저장할 변수 : 배열(두 개 이상 데이터 저장소) ){
 * 
 * }
 */
}
