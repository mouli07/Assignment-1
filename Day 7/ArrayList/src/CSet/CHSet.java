package CSet;
import java.util.*;
import List.CellPhone;
import List.*;

public class CHSet {

	public static void main(String[] args) {
		//Hash Set not accepting two duplicate values
		Set<Laptop> laptopSet=new HashSet<Laptop>();
		laptopSet.add(new Laptop("Lenovo","Z51-70","Windows","Core i7"));
		laptopSet.add(new Laptop("Hewlett Package","Omen","Linux,Windows","Core i7"));
		laptopSet.add(new Laptop("Hewlett Package","Omen","Linux,Windows","Core i7"));
		laptopSet.add(new Laptop("Apple","Mac Book  Pro","OsX","A9"));//Duplicate Value
		laptopSet.stream().forEach((laptop)->System.out.println("Company- " +laptop.getCompany() + "\nModel- "
				+laptop.getModel() + "\nOS- " +laptop.getOperatingSystem() + "\nProcessor- " +laptop.getProcessor() + "\n"));
		
		
		// Hash set not accepting two duplicate CellPhone values
		Set<CellPhone> listOfCellPhone = new HashSet<CellPhone>();
		listOfCellPhone.add(new CellPhone("LG","G6","4GB RAM,64GB ROM","Snapdragon 821",36_000.00));
		listOfCellPhone.add(new CellPhone("MI","A1","4GB RAM,64GB ROM","Snapdragon 630",15_000.00));
		listOfCellPhone.add(new CellPhone("MI","A1","4GB RAM,64GB ROM","Snapdragon 630",15_000.00));
		listOfCellPhone.add(new CellPhone("Apple","iPhone X","4GB RAM,64GB ROM","A9 Bionic",84_000.00));// Duplicate
		// values
		System.out.println("The Cellphones are ");
		listOfCellPhone.stream().forEach((cellphone) -> System.out.println("Company- " +cellphone.getCompany()+ "\nModel- " +cellphone.getModel()+ 
				"\nDescription- " +cellphone.getDescription()+ "\nPrice- " +cellphone.getPrice()+ "\n"));
		}
				
}
