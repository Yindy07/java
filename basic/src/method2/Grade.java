package method2;

public class Grade {
	private int grade=0;

	public int getData() {
		return grade;
	}

	public void setData(int grade) {
		if(grade >100 || grade <0)return;
		
		this.grade = grade;
	}

	public char grade(){
		char re = 'F';
		if(grade >= 90) re = 'A';
		else if(grade >=80) re='B';
		else if(grade >=70) re='C';
		else if(grade >=60) re='D';
		return re;
	}
	
}
