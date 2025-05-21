package AgeCalculator___E;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age in years: ");
        int age = scanner.nextInt();

        System.out.println("You entered the following number: " + age);

        AgeCalculator ac1 = new AgeCalculator();
        double days = ac1.ageInDays(age);
        System.out.println("in days: " + days);
        System.out.println("in weeks: " + ac1.ageInWeeks(age));
        System.out.println("in months: " + ac1.ageInMonths(age));
    }
}