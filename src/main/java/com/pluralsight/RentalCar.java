package com.pluralsight;
import java.util.Scanner;
public class RentalCar {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userText;

        String dayMenu = """
        Pick up day:
        1. Monday
        2. Tuesday
        3. Wednesday
        4. Thursday
        5. Friday
        6. Saturday
        7. Sunday
        Please select a day (1-7): """;

        System.out.print(dayMenu);
        userText = myScanner.nextLine();
        int dayChoice = Integer.parseInt(userText);

        String pickupDay = getPickupDay(dayChoice);
        if (pickupDay.equals("Invalid")) {
            System.out.println("Sorry, that is not a valid day.");
            return;
        }

        System.out.print("How many days do you want to rent the car? ");
        userText = myScanner.nextLine();
        int rentalDays = Integer.parseInt(userText);

        System.out.print("Would you like an electronic toll tag for $3.95/day? (yes/no) ");
        String tollTagAnswer = myScanner.nextLine();

        System.out.print("Would you like a GPS for $2.95/day? (yes/no) ");
        String gpsAnswer = myScanner.nextLine();

        System.out.print("Would you like roadside assistance for $3.95/day? (yes/no) ");
        String roadsideAnswer = myScanner.nextLine();

        System.out.print("What is your current age? ");
        userText = myScanner.nextLine();
        int age = Integer.parseInt(userText);
        if (age < 21) {
            System.out.println("Sorry, you must be at least 21 to rent a car.");
            return;
        }

        double basicRental = 29.99 * rentalDays;


    }

    private static String getPickupDay(int dayChoice) {
        return "";
    }
}
