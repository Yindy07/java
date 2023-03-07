package constructor;

public class EvenOddMain {

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		
		eo.setData(10);
		if(eo.result())
		{
			System.out.println(eo.getData()+ "은/는 " + "짝수입니다.");
		}
		else
		{
			System.out.println(eo.getData()+ "은/는 " + "홀수입니다.");
		}
		EvenOdd eo2 = new EvenOdd();
		eo2.setData(21);
		
		if(eo2.result())
		{
			System.out.println(eo2.getData()+ "은/는 " + "짝수입니다.");
		}
		else
		{
			System.out.println(eo2.getData()+ "은/는 " + "홀수입니다.");
		}
	}

}
