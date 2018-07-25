import java.util.*;

public class Interest {
	public static void main(String args[]) {
		float ci, si, p, t, r,cal;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the Principal");
		p = sc.nextFloat();
		System.out.println("\nEnter the Time");
		t = sc.nextFloat();
		System.out.println("\nEnter the Rate");
		r = sc.nextFloat();
		si = ((p * t * r) / 100);
		cal=1+(r/100);
		ci = (p *((float) (Math.pow(cal, t))))-p;
		System.out.println("\nCompound Interest: " + ci);
		System.out.println("\nSimple Interest: " + si);
	}

}
