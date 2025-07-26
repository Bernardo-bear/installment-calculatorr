package academy.DavedojoMarathon;

import java.util.Scanner;

public class InstallmentCalculator {
    // Given the total value of a car, find out how many times it can be paid in installments
    // Condition: installmentValue >= 1000
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total price of the car: $");
        double totalValue = scanner.nextDouble();

        System.out.println("\nAvailable installment options for a car worth $" + totalValue + ":");

        for (int installments = 1; installments <= totalValue; installments++) {
            double installmentValue = totalValue / installments;

            if (installmentValue < 1000) {
                break;
            }

            System.out.printf("%2d installments of $%.2f%n", installments, installmentValue);
        }

        scanner.close();
    }
}