import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.AnimalHelper;
import controller.ListDetailsHelper;
import model.Animal;
import model.Attractions;

import model.ListItems;

public class AnimalTester {

	public static void main(String[] args) {
		Animal animal = new Animal("Tiger");
		AnimalHelper sh = new AnimalHelper();

		sh.insertAnimal(animal);

		ListDetailsHelper ldh = new ListDetailsHelper();

		Attractions alexZoo = new Attractions("Alex's Zoo", LocalDate.now(), animal);

		ldh.insertNewListDetails(alexZoo);

		List<Attractions> allLocations = ldh.getLists();
		for (Attractions a : allLocations) {
			System.out.println(a.toString());
		}

	}
}
