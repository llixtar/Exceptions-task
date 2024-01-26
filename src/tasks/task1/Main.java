package tasks.task1;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введіть число:");

        try {
           Double.parseDouble(scanner.nextLine());

           System.out.println("Ви дійсно ввели число, молодець ;)");

        }catch (NumberFormatException e){
            System.out.println("Ви ввели не число, будьте уважніші!");

        }
        scanner.close();

    }
}
