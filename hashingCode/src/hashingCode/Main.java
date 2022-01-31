package hashingCode;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Movie> list =  new ArrayList<Movie>();
		list.add(new Movie("Force Awakens",8.7,2015));
		list.add(new Movie("Star Wars", 8.7,1977));
		list.add(new Movie("Return of the Jedi",8.4,1983));
		
		System.out.println(list);
		System.out.println("Soreted by rating");
		nameCompare nameCompare =  new nameCompare();
		
		Collections.sort(list);
		
		for(Movie movie: list) {
			System.out.println(movie.getName() + " " +
		                        movie.getRating() + " " +
					            movie.getYear() + " " );
		}
		
		
	}

}
