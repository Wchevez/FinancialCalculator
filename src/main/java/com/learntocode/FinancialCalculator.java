package com.learntocode;
import java.util.Scanner;
public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which calculator would you like to use? Enter 'M' for mortgage calculator, 'F' for future value calculator.");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("M")) {
            System.out.println("Enter the principal amount:");
            double principal = input.nextDouble();

            System.out.println("Enter the interest rate:");
            double interestRate = input.nextDouble();

            System.out.println("Enter the length of the loan in years:");
            int years = input.nextInt();

            double monthlyInterestRate = interestRate / 1200;
            int months = years * 12;

            double monthlyPayment = principal * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -months));
            double totalInterest = monthlyPayment * months - principal;

            System.out.printf("The monthly payment is $%.2f\n", monthlyPayment);
            System.out.printf("The total interest paid is $%.2f\n", totalInterest);
        } else if (choice.equalsIgnoreCase("F")) {
            System.out.println("Enter the deposit amount:");
            double deposit = input.nextDouble();

            System.out.println("Enter the interest rate:");
            double interestRate = input.nextDouble();

            System.out.println("Enter the number of years until maturity:");
            int years = input.nextInt();

            double futureValue = deposit * Math.pow(1 + interestRate / 100, years);
            double totalInterest = futureValue - deposit;

            System.out.printf("The future value is $%.2f\n", futureValue);
            System.out.printf("The total interest earned is $%.2f\n", totalInterest);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}