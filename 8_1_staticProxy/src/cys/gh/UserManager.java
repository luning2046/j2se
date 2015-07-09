package cys.gh;

public interface UserManager {
	
	public void add(String name,String password);
	public void delete(int id);
	public void update(int id);
	public String get(int id);
}
