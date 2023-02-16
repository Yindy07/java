package conditions;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sna, coff, air=30000, t;
		double re = 0;
		System.out.print("과자 갯수 : ");
		sna = sc.nextInt();
		if(sna >=100) re = (sna * 1000)*0.88;
		else if(sna >=10) re = (sna * 1000)*0.9;
		else re = sna*1000;
		System.out.println("금액 : "+ (int)re + "원");
		////////////////////////////////////////////////////////////////////
		System.out.print("커피 갯수 : ");
		coff = sc.nextInt();
		if(coff>10)re = (coff*2000-(coff-10)*500);
		else re = coff*2000;
		System.out.println("총 커피 금액 : " + (int)re + "원");
		///////////////////////////////////////////////////////////////////
		System.out.print("비행시간 : "); 
		t = sc.nextInt();
		if(t <=30) re = air;
		else re = air + (((t-31)/10)+1)*5000;
		//(t-21) / 10*5000;
		System.out.println((int)re);
		sc.close();	
	}
}