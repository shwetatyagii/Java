/* 4. Write a java program to design a method which will
accept the price of a shirt and the % profit value and will
print the total price after profit. */

import java.util.Scanner;

class ProgramQ4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the shirt price: ");
        double shirtPrice = sc.nextDouble();

        System.out.print("Enter the profit percent: ");
        double profitPercent = sc.nextDouble();

        if (profitPercent < 0 || profitPercent > 100) {
		System.out.println("Invalid profit percentage");
		sc.close();
            	return;
	}

        double profitPrice = getProfitPrice(shirtPrice, profitPercent);
		System.out.println("Price of shirt after profit is: "+ profitPrice);

 	sc.close();
    }

    public static double getProfitPrice(double shirtPrice, double profitPercent) {
		System.out.println("Price of shirt is: "+ shirtPrice);
		System.out.println("Profit% on shirt is: "+ profitPercent);
		double profitAmount = (shirtPrice * profitPercent) / 100;
		double finalPrice = shirtPrice + profitAmount;
	return finalPrice;
    }
}