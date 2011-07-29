package test.dataClasses;

import java.util.Date;

public class DataInterval {
	int id;
	Date startTime;
	Date endTime;
	int intervalTypeId;
	String isoReferenceCode;
	String sequence;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getIntervalTypeId() {
		return intervalTypeId;
	}
	public void setIntervalTypeId(int intervalTypeId) {
		this.intervalTypeId = intervalTypeId;
	}
	public String getIsoReferenceCode() {
		return isoReferenceCode;
	}
	public void setIsoReferenceCode(String isoReferenceCode) {
		this.isoReferenceCode = isoReferenceCode;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	public void print() {
		System.out.println("id: " + getId());
		System.out.println("startTime: " + getStartTime());
		System.out.println("endTime: " + getEndTime());
		System.out.println("intervalTypeId: " + getIntervalTypeId());
		System.out.println("isoReferenceCode: " + getIsoReferenceCode());
		System.out.println("sequence: " + getSequence());
	}
}
