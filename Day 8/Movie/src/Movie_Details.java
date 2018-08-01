//to implement the movie entity
public class Movie_Details {

	//instance member
	private String movName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	//getter and setter function
	public String getMovName() {
		return movName;
	}
	
	public void setMovName(String movName) {
		this.movName = movName;
	}
	
	public String getLeadActor() {
		return leadActor;
	}
	
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	
	public String getLeadActress() {
		return leadActress;
	}
	
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	//non arg constructor
	public Movie_Details(String movName, String leadActor, String leadActress, String genre) {
		super();
		this.movName = movName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

	//to display all details
	@Override
	public String toString() {
		return "MovieDetails [movName=" + movName + ", leadActor=" + leadActor + ", leadActress=" + leadActress
				+ ", genre=" + genre + "]";
	}
	
	
	
}