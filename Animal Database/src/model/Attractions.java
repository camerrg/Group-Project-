package model;

import java.util.Arrays;

public class Attractions {
	
	private String locations;
	
	private String area;
	
	private String[] animals;
	
	private int locationID;

	public Attractions() {
		// TODO Auto-generated constructor stub
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String[] getAnimals() {
		return animals;
	}

	public void setAnimals(String[] animals) {
		this.animals = animals;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public Attractions(String locations, String area, String[] animals, int locationID) {
		super();
		this.locations = locations;
		this.area = area;
		this.animals = animals;
		this.locationID = locationID;
	}

	@Override
	public String toString() {
		return "Attractions [locations=" + locations + ", area=" + area + ", animals=" + Arrays.toString(animals)
				+ ", locationID=" + locationID + "]";
	}
	
	

}
