import java.util.*;

public class Bubble {
	public static void main(String args[]) {
		int arr[] = new int[16];
		int i, j, temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for (i = 0; i < 15; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < 15; i++) {
			for (j = 0; j < (15 - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("\nThe Sorted array:");
		for (i = 0; i < 15; i++) {
			System.out.println(arr[i]);
		}

	}
}
