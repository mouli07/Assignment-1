import java.util.*;

public class Tax {

	public static void main(String args[]) {
		double tax = 1, ctc;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CTC");
		ctc = sc.nextDouble();

		if (ctc > 0 && ctc <= 180000)
			tax = 0;

		else if (ctc >= 180001 && ctc <= 300000)
			tax = ctc * 0.1;

		else if (ctc >= 300001 && ctc <= 500000)
			tax = ctc * 0.2;

		else if (ctc >= 500001 && ctc <= 1000000)
			tax = ctc * 0.3;

		System.out.println("Tax = " + tax);
	}
}
