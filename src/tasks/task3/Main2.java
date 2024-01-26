package tasks.task3;

import tasks.Utils;

import java.util.Scanner;

public class Main2 {

    static double price;

    private static final Scanner scanner = new Scanner(System.in);
    public final static double CASH = 499.56;//

    public static void main(String[] args) {
        System.out.println("Balanse: " + CASH + " UAH. Enter the amount to be paid:");
        price = Utils.checkNumberInt(scanner.nextLine());

        if (price != -1) {

            try {
                validate(price);
            } catch (InsufficientFundsException e) {

                System.out.println("Exception: " + e);
            }


        } else System.out.println("Not a number");

        scanner.close();
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void validate(double price) throws InsufficientFundsException {
        if (price > CASH) {
            // Виняток, що викидується
            throw new InsufficientFundsException("Insufficient funds to purchase");
        } else {
            double blnc = CASH - price;

            System.out.println("Balance: " + blnc + " UAH.");
        }

        //------------------------------------------------------------------------------------------------------------------
    }
}
