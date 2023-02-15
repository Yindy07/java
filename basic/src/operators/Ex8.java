package operators;

public class Ex8 {
	public static void main(String[] args) {
		int data = 55, data2 = 22, or=0, and=0, xor=0;
		//55=110111  22=010110 
		or = data | data2; //110111
		and = data & data2;//010110
		xor = data ^ data2;//100001
		
		System.out.println("data | data2 =" + or);
		System.out.println("data & data2 =" + and);
		System.out.println("data ^ data2 =" + xor);
			
	}
}









