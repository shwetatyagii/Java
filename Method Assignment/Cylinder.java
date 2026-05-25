/* 8. Design a class for Cylinder and design methods to print
a) Details b) volume c) Lateral Surface Area d)Total
Surface Area */

import java.util.Scanner;

class Cylinder{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of Cylinder: ");
		double radius = sc.nextDouble();
		System.out.print("Enter the height of Cylinder: ");
		double height = sc.nextDouble();

		if(radius <= 0 || height <= 0){
		System.out.println("Invalid Data Entered");
		sc.close();
		return;
		}

		printDetails(radius, height);

		double volume = getVolume(radius, height);
		System.out.println("Volume of Cylinder is: "+volume);

		double lateralSurfaceArea = getLateralSurfaceArea(radius, height);
		System.out.println("Lateral Surface Area of Cylinder is: "+lateralSurfaceArea);

		double totalSurfaceArea = getTotalSurfaceArea(radius, height);
		System.out.println("Total Surface Area of Cylinder is: "+totalSurfaceArea);
		sc.close();
	}

	public static void printDetails(double radius, double height){
		System.out.println("Radius of cylinder is: "+radius);
		System.out.println("Height of cylinder is: "+height);

	}

	public static double getVolume(double radius, double height){
		return Math.PI * radius * radius * height;

	}


	public static double getLateralSurfaceArea(double radius, double height){
		return 2 * Math.PI * radius * height;
	}

	public static double getTotalSurfaceArea(double radius, double height){
		return 2 * Math.PI * radius * (radius + height);
	}
}
	