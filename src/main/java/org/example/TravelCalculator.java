package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TravelCalculator {

    public static double speedCalculator (double travelledDistance, double travelledTime) {
        double speed = travelledDistance / travelledTime;
        return speed;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Give the travelled distance: ");
        Double travelledDistance = Double.parseDouble(scanner.nextLine());

        System.out.println("Give me the travelled time: ");
        Double travelledTime = Double.parseDouble(scanner.nextLine());

        double speed = speedCalculator(travelledDistance, travelledTime);

        System.out.println("The speed is " + speed + "km/h.");

    }
}
