import java.text.ParseException;
import java.util.Scanner;

public class Dashboard extends MainClass {
	public static void main(String[]args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("1 Scheduling Cab  \n2 Rent Car  \n3 Ride Now");
		Scanner input = new Scanner(System.in);
		
		double cab;
		cab = input.nextInt();
		if (cab == 1) {
			new BookARide().setVisible();
		}
		else if(cab == 2) {
			new RentACar().setVisible();
		}
		else if(cab == 3) {
			new RideNow().setVisible();
		}
	
	}
}
