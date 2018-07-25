import java.util.*;

public class Login {
	public static void main(String args[]) {

		String username = new String("admin");
		String password = new String("pass123");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String un, ps;
		int count = 0, i;
		for (i = 0; i < 3; i++) {
			System.out.println("Enter your user-ID:");
			un = sc.next();
			System.out.println("Enter your password:");
			ps = sc.next();
			if ((un.equals(username)) && (ps.equals(password))) {
				System.out.println("\nWelcome");
				break;
			} else {
				count++;
				if (count >= 3) {
					System.out.println("\nContact Admin");
					break;
				} else
					continue;
			}

		}
	}
}
