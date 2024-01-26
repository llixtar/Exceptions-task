package tasks.task2;

import tasks.Utils;

import java.util.Scanner;

public class Main {

    static double[] prices = new double[5];

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        initialPrices(prices, prices.length);

        System.out.println("\nДоступний перегляд цін товару за останні 5 днів!\n" +
                "Для перегляду введіть число від 1 до 5:");


        try{
            showPrice(Utils.checkNumberInt(scanner.nextLine()));
        }catch (ArrayIndexOutOfBoundsException e){
            // Обробка винятку.
            System.out.println("Exception: " + e);

            showAllPrices();
        }
        scanner.close();
    }
    //------------------------------------------------------------------------------------------------------------------
    private static void initialPrices(double[] prices, int size) {

        for (int i = 0; i < size; i++) {
            prices[i] = Math.random()*10 + 100;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    private static void showPrice(int day){
        System.out.println(Utils.roundValue(prices[day-1])  + " грн.");
    }
    //------------------------------------------------------------------------------------------------------------------
    private static void showAllPrices(){
        System.out.println("\nЦіни за останні 5 днів:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(Utils.roundValue(prices[i])  + " грн.");
        }

    }
    //------------------------------------------------------------------------------------------------------------------
}
