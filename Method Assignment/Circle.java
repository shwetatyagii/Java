/* 6. Design a class for Circle and design methods to print

a) Details b) area c) perimeter */

import java.util.Scanner;

class Circle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of Circle: ");
		double radius = sc.nextDouble();
		if(radius<0){
			System.out.println("Invalid Radius Entered");
		sc.close();
		return;
		}
		printDetails(radius);
		double area = getArea(radius);
		System.out.println("Area of circle is: "+area);
		double perimeter = getPerimeter(radius);
		System.out.println("Perimeter of circle is: "+perimeter);
		sc.close();
	}

	public static void printDetails(double radius){
		System.out.println("Radius of circle is: "+radius);
	}

	public static double getArea(double radius){
		return Math.PI*radius*radius;
	}

	public static double getPerimeter(double radius){
		return 2*Math.PI*radius;
	}
}
	