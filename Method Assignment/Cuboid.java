/* 13. Design a class for Cuboid and design methods to print
a) Details b) volume c) Lateral Surface Area d)Total Surface Area */

import java.util.Scanner;

class Cuboid{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of Cuboid: ");
		double length = sc.nextDouble();

		System.out.print("Enter the breadth of Cuboid: ");
		double breadth = sc.nextDouble();

		System.out.print("Enter the height of Cuboid: ");
		double height = sc.nextDouble();

		if(length <= 0 || breadth <= 0 || height <= 0){
			System.out.println("Invalid Data Entered");
			sc.close();
			return;
		}

		printDetails(length, breadth, height);

		double volume = getVolume(length, breadth, height);
		System.out.println("Volume of Cuboid is: " + volume);

		double lateralSurfaceArea = getLateralSurfaceArea(length, breadth, height);
		System.out.println("Lateral Surface Area of Cuboid is: " + lateralSurfaceArea);

		double totalSurfaceArea = getTotalSurfaceArea(length, breadth, height);
		System.out.println("Total Surface Area of Cuboid is: " + totalSurfaceArea);

		sc.close();
	}

	public static void printDetails(double length, double breadth, double height){
		System.out.println("Length of Cuboid is: " + length);
		System.out.println("Breadth of Cuboid is: " + breadth);
		System.out.println("Height of Cuboid is: " + height);
	}

	public static double getVolume(double length, double breadth, double height){
		return length * breadth * height;
	}

	public static double getLateralSurfaceArea(double length, double breadth, double height){
		return 2 * height * (length + breadth);
	}

	public static double getTotalSurfaceArea(double length, double breadth, double height){
		return 2 * ((length * breadth) + (breadth * height) + (height * length));
	}
}