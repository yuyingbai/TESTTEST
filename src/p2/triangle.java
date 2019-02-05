package p2;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		// Read radius and length
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lengths of the three sides of a triangle:");
		double l1 = input.nextDouble();
		double l2 = input.nextDouble();
		double l3= input.nextDouble();
		if ((l1+l2)>l3 && (l1+l3)>l2 && (l2+l3)>l1) {
			
				double perimeter = l1 +l2 +l3;
				// Perform calculations

				// Display results
				System.out.println("The perimeter is " + perimeter);
		}
		else {
			System.out.println("Error!!! " );
		}
			
}
}