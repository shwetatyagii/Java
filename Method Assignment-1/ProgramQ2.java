/* 2. Write a java program to design a method which will
accept three numbers and will print the average of three
numbers. */

import java.util.Scanner;
 
class ProgramQ2{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter 1st number : ");
	int a = sc.nextInt();
	
	System.out.println("Enter 2nd number : ");
	int b = sc.nextInt();

	System.out.println("Enter 3rd number : ");
	int c = sc.nextInt();

	double result = getAverage(a, b, c);
	System.out.println("Average of " +a+ " , "+b+ " and " +c+ " is : " +result);
	
	sc.close();
	}

	public static double getAverage(int a, int b, int c){
		return ((a+b+c)/3.0);
	}
}