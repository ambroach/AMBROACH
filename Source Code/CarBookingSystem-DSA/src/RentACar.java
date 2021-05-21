import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RentACar extends Dashboard {
	public void setVisible() throws ParseException {
		System.out.println("What Car Do You Need For Rent?");
		System.out.println("========================================");
		System.out.println("SUVs \nScorpio   Range Rover  TATA Safari \nFortuner  Compass      Hector");
		System.out.println("========================================");
		System.out.println("SEDEANs \nVerna   Ciaz   A-Class Limousine \nHonda City     Volvo S60");
		System.out.println("========================================");
		System.out.println("MINI Cars \nTATA Nano   Picanto \nFiat 500    Mirage");
		System.out.println("========================================");
		Scanner car = new Scanner(System.in);
		String Car = car.next();
		System.out.println("When do you require it? (Issue date and return date)");
		System.out.println("dd-mm-yyyy");
	    Scanner Date = new Scanner(System.in);
	    
	    String date = Date.nextLine();
	    Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date); 
	    
	    String returndate = Date.nextLine();
	    Date returndate1=new SimpleDateFormat("dd-MM-yyyy").parse(returndate);
	    
		System.out.println("Booking under name");
		Scanner name = new Scanner(System.in);
		String Name = name.next();
		
	    System.out.println("Enter your Mobile Number");
		Scanner Mobile = new Scanner(System.in);
		String mobile = Mobile.next();
		
		System.out.println("Enter your Email");
		Scanner email = new Scanner(System.in);
		String Email = email.next();
		
		System.out.println("\nINQUIRY SUBMITTED \nWe will get in touch with you soon!");
		System.out.println("Cost per day = 300 INR");
		System.out.println("Car inquired about is: " + Car + "\nIssue Date is: " + date1 + "\nReturn Date: " + returndate +
				"\nBooking Under: "+ Name + "\nMobile Number: " + mobile + "\nEmail Id " + Email);
	}
}