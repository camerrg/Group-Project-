package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "attractions")
public class Attractions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ATTRACTION_ID")
	private int id;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "TRIP_DATE")
	private LocalDate tripDate;
	@ManyToOne
	private Animals animal;
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name = "ITEMS_ON_LIST", joinColumns = {
			@JoinColumn(name = "LIST_ID", referencedColumnName = "LIST_ID") }, inverseJoinColumns = {
					@JoinColumn(name = "ITEM_ID", referencedColumnName = "ID", unique = true) })
	private List<Animals> listOfAttractions;

	public Attractions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attractions(int id, String location, LocalDate tripDate, Animals animal, List<Animals> listOfAttractions) {
		super();
		this.id = id;
		this.location = location;
		this.tripDate = tripDate;
		this.animal = animal;
		this.listOfAttractions = listOfAttractions;
	}

	public Attractions(String location, LocalDate tripDate, Animals animal, List<Animals> listOfAttractions) {
		super();
		this.location = location;
		this.tripDate = tripDate;
		this.animal = animal;
		this.listOfAttractions = listOfAttractions;
	}

	public Attractions(String location, LocalDate tripDate, Animals animal) {
		super();
		this.location = location;
		this.tripDate = tripDate;
		this.animal = animal;

	}

	public List<Animals> getListOfAttractions() {
		return listOfAttractions;
	}

	public void setListOfAttractions(List<Animals> listOfAttractions) {
		this.listOfAttractions = listOfAttractions;
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
				+ ", listOfAttractions=" + listOfAttractions + "]";
	}

}
