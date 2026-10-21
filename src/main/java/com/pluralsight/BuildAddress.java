package com.pluralsight;

import java.util.Scanner;

public class BuildAddress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder address = new StringBuilder();

        System.out.println("Please provide the following information:");
        address.append(getAddressSection("Full name: ", scanner));

        address.append("\nBilling Address:\n");
        address.append(getAddressSection("Billing Street: ", scanner));
        address.append(getAddressSection("Billing City: ", scanner));
        address.append(getAddressSection("Billing State: ", scanner));
        address.append(getAddressSection("Billing Zip: ", scanner));
        address.append(getAddressSection("Shipping Street: ", scanner));

        System.out.println(address);
    }

    public static String getAddressSection(String prompt, Scanner scanner){
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input.trim() + " ";
    }
}
