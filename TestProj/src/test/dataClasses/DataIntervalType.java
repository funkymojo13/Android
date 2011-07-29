package test.dataClasses;

public class DataIntervalType {
	int id;
	String description;
	int intervalsPerDay;
	int isoId;
	String isoReferenceCode;
	
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
	public int getIntervalsPerDay() {
		return intervalsPerDay;
	}
	public void setIntervalsPerDay(int intervalsPerDay) {
		this.intervalsPerDay = intervalsPerDay;
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
	
	public void print() {
		System.out.println("id: " + getId());
		System.out.println("description: " + getDescription());
		System.out.println("intervalsPerDay: " + getIntervalsPerDay());
		System.out.println("isoId: " + getIsoId());
		System.out.println("isoReferenceCode: " + getIsoReferenceCode());
	}
}
