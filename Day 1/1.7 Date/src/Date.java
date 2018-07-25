
public class Date {

	public static void date(int day, int mon, int year) {
		String month;
		if (mon == 1)
			month = "January";
		else if (mon == 2)
			month = "February";
		else if (mon == 3)
			month = "March";
		else if (mon == 4)
			month = "April";
		else if (mon == 5)
			month = "May";
		else if (mon == 6)
			month = "June";
		else if (mon == 7)
			month = "July";
		else if (mon == 8)
			month = "August";
		else if (mon == 9)
			month = "September";
		else if (mon == 10)
			month = "October";
		else if (mon == 11)
			month = "November";
		else
			month = "December";

		if (day < 10)
			System.out.println("Date : 0" + day + "/" + month + "/" + year);
		else
			System.out.println("Date : " + day + "/" + month + "/" + year);
	}

}
