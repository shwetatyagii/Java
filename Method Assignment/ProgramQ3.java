/* 3. Write a java program to design a method which will
accept the price of a shirt and the % discount value and
will print the discounted price. */

import java.util.Scanner;

class ProgramQ3{
	public static void main(String[] args){
	
	Scanner sc =  new Scanner(System.in);

	System.out.print("Enter the shirt price: ");
	double shirtPrice = sc.nextDouble();

	System.out.print("Enter the discount percent: ");
	double discountPercent = sc.nextDouble();
	
	if(discountPercent<0 || discountPercent>100){
		System.out.println("Invalid Discount Percentage");
	sc.close();
	return;
	}

	double discountedPrice = getDiscountedPrice(shirtPrice, discountPercent);

	System.out.println("Price of shirt after discount is: "+discountedPrice);

	sc.close();
	}

	public static double getDiscountedPrice(double shirtPrice, double discountPercent){
		System.out.println("Price of shirt is: "+shirtPrice);
		System.out.println("Discount% on shirt is: "+discountPercent);
		double discountAmount = (shirtPrice*discountPercent)/100;
		double finalPrice = shirtPrice - discountAmount;
		return finalPrice;
	}
}
