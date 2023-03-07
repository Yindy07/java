package inheritance03;

import java.util.ArrayList;

public class PermanentMain {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Permanent("김변수",3000000));
		list.add(new Permanent("이상수",4000000));
		list.add(new Permanent("박참조",5000000));
		list.add(new PartTime("김파트",160, 9500));
		list.add( new PartTime("이파트",160, 10000));
		list.add(new PartTime("박파트",160, 15000));
		
		for(Employee e : list) {
			System.out.println("이름 : " + e.getName());
			IEmployee ie = 
					(IEmployee)e;
			System.out.println("급여 : " + ie.getSalary()+"원");
		}
	}
}