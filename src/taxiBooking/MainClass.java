package taxiBooking;
import java.util.*;

public class MainClass {
	
	public static void main (String[] args) throws CloneNotSupportedException{
	Scanner sc = new Scanner(System.in);
	boolean loop = true;
	
	while(loop) {
	System.out.println("1. Book Taxi");
	System.out.println("2. Display Details");
	System.out.println("3. Exit");
	System.out.print("Enter your choice: ");

	int choice = sc.nextInt();
	sc.nextLine();
	
	switch(choice) {
		case 1:
			System.out.print("Enter Pickup Location (A-F):");
			char pickupLoc = sc.next().toUpperCase().charAt(0);	
			
			if(!TaxiBooking.isValidLocation(pickupLoc)) {
				System.out.println("Invalid location! Please enter A to F only");
				break;
			}
			
			System.out.print("Enter Drop Location (A-F):");
			char dropLoc = sc.next().toUpperCase().charAt(0);
			
			if(!TaxiBooking.isValidLocation(dropLoc)) {
				System.out.println("Invalid location! Please enter A to F only");
				break;
			}
			
			System.out.print("Enter Pickup Time (hour):");
			int pickupTime = sc.nextInt();
			
			System.out.println(TaxiBooking.bookTaxi(pickupLoc, dropLoc, pickupTime));
	        break;
	        
		case 2:
			TaxiBooking.displayDetails();
			break;
			
		case 3:
			loop = false;
			System.out.println("Exiting....");
			break;
			
		default:
			System.out.print("Invalid Choice");
	}
	}
	sc.close();
}
}