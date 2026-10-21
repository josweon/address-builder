package com.pluralsight;

import java.util.Scanner;

public class BuildAddress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder address = new StringBuilder();

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String input1 = scanner.nextLine();
        address.append(input1);

        System.out.println(address);
    }
}
