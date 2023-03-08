package inheritance06;

import java.util.ArrayList;

public class ControlM implements IControlM{

	private ArrayList<DTO> membera = new ArrayList<>();

	@Override
	public void insert(DTO member) {
	
		membera.add(member);
	}

	@Override
	public int mS(String id) {
		for(DTO m : membera) 
			if(m.getId().equals(id))
			 return membera.indexOf(m);
		return -1;
	}

	@Override
	public DTO mindex(int index) {
		return membera.get(index);
	}

	@Override
	public void delete(int index) {
		membera.remove(index);
		
	}

	@Override
	public void update(int index, String cpass, String pass) {
		DTO member = membera.get(index);
		member.setPass(pass);
		membera.set(index, member);
		
	}

	@Override
	public ArrayList<DTO> sAll() {
		return membera;
	}
}
