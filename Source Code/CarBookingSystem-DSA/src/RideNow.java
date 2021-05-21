import java.util.Scanner;

public class RideNow extends Dashboard{

	public void setVisible() {
		System.out.println("Enter Pickup Location");
		Scanner pickup = new Scanner(System.in);
		String Pickup = pickup.next();
		
		System.out.println("Enter Drop Location");
		Scanner drop = new Scanner(System.in);
		String Drop = drop.next();
		
		System.out.println("Booking Under Name");
		Scanner name = new Scanner(System.in);
		String Name = name.next();
		
		System.out.println("Mobile Number");
		Scanner mobile = new Scanner(System.in);
		String Mobile = mobile.next();
		
		System.out.println("What car do you need?");
		System.out.println("==========");
		System.out.println("1. SUVs");
		System.out.println("2. SEDEANs");
		System.out.println("3. Micro");
		System.out.println("4. Mini");
		System.out.println("==========");
		Scanner car = new Scanner(System.in);
		String Car = car.next();
		
		System.out.println("BOOKING DONE!!");
		System.out.println("Our Driver will contact you soon! \nHave a safe joueney and stay safe :)");
		System.out.println("Price will be calculated using a distance meter!");
		System.out.println("Booking Details: \nPickup Location: " + Pickup + "\nDrop Location: " + Drop + 
				"\nBooking under name: " + Name +"\nContact Info: " + Mobile + "\nCar type selected: " + Car);	
	}
}