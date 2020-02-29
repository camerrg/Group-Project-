import java.util.List;

import controller.AttractionsHelper;

import model.Attractions;

public class zooTester {

	public zooTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Attractions lion = new Attractions(0, "Lion", null, null);
		
		AttractionsHelper ah = new AttractionsHelper();
		
		ah.insertNewAttractions(lion);
		
		List<Attractions> allAttractions = ah.getAttractions();
		
		for(Attractions a: allAttractions) {
			System.out.println(a.toString());
		}
		
		
		

	}

}
