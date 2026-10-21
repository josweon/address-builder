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
        billingAddress.append(getAddressSection("Full name: ", scanner));

        billingAddress.append("\nBilling Address:\n");
        billingAddress.append(getAddressSection("Billing Street: ", scanner));
        billingAddress.append("\n");
        billingAddress.append(getAddressSection("Billing City: ", scanner));
        billingAddress.append(getAddressSection("Billing State: ", scanner));
        billingAddress.append(getAddressSection("Billing Zip: ", scanner));

        shippingAddress.append(getAddressSection("Shipping Street: ", scanner));
        shippingAddress.append(getAddressSection("Shipping City: ", scanner));
        shippingAddress.append(getAddressSection("Shipping State: ", scanner));
        shippingAddress.append(getAddressSection("Shipping Zip: ", scanner));

        System.out.println(billingAddress);
        System.out.println(shippingAddress);
    }

    public static String getAddressSection(String prompt, Scanner scanner){
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input.trim() + " ";
    }
}
