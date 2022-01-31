package hashingCode;

public class Movie  implements Comparable<Movie>{
	private double rating;
	private String name;
	private int year;
	@Override
	public int compareTo(Movie m ) {
		
		return this.year -m.year;
	}
////	public int compare(Movie m1, Movie m2) {
//		return m1.getName().compareTo(m2.getName());
//		
//	}
	
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
		
	}

	
	public Movie(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
		
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
	 
	
	
	

	

}
