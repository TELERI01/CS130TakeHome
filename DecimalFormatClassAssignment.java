import java.text.DecimalFormat;
import java.util.Scanner;


public class DecimalFormatClassAssignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the Radius");
		double radius = scan.nextDouble();
		
		double SurfaceArea = 4* Math.PI * Math.pow(radius, 2);
		
		double Volume = 4/3 * Math.PI * Math.pow(radius, 3);
		
		DecimalFormat format1 = new DecimalFormat("0.##");
		
		
		System.out.println("The Surface area is: " + format1.format(SurfaceArea));
		System.out.println("The Surface area is: " + format1.format(Volume));
		
		
		
		
		
		
	}
	
}
