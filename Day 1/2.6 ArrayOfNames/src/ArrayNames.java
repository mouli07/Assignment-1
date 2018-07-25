import java.util.*;

public class ArrayNames {

	public static void main(String args[]) {
		int n, i, count = 0;
		String key;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		String arr[] = new String[n];
		for (i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		System.out.println("Enter the name to be searched:");
		key = sc.next();
		for (i = 0; i < n; i++) {
			if (arr[i].equals(key)) {
				count++;
			}
		}

		System.out.println("The number of occurance of the search key is " + count);

	}

}
