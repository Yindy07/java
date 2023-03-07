package constructor;


public class PartTimeMain {
	public static void main(String[] args) {
		
		PartTime PartTime1 = new PartTime("김파트", 160, 9500);
		PartTime PartTime2 = new PartTime("이파트", 160, 10000);
		PartTime PartTime3 = new PartTime("박파트", 160, 15000);
		
		
		System.out.println("이름 : " + PartTime1.getName());
		System.out.println("급여 : " + PartTime1.getSalary()+"원");
		
		System.out.println("이름 : " + PartTime2.getName());
		System.out.println("급여 : " + PartTime2.getSalary()+"원");
		
		System.out.println("이름 : " + PartTime3.getName());
		System.out.println("급여 : " + PartTime3.getSalary()+"원");
	}
}



