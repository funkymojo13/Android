package test.dataClasses;

public class Market {
	int id;
	String description;
	int isoId;
	String isoReferenceCode;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIsoId() {
		return isoId;
	}
	public void setIsoId(int isoId) {
		this.isoId = isoId;
	}
	public String getIsoReferenceCode() {
		return isoReferenceCode;
	}
	public void setIsoReferenceCode(String isoReferenceCode) {
		this.isoReferenceCode = isoReferenceCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("id: " + getId());
		System.out.println("description: " + getDescription());
		System.out.println("isoId" + getIsoId());
		System.out.println("isoReferenceCode: " + getIsoReferenceCode());
		System.out.println("name: " + getName());
	}
}
