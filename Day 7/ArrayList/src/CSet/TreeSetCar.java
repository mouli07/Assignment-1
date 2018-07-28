package CSet;
import java.util.Set;
import java.util.TreeSet;
import List.Car;

public class TreeSetCar {
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Car> setOfCars = new TreeSet<Car>();
		//adding in random order of make...
		setOfCars.add(new Car("Suzuki","Swift",2015,5_00_000.00));
		setOfCars.add(new Car("Audi", "A9", 2013, 10_00_000.00));
		setOfCars.add(new Car("Lamborghini", "Gallardo", 2017, 50_00_000.00));
		setOfCars.stream().forEach((car)-> System.out.println("Make- " +car.getMake()+ "\nModel- " +car.getModel()+ 
				"\nYear- " +car.getYear()+ "\nPrice- " +car.getPrice()+ "\n"));
		}
		

	

}
