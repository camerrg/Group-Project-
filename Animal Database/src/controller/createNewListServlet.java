package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animals;
import model.Attractions;

/**
 * Servlet implementation class createNewListServlet
 */
@WebServlet("/createNewListServlet")
public class createNewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createNewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AttractionsHelper ah = new AttractionsHelper();
		String location = request.getParameter("location");
		System.out.println("List Name: " + location);
		
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		String animalType = request.getParameter("animalType");
		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month), Integer.parseInt(day));
		}catch(NumberFormatException ex) {
			ld = LocalDate.now();
		}

		String[] selectedAnimals = request.getParameterValues("allAnimalsToAdd");
		List<Animals>selectedAnimalsInList = new ArrayList<Animals>();
			if (selectedAnimals != null && selectedAnimals.length > 0) {
				for(int i =0; i<selectedAnimals.length; i++) {
					System.out.println(selectedAnimals[i]);
				/* not sure what is suppose to be here tired what was on the lab as you requested 
				 * Attractions c = ah.serachForAttractionsByID(Integer.parseInt(selectedAnimals[i]));
					selectedAnimalsInList.add(c); */
					// this section above does not work and need to be worked on 
				}
			}
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
