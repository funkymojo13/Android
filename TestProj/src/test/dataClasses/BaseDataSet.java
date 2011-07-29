package test.dataClasses;

import java.util.List;

public class BaseDataSet {
	private List<DataIntervalType> intervalTypes;
	private List<DataInterval> intervals;
	private ISO isos;
	private List<LocationType> locationTypes;
	private List<Location> locations;
	private List<Market> markets;
	
	public List<DataIntervalType> getIntervalTypes() {
		return intervalTypes;
	}
	public void setIntervalTypes(List<DataIntervalType> intervalTypes) {
		this.intervalTypes = intervalTypes;
	}
	public List<DataInterval> getIntervals() {
		return intervals;
	}
	public void setIntervals(List<DataInterval> intervals) {
		this.intervals = intervals;
	}
	public ISO getIsos() {
		return isos;
	}
	public void setIsos(ISO isos) {
		this.isos = isos;
	}
	public List<LocationType> getLocationTypes() {
		return locationTypes;
	}
	public void setLocationTypes(List<LocationType> locationTypes) {
		this.locationTypes = locationTypes;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public List<Market> getMarkets() {
		return markets;
	}
	public void setMarkets(List<Market> markets) {
		this.markets = markets;
	}
	
	public void print() {
		System.out.println("=== INTERVAL TYPES ===");
		for( DataIntervalType dit : intervalTypes ) {
			dit.print();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("=== INTERVALS ===");
		for( DataInterval dt : intervals ) {
			dt.print();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("=== LOCATION TYPES ===");
		for( LocationType lt : locationTypes ) {
			lt.print();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("=== LOCATIONS ===");
		for( Location loc : locations ) {
			loc.print();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("=== MARKETS ===");
		for( Market mkt : markets ) {
			mkt.print();
		}
	}
}
