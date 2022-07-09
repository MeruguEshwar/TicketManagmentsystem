package com.ojas.model;

public class Theater {
	

	private int theaterID;
	private String theaterName;
	private int theaterCapacity;
	private String theaterType;
	private String theaterLocation;
	

	public Theater(){
		
	}
	
	public Theater(int theaterID, String theaterName, int theaterCapacity, String theaterType, String theaterLocation)
	{
		this.theaterID = theaterID;
		this.theaterName = theaterName;
		this.theaterCapacity = theaterCapacity;
		this.theaterType = theaterType;
		this.theaterLocation = theaterLocation;
	}

	

	public int getTheaterID() {
		return theaterID;
	}

	public void setTheaterID(int theaterID) {
		this.theaterID = theaterID;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public double getTheaterCapacity() {
		return theaterCapacity;
	}

	public void setTheaterCapacity(int theaterCapacity) {
		this.theaterCapacity = theaterCapacity;
	}

	public String getTheaterType() {
		return theaterType;
	}

	public void setTheaterType(String theaterType) {
		this.theaterType = theaterType;
	}

	public String getTheaterLocation() {
		return theaterLocation;
	}

	public void setTheaterLocation(String theaterLocation) {
		this.theaterLocation = theaterLocation;
	}

	public String toString() {
		return theaterID+"\t\t"+theaterName+"\t\t"+theaterCapacity+"\t\t"+theaterType+"\t\t"+theaterLocation;
	}
	
}
