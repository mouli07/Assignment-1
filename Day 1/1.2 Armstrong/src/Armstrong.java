import java.util.*;

public class Armstrong {

	private static Scanner sc;

	public static void main(String args[]) {
		int num, sum = 0, r, n;
		sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		num = sc.nextInt();
		n = num;
		while (num != 0) {
			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;
		}
		if (sum == n) {

			System.out.println("\nThe number is Armstrong");
		} else {
			System.out.println("\nThe number is not Armstrong");
		}

	}

}
