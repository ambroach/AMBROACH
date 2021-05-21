import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class BookARide extends Dashboard {
	public void setVisible() throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("What Date would you like to Book your Cab at?");
		System.out.println("dd-mm-yyyy");
	    Scanner Date = new Scanner(System.in);
	    String date = Date.nextLine();
	    Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);  
		
		System.out.println("What time do you want it at? ");
		System.out.println("hh:mm:ss");
		Scanner Time = new Scanner(System.in);
		String time=Time.next();  //default format: hh:mm:ss 
		LocalTime tm=LocalTime.parse(time); 
		
		System.out.println("Under What name Do you want it Under?");
		System.out.println("Your Full Name:  ");
		Scanner Name = new Scanner(System.in);
		String name = Name.nextLine();		
		
		System.out.println("Enter your Mobile Number");
		Scanner Mobile = new Scanner(System.in);
		String mobile = Mobile.next();
		
		System.out.println("Where to?");
		Scanner Drop = new Scanner(System.in);
		String drop = Drop.nextLine();
		
		System.out.println("Where from?");
		Scanner Pick = new Scanner(System.in);
		String pickup = Pick.nextLine();
		
		
		System.out.println("CAR CONFIRMED, WE WILL REACH OUT TO YOU IN NO TIME.");
		System.out.println("Price will be calculated using a distance meter!");
		System.out.println("Date is " + date1 +  "\nTime is: " + tm + "\nUnder the Name: " + name + 
				"\nContact Information: " + mobile + "\nDrop Location: " + drop + "\nPickup Location: " + pickup);
		}
}
