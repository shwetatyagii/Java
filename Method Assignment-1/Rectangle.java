/* 5. Design a class for rectangle and design methods to print

a) Details b) area c) perimeter */

import java.util.Scanner;

class Rectangle {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        if (length < 0 || width < 0) {
            System.out.println("Invalid length or width");
            sc.close();
            return;
        }

        printDetails(length, width);
        double area = getArea(length, width);
        double perimeter = getPerimeter(length, width);

        System.out.println("Area of rectangle is: "+ area);
        System.out.println("Perimeter of rectangle is: "+ perimeter);
        sc.close();
    }

    public static void printDetails(double length,double width) {
        System.out.println("Length of rectangle is: "+ length);
        System.out.println("Width of rectangle is: "+ width);
    }

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static double getPerimeter(double length, double width) {
        return 2 * (length + width);
    }
}