/* 10. Design a class for Hemisphere and design methods to
print
a) Details b) volume c) Lateral Surface Area d)Total
Surface Area */

import java.util.Scanner;

class Hemisphere{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of Hemisphere: ");
		double radius = sc.nextDouble();

		if(radius <= 0){
		System.out.println("Invalid Data Entered");
		sc.close();
		return;
		}

		printDetails(radius);

		double volume = getVolume(radius);
		System.out.println("Volume of Hemisphere is: " + volume);

		double lateralSurfaceArea = getLateralSurfaceArea(radius);
		System.out.println("Lateral Surface Area of Hemisphere is: " + lateralSurfaceArea);	

		double totalSurfaceArea = getTotalSurfaceArea(radius);
		System.out.println("Total Surface Area of Hemisphere is: " + totalSurfaceArea);
		sc.close();
	}

	public static void printDetails(double radius){
		System.out.println("Radius of Hemisphere is: " + radius);
	}

	public static double getVolume(double radius){
		return (2.0 / 3)* Math.PI* radius* radius* radius;

	}

	public static double getLateralSurfaceArea(double radius){
		return 2 * Math.PI * radius * radius;
	}

	public static double getTotalSurfaceArea(double radius){
		return 3 * Math.PI * radius * radius;
	}
}
	