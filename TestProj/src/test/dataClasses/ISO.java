package test.dataClasses;

public class ISO {
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("id: " + getId());
		System.out.println("name: " + getName());
	}
}
