import java.time.LocalDate;
import java.util.List;

import controller.AttractionsHelper;
import controller.InsertAnimal;
import model.Animals;
import model.Attractions;

public class zooTester {

	public zooTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animals animal1 = new Animals("lion");

		InsertAnimal ah = new InsertAnimal();

		ah.insertAnimal(animal1);

		AttractionsHelper ahh = new AttractionsHelper();

		Attractions animal1List = new Attractions("Animal 1 List", LocalDate.now(), animal1);

		ahh.insertNewAttractions(animal1List);

		List<Attractions> allAttractions = ahh.getAttractions();

		for (Attractions a : allAttractions) {
			System.out.println(a.toString());
			
			//this test 
		}

	}

}
