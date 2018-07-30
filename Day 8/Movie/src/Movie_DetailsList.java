
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

public class Movie_DetailsList {
	
	Set<Movie_Details> listOfmovie=new TreeSet<Movie_Details>();
	
	public void list()
	{
		
		
		//adding elements to Movie_Details

		listOfmovie.add(new Movie_Details("Me Before You","Sam Claflin","Emilia Clarke","Romance"));
		listOfmovie.add(new Movie_Details("Gone Girl","Ben Afflek","Rosamund Pyke","Psychological Thriller"));
		listOfmovie.add(new Movie_Details("Inception","Leonardo DiCaprio","Ellen Page","Science Fiction Thriller"));
		
		
		System.out.println("The Movie Details are ");
		listOfmovie.stream().forEach((moviedetails) -> System.out.println("Movie Name- " +moviedetails.getMovie_name() + "\nLead Actor- "
				+moviedetails.getLead_actor() + "\nLead Actress- " +moviedetails.getLead_actress() + "\nGenre- " +moviedetails.getGenre() + "\n"));
		
		
		
		do
		{
			System.out.println("1.Add Movie \n2.Remove Movie \n3.Remove All Movies "
					+ "\n4.Find Movie By Name \n5.Find Movie By Genre 6.Exit\nEnter Your Choice: ");
			
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("Enter movie details:");
				String name=sc.nextLine();
				String actor=sc.nextLine();
				String actress=sc.nextLine();
				String genre=sc.nextLine();
				add_movie(name,actor,actress,genre);
				break;
			
			case 2:
				remove_movie(listOfmovie);
				break;
				
			case 3:
				
			}
			
		}while(true);
		

	}
	void add_movie(String movie_name, String lead_actor, String lead_actress, String genre)
	{
		listOfmovie.add(new Movie_Details(movie_name,lead_actor,lead_actress,genre));
	}
	
	void remove_movie(String movie_name)
	{
		listOfmovie.remove(movie_name);
		System.out.println("After removing Movie:");
		listOfmovie.stream().forEach((moviedetails) -> System.out.println("Movie Name- " +moviedetails.getMovie_name() + "\nLead Actor- "
				+moviedetails.getLead_actor() + "\nLead Actress- " +moviedetails.getLead_actress() + "\nGenre- " +moviedetails.getGenre() + "\n"));
		
		
	}
	
	void remove_all()
	{
		listOfmovie.removeAll(listOfmovie);
		System.out.println("List is empty");
	}
	
	
	
			
			
		
		
}
	

	

