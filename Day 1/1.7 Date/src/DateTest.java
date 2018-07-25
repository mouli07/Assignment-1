import java.util.*;

public class DateTest {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DD: ");
		int date = sc.nextInt();

		if (date <= 0 && date > 31) {
			System.out.println("Invalid DD");
			java.lang.System.exit(0);
		}

		System.out.println("Enter MM: ");
		int mon = sc.nextInt();
		if (mon <= 0 && mon > 12) {
			System.out.println("Invalid MM");
			java.lang.System.exit(0);
		}

		System.out.println("Enter YYYY: ");
		int yr = sc.nextInt();
		if (yr <= 0) {
			System.out.println("Invalid YYYY");
			java.lang.System.exit(0);
		}

		Date.date(date, mon, yr);
	}

}
