package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animals")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "animal_id")
	private int id;
	@Column(name = "ANIMAL_TYPE")
	private String animalType;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(int id, String animalType) {
		super();
		this.id = id;
		this.animalType = animalType;
	}
	
	public Animal(String animalType) {
		super();
		this.animalType = animalType;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", animalType=" + animalType + "]";
	}
	
	
	
	

	
}
