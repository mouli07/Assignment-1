import java.util.*;

public class Square {

	private static Scanner sc;

	public static void main(String args[]) {
		int num, sqr;
		sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		sqr = calsqr(num);
		System.out.println("\nSquare:" + sqr);

	}

	public static int calsqr(int num) {

		return num * num;
	}

}
