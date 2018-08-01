import java.util.Comparator;

class SortingByName implements Comparator<Movie_Details>
{
	// Used for sorting in ascending order of Movie_Name
	public int compare(Movie_Details mvO, Movie_Details mvT) // Overriding Compare method
	{
		return mvO.getMovName().compareTo(mvT.getMovName());
	}
}
class SortByLeadActor implements Comparator<Movie_Details>
{
	// Used for sorting in ascending order of Lead_Actor
	public int compare(Movie_Details mvO, Movie_Details mvT)
	{
		return mvO.getLeadActor().compareTo(mvT.getLeadActor());
	}
}
class SortByLeadActress implements Comparator<Movie_Details>
{
	// Used for sorting in ascending order of Lead_Actress
	public int compare(Movie_Details mvO, Movie_Details mvT)
	{
		return mvO.getLeadActress().compareTo(mvT.getLeadActress());
	}
}
class SortByGenre implements Comparator<Movie_Details>
{
	// Used for sorting in ascending order of Genre
	public int compare(Movie_Details mvO, Movie_Details mvT)
	{
		return mvO.getGenre().compareTo(mvT.getGenre());
	}
}
