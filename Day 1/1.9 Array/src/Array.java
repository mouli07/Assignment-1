import java.util.*;

public class Array {
	public static void main(String args[]) {
		int arr[] = new int[16];
		int sr, i;
		System.out.println("Enter the array:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 15; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter number to be searched");
		sr = sc.nextInt();
		for (i = 0; i < 15; i++) {
			if (sr == arr[i]) {
				System.out.println("Element Found");
				break;
			}
		}
	}
}
