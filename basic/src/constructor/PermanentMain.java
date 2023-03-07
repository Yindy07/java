package constructor;


public class PermanentMain {
	public static void main(String[] args) {
		
		
		Permanent permanent1 = new Permanent("김변수", 3000000);
		Permanent permanent2 = new Permanent("이상수", 4000000);
		Permanent permanent3 = new Permanent("박참조", 5000000);
		
		
		System.out.println("이름 : " + permanent1.getName());
		System.out.println("급여 : " + permanent1.getSalary()+"원");
		
		System.out.println("이름 : " + permanent2.getName());
		System.out.println("급여 : " + permanent2.getSalary()+"원");
		
		System.out.println("이름 : " + permanent3.getName());
		System.out.println("급여 : " + permanent3.getSalary()+"원");
	}
}

