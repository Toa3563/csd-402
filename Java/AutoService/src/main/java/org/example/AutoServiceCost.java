/**
 * Cannon Rivera, 11/17/2025, AutoServiceCost
 * This Program Provides an output for each standard service with no fees,
 * an oilchangefee, an oil and tirerotationfee, an oil, tire, and couponamount
 * and each example is outputted twice.
 */
package org.example;

public class AutoServiceCost {
    public static final double STANDARD_SERVICE = 120.00;


    public static String yearlyService() {
        return "\nService Summary:" +
                "\nStandard Service: $" + STANDARD_SERVICE;
    }

    public static String yearlyService(double oilChangeFee) {
        double total = STANDARD_SERVICE + oilChangeFee;
        return "\nService Summary:" +
                "\nStandard Service: $" + STANDARD_SERVICE +
                "\nOil Change: $" + oilChangeFee +
                "\nTotal Cost: $" + total;
    }

    public static String yearlyService(double oilChangeFee, double tireRotationFee) {
        double total = STANDARD_SERVICE + oilChangeFee + tireRotationFee;
        return "\nService Summary:" +
                "\nStandard Service: $" + STANDARD_SERVICE +
                "\nOil Change: $" + oilChangeFee +
                "\nTire Rotation: $" + tireRotationFee +
                "\nTotal Cost: $" + total;
    }

    public static String yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        double total = STANDARD_SERVICE + oilChangeFee + tireRotationFee - couponAmount;
        return "\nService Summary:" +
                "\nStandard Service: $" + STANDARD_SERVICE +
                "\nOil Change: $" + oilChangeFee +
                "\nTire Rotation: $" + tireRotationFee +
                "\nCoupon Applied: $" + couponAmount +
                "\nTotal Cost: $" + total;
    }

    public static void main(String[] args) {
        System.out.println("TEST 1: ");
        System.out.println(yearlyService());
        System.out.println(yearlyService());

        System.out.println("TEST 2: ");
        System.out.println(yearlyService(35.00));
        System.out.println(yearlyService(40.00));

        System.out.println("TEST 3: ");
        System.out.println(yearlyService(35.00, 25.00));
        System.out.println(yearlyService(40.00, 30.00));

        System.out.println("TEST 4: ");
        System.out.println(yearlyService(35.00, 25.00, 10.00));
        System.out.println(yearlyService(40.00, 30.00, 15.00));
    }
}