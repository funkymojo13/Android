package test.dataClasses;

public class Location {
	int id;
	int isoId;
	String isoReferenceCode;
	int locationTypeId;
	String longName;
	String shortName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getLocationTypeId() {
		return locationTypeId;
	}
	public void setLocationTypeId(int locationTypeId) {
		this.locationTypeId = locationTypeId;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public void print() {
		System.out.println("id: " + getId());
		System.out.println("isoId: " + getIsoId());
		System.out.println("isoReferenceCode" + getIsoReferenceCode());
		System.out.println("locationTypeId: " + getLocationTypeId());
		System.out.println("longName: " + getLongName());
		System.out.println("shortName: " + getShortName());
	}
}
