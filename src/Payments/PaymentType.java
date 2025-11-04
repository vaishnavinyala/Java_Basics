package Payments;

import java.util.Scanner;

public class PaymentType {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Google Pay");
            System.out.println("Phone Pay");
            System.out.println("Paytm");
            System.out.println("Credit Card");
            System.out.print("Enter the payment type: ");
            String paymentType = sc.nextLine();
            System.out.print("Enter the amount to be paid: ");
            int amount = sc.nextInt();
            System.out.println("Thanks for the payment");
            System.out.println("The payment " + amount + " is paid from " + paymentType);
            sc.close();
        }
    }

