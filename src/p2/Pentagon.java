package p2;
import java.util.Scanner;
public class Pentagon {
	public static void main(String[] args) {
		// Read radius and length
		Scanner input = new Scanner(System.in);
		System.out.print("enter the length from the center of a pentagon to a vertex:");
		double r = input.nextDouble();
		if(r>0) {
			double s = 2*r*Math.sin(Math.PI/5);
	}
}
}