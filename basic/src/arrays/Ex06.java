package arrays;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		int [] arr = { 4, 8, 2, 7, 6};
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		for(int i=0; i < arr.length-1; i++) {
			for(int j=i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) //내림차순  |  arr[i]>arr[j]>>오름차순
				{
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
				
		}
		System.out.print("정렬 후 : ");
		for(int data : arr)
			System.out.print(data + " ");
		System.out.println();
	}	
} 
/*
 * 향상 for문
 * for(배열에 저장된 데이터를 저장할 변수 : 배열(두 개 이상 데이터 저장소) ){
 * 
 * }
 */
