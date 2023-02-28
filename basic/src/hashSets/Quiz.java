package hashSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> lottos = new HashSet<>();
		
		for(int i = 0; i<6; i++)
		{
			int index = (int) (Math.random()*45+1); // == <변수>.nextInt(45)+1;
			if(lottos.contains(index)==false) lottos.add(index);
			else i--;
		}
		ArrayList<Integer> list = new ArrayList<>(lottos);
		Collections.sort(list);
		System.out.print("로또번호 : ");
		for(int i : list)
		System.out.print(i +" ");
	}
}
/*
HashSet<Integer> lottos = new HashSet<>();
Random r = new Random();
while(lottos.size() != 6) {
	lottos.add(r.nextInt(45) + 1);
}

ArrayList<Integer> list = new ArrayList<>(lottos);
list.sort(null);
System.out.println(list);*/