package com.pluralsight;

import java.util.Scanner;

public class BuildAddress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get fullName
        System.out.println("Please provide the following information:");
        String fullName = getAddressSection("Full name: ", scanner);
        System.out.print("\n");

        // Get billingAddress
        String billingType = "Billing Address";
        String billingStreet = getAddressSection("Billing Street: ", scanner);
        String billingCity = getAddressSection("Billing City: ", scanner);
        String billingState = getAddressSection("Billing State: ", scanner);
        String billingZip = getAddressSection("Billing Zip: ", scanner);
        System.out.print("\n");

        String billingAddress = formatBuilderAddress(
                billingType,
                billingStreet,
                billingCity,
                billingState,
                billingZip);

        // Get shippingAddress
        String shippingType = "Shipping Address";
        String shippingStreet = getAddressSection("Shipping Street: ", scanner);
        String shippingCity = getAddressSection("Shipping City: ", scanner);
        String shippingState = getAddressSection("Shipping State: ", scanner);
        String shippingZip = getAddressSection("Shipping Zip: ", scanner);
        System.out.print("---\n");

        String shippingAddress = formatBuilderAddress(
                shippingType,
                shippingStreet,
                shippingCity,
                shippingState,
                shippingZip);

        // Final print
        System.out.printf("%s\n\n%s\n\n%s\n", fullName, billingAddress, shippingAddress);
        System.out.print("---\n");
    }

    public static String getAddressSection(String prompt, Scanner scanner) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input.trim();
    }

    public static String formatBuilderAddress(String addressType, String street, String city, String state, String zip) {
        StringBuilder address = new StringBuilder();

        address.append(addressType);
        address.append(":\n");
        address.append(street);
        address.append("\n");
        address.append(city);
        address.append(", ");
        address.append(state);
        address.append(" ");
        address.append(zip);

        return address.toString();
    }
}
