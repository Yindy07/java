package loopFor;

public class Ex06 {

	public static void main(String[] args) {
		for(int i=1 ;; i++) // i<=10000 
		{
			System.out.println(i+" 번째 출력"); //for문에 조건식을 안넣으면 true로 인식 무한루프
//			if(i==10000)break; 조건식을 빼서 사용 가능
		}
	}
}
