import java.util.*;

public class Marks11 {
	{
		int total = 0, avg = 0, i, j;
		int arr[][] = new int[3][3];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			System.out.println("\nEnter marks of students for Subject" + (i + 1));
			for (j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				total = total + arr[j][i];

			}
			avg = (int) total / 3;
			System.out.println("\nTotal marks of student" + (i + 1) + "is" + total);
			System.out.println("\naverage marks of student" + (i + 1) + "is" + avg);
		}
		total = 0;
		avg = 0;
		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {
				total = total + arr[i][j];

			}
			avg = (int) total / 3;
			System.out.println("\nTotal marks of student in subject" + (i + 1) + "is" + total);
			System.out.println("\naverage marks of student in subject" + (i + 1) + "is" + avg);
		}

	}
}
