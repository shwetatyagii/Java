/* 9. Design a class for Sphere and design methods to print
a) Details b) volume c) Total Surface Area */


import java.util.Scanner;

class Sphere{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of Sphere: ");
		double radius = sc.nextDouble();

		if(radius <= 0){
		System.out.println("Invalid Data Entered");
		sc.close();
		return;
		}

		printDetails(radius);

		double volume = getVolume(radius);
		System.out.println("Volume of Sphere is: " + volume);

		double totalSurfaceArea = getTotalSurfaceArea(radius);
		System.out.println("Total Surface Area of Sphere is: " + totalSurfaceArea);
		sc.close();
	}

	public static void printDetails(double radius){
		System.out.println("Radius of Sphere is: " + radius);
	}

	public static double getVolume(double radius){
		return (4.0 / 3)* Math.PI* radius* radius* radius;

	}

	public static double getTotalSurfaceArea(double radius){
		return 4 * Math.PI * radius * radius;
	}
}
	