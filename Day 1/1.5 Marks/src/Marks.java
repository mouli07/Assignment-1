import java.util.*;

public class Marks {
	public static void main(String args[]) {
		int i, sum = 0;
		int mark[] = new int[3];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		for (i = 0; i < 3; i++) {
			mark[i] = sc.nextInt();
		}
		for (i = 0; i < 3; i++) {
			if (mark[i] > 60) {
				sum++;
			}
		}
		if (sum == 3)
			System.out.println("Pass");

		if (sum == 2)
			System.out.println("Promoted");

		if (sum == 1 || sum == 0)
			System.out.println("Fail");
	}

}
