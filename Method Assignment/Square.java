/* 7. Design a class for Square and design methods to print

a) Details b) area c) perimeter */

import java.util.Scanner;

class Square{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of square: ");
		double side = sc.nextDouble();
		if(side<0){
			System.out.println("Invalid side Entered");
		sc.close();
		return;
		}
		printDetails(side);
		double area = getArea(side);
		System.out.println("Area of square is: "+area);
		double perimeter = getPerimeter(side);
		System.out.println("Perimeter of square is: "+perimeter);
		sc.close();
	}

	public static void printDetails(double side){
		System.out.println("side of square is: "+side);
	}

	public static double getArea(double side){
		return side*side;
	}

	public static double getPerimeter(double side){
		return 4*side;
	}
}
