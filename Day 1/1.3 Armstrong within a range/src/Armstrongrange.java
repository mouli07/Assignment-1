
public class Armstrongrange {
	public static void main(String args[]) {
		int num, r, i, sum = 0;
		for (i = 100; i <= 999; i++) {
			num = i;
			while (num != 0) {
				r = num % 10;
				sum = sum + (r * r * r);
				num = num / 10;
			}

			if (sum == i) {
				System.out.println(i);
			}
			sum = 0;
		}

	}
}
