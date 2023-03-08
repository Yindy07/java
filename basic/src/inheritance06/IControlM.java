package inheritance06;

import java.util.ArrayList;

public interface IControlM {
	public void insert(DTO member);
	public int mS(String id);
	public DTO mindex(int index);
	public void delete(int idex);
	public void update(int index, String name, String pass);
	public ArrayList<DTO> sAll();
}
