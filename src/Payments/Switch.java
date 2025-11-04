package Payments;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Payment Options:");
        System.out.println("1. Google Pay");
        System.out.println("2. Phone Pay");
        System.out.println("3. Paytm");
        System.out.println("4. Credit Card");
        System.out.print("Enter the payment type: ");
        String name = sc.nextLine();
        System.out.print("Enter the amount to be paid: ");
        int amount = sc.nextInt();
        Payment p=null;
        switch (name) {
            case "GooglePay":
                System.out.println("You chose Google Pay.");
                break;
                case "PhonePay":
                    System.out.println("You chose Phone Pay.");
                    break;
                    case "Paytm":
                        System.out.println("You chose Paytm.");
                        break;

                    default:
                        System.out.println("Unknown payment type. Please check your input.");
                        break;
                }
                System.out.println("The payment of ₹" + amount + " is paid using " + name);
                sc.close();
            }
        }

