//Program to print todays's date
package pack2;
import java.time.LocalDateTime;

public class TodaysDate {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			LocalDateTime date;
			date=LocalDateTime.now();
			System.out.println(date.getDayOfWeek()+", "+date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());
			
		}

	
}
