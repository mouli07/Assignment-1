package List;
import java.util.*;

public class TestClass {
	
	public static void printLaptops()			//Creating and printing laptop objects
	{
		List<Laptop> listOfLaptops=new ArrayList<Laptop>();
		listOfLaptops.add(new Laptop("Lenovo","Z51-70","Windows","Core i7"));
		listOfLaptops.add(new Laptop("Hewlett Package","Omen","Linux,Windows","Core i7"));
		listOfLaptops.add(new Laptop("Apple","Mac Book  Pro","OsX","A9"));
		
		System.out.println("The Laptops are ");
		listOfLaptops.stream().forEach((laptop) -> System.out.println("Company- " +laptop.getCompany() + "\nModel- "
				+laptop.getModel() + "\nOS- " +laptop.getOperatingSystem() + "\nProcessor- " +laptop.getProcessor() + "\n"));
		
		
	}
	
	public static void printCars()				//Creating and printing car objects
	{
		List<Car> listOfCars = new ArrayList<Car>();
		listOfCars.add(new Car("Suzuki","Swift",2015,5_00_000.00));
		listOfCars.add(new Car("Suzuki","WagonR",2015,3_20_000.00));
		listOfCars.add(new Car("Audi","A9",2013,10_00_000.00));
		
		System.out.println("The Cars are ");
		listOfCars.stream().forEach((car) -> System.out.println("Make- " +car.getMake()+ "\nModel- " +car.getModel()+ 
				"\nYear- " +car.getYear()+ "\nPrice- " +car.getPrice()+ "\n"));
		
	}
	
	public static void printTelevision()			//Creating and printing television objects

	{
		List<Television> listOfTelevision = new ArrayList<Television>();
		listOfTelevision.add(new Television("LG","LCD",true,60_000.00));
		listOfTelevision.add(new Television("MI","LED",true,44_000.00));
		listOfTelevision.add(new Television("Sony","Plasma",true,60_000.00));
		
		System.out.println("The Televisions are ");
		listOfTelevision.stream().forEach((television) -> System.out.println("Company- " +television.getCompany()+ "\nType- " +television.getType()+ 
				"\n3D-Enabled- " +television.getEnable()+ "\nPrice- " +television.getPrice()+ "\n"));
	}
	
	public static void printSchool()				//Creating and printing school objects

	{
		List<School> listOfSchool = new ArrayList<School>();
		listOfSchool.add(new School("The Central Modern School","Barasat","North 24 Parganas",5));
		listOfSchool.add(new School("Kalyani Public School","Barasat","North 24 Parganas",4));
		listOfSchool.add(new School("Julian Day","Barasat","North 24 Parganas",5));
		
		System.out.println("The Schools are ");
		listOfSchool.stream().forEach((school) -> System.out.println("Name- " +school.getName()+ "\nCity- " +school.getCity()+ 
				"\nDistrict- " +school.getSchool_dist()+ "\nRank- " +school.getGreatSchoolRanking()+ "\n"));
	}
	
	
	public static void printCellPhone()				//Creating and printing cellphone objects

	{
		List<CellPhone> listOfPhone = new ArrayList<CellPhone>();
		listOfPhone.add(new CellPhone("LG","G6","4GB RAM,64GB ROM","Snapdragon 821",36_000.00));
		listOfPhone.add(new CellPhone("MI","A1","4GB RAM,64GB ROM","Snapdragon 630",15_000.00));
		listOfPhone.add(new CellPhone("Apple","iPhone X","4GB RAM,64GB ROM","A9 Bionic",84_000.00));
		
		System.out.println("The Cell Phones are ");
		listOfPhone.stream().forEach((cellphone) -> System.out.println("Company- " +cellphone.getCompany()+ "\nModel- " +cellphone.getModel()+ 
				"\nDescription- " +cellphone.getDescription()+ "\nPrice- " +cellphone.getPrice()+ "\n"));
	}
	
	public static void main(String args[])
	{
		printLaptops();
		printCars();
		printTelevision();
		printSchool();
		printCellPhone();
	}

}
