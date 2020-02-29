package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="attractions")
public class Attractions {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ATTRACTION_ID")
	private int id;
@Column(name="LOCATION")
	private String location;
@Column(name="TRIP_DATE")
	private LocalDate tripDate;
@ManyToOne
	private Animals animal;

	public Attractions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attractions(int id, String location, LocalDate tripDate, Animals animal) {
		super();
		this.id = id;
		this.location = location;
		this.tripDate = tripDate;
		this.animal = animal;
	}

	public Attractions(String location, LocalDate tripDate, Animals animal) {
		super();
		this.location = location;
		this.tripDate = tripDate;
		this.animal = animal;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	@Override
	public String toString() {
		return "Attractions [id=" + id + ", location=" + location + ", tripDate=" + tripDate + ", animal=" + animal
				+ "]";
	}

}
