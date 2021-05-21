package reportCodes;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String args[]) {
		
		int temp=0;
		int arr1[]= new int[5];
		
		
		System.out.println("Enter the array values: (5 max)" );
		Scanner input = new Scanner(System.in);
		for (int i=0;i<arr1.length;i++ ) {
			arr1[i] = input.nextInt();
		}
		
		
		int L = arr1.length;
		for(int i =0;i< L;i++) {
			for (int j=1;j<(L-i); j++) {
				if(arr1[j-1]>arr1[j]) {
					temp = arr1[j-1];
					arr1[j-1]= arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
	   for (int i=0;i<L; i++) {
		   System.out.print(arr1[i]+ ",");
	   }


	}

}
