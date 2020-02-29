package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "ATTRACTIONS")
public class Attractions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "LOCATION_ID")
	private int id;
	@Column(name = "TRIP_DATE")
	private LocalDate tripDate;
	@ManyToOne
	private Animals animal;
	private List<Animals>listOfAttractions;
	
	

	public Attractions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Attractions ( String location, LocalDate tripDate, Animals animal,List<Animals>listOfAttractions) {
		super();
		this.location = location;
		this.tripDate = tripDate;
		this.animal = animal;
		this.listOfAttractions = listOfAttractions;
	}
	
	public Attractions(String location, int id, LocalDate tripDate, Animals animal, List<Animals>listOfAttractions) {
		super();
		this.location = location;
		this.id = id;
		this.tripDate = tripDate;
		this.animal = animal;
		this.listOfAttractions = listOfAttractions;
	}
	
	public Attractions(String location, LocalDate tripDate,Animals animal) {
		super();
		this.location = location;
		this.tripDate = tripDate;
		this.animal = animal;
	}
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getTripDate() {
		return tripDate;
	}
	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}
	public Animals getAnimal() {
		return animal;
	}
	public void setAnimal(Animals animal) {
		this.animal = animal;
	}
	
	public List<Animals> getListOfAttractions() {
		return listOfAttractions;
	}

	public void setListOfAttractions(List<Animals> listOfAttractions) {
		this.listOfAttractions = listOfAttractions;
	}

	@Override
	public String toString() {
		return "Attractions [location=" + location + ", id=" + id + ", tripDate=" + tripDate + ", animal=" + animal
				+ ", listOfAttractions=" + listOfAttractions + "]";
	}
	
	
	
	
}