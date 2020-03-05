package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "attractions")

public class Attractions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	private int id;
	@Column(name = "location")
	private String location;
	@Column(name = "TRIP_DATE")
	private LocalDate tripDate;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "animal_id")
	private Animal animal;
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	@JoinTable(name="three",joinColumns={ 
			@JoinColumn(name="location_id", referencedColumnName="location_id") },
	inverseJoinColumns={ @JoinColumn(name="animal_id", referencedColumnName="animal_id", unique=true
			) })
	
	private List<ListItems> listOfItems;

	public Attractions() {
		// TODO Auto-generated constructor stub

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

	public List<ListItems> getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(List<ListItems> listOfItems) {
		this.listOfItems = listOfItems;
	}

	public Attractions(int id, String location, LocalDate tripDate, Animal animal, List<ListItems> listOfItems) {
		super();
		this.id = id;
		this.location = location;
		this.tripDate = tripDate;

		this.listOfItems = listOfItems;
	}

	public Attractions(String location, LocalDate tripDate, Animal animal, List<ListItems> listOfItems) {
		super();

		this.location = location;
		this.tripDate = tripDate;

		this.listOfItems = listOfItems;
	}

	public Attractions(String location, LocalDate tripDate, Animal animal) {
		super();

		this.location = location;
		this.tripDate = tripDate;

	}

}
