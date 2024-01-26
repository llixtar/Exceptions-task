package tasks.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public final static int LOWER_TEMPERATURE = -10;
    public final static int HIGHER_TEMPERATURE = 35;

    static int temperature;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the temperature value:");

        try {
            temperature = scanner.nextInt();
        } catch (InputMismatchException e) {
            temperature = 0;//якщо ввели не число, встановлюємо температуру за замовчуванням
        }

        try {
            validateTemperature(temperature);
        } catch (InabilityOperateDeviceException e) {
            System.out.println("Exception: " + e);
        }

        scanner.close();
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void validateTemperature(int temperature) throws InabilityOperateDeviceException {
        if (temperature < LOWER_TEMPERATURE || temperature > HIGHER_TEMPERATURE) {
            throw new InabilityOperateDeviceException("Inability to operate the device!");
        } else System.out.println("The device is working, the temperature is acceptable");

    }
    //------------------------------------------------------------------------------------------------------------------
}
