/* 12. Design a class for Cube and design methods to print
a) Details b) volume c) Lateral Surface Area d)Total Surface Area */

import java.util.Scanner;

class Cube{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the side of Cube: ");
		double side = sc.nextDouble();

		if(side <= 0){
			System.out.println("Invalid Data Entered");
			sc.close();
			return;
		}

		printDetails(side);

		double volume = getVolume(side);
		System.out.println("Volume of Cube is: " + volume);

		double lateralSurfaceArea = getLateralSurfaceArea(side);
		System.out.println("Lateral Surface Area of Cube is: " + lateralSurfaceArea);

		double totalSurfaceArea = getTotalSurfaceArea(side);
		System.out.println("Total Surface Area of Cube is: " + totalSurfaceArea);

		sc.close();
	}

	public static void printDetails(double side){
		System.out.println("Side of Cube is: " + side);
	}

	public static double getVolume(double side){
		return side * side * side;
	}

	public static double getLateralSurfaceArea(double side){
		return 4 * side * side;
	}

	public static double getTotalSurfaceArea(double side){
		return 6 * side * side;
	}
}