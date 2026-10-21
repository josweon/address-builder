package com.pluralsight;

import java.util.Scanner;

public class BuildAddress {
    /**
     * Grover Smith
     *
     * Billing Address:
     * 123 Main Street
     * Middleton, TX 75111
     *
     * Shipping Address
     * 456 Big Sky Blvd
     * Outer Rim, TX 75333
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();

        System.out.println("Please provide the following information:");

        String fullName = getAddressSection("Full name: ", scanner);
        String billingStreet = getAddressSection("Billing Street: ", scanner);
        String billingCity = getAddressSection("Billing City: ", scanner);
        String billingState = getAddressSection("Billing State: ", scanner);
        String billingZip = getAddressSection("Billing Zip: ", scanner);

        String shippingStreet = getAddressSection("Shipping Street: ", scanner);
        String shippingCity = getAddressSection("Shipping City: ", scanner);
        String shippingState = getAddressSection("Shipping State: ", scanner);
        String shippingZip = getAddressSection("Shipping Zip: ", scanner);

    }

    public static String getAddressSection(String prompt, Scanner scanner){
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input.trim();
    }
}
