package com.mrll.md.processing.sequence;

import java.util.Scanner;

public class SequenceService {

    public static void main(String[] args) {

        SequenceService sequenceService = new SequenceService();
        System.out.println(sequenceService.calculateAge());
    }

    // Always write code in such way so that i can re use that code 
    public String calculateAge() {

        StringBuilder message = new StringBuilder("");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");

        // Not Good way to use double Here Age can not be in decimals like 20.5
        // etc
        // double age = input.nextDouble();

        // So use Integer for Age
        int age = input.nextInt();
        // Conditions also not correct i have modified
        if ((age >= 1) && (age <= 10)) {
            message.append("Your are child");
        } else if ((age > 10) && (age <= 30)) {
            message.append("Your are young person");
        } else if ((age > 30) && (age <= 50)) {
            message.append("Your are middle age person");
        } else if ((age > 50) && (age <= 100)) {
            message.append("Your are old man");
        } else {
            message.append("Invalid Input");
        }

        // Also forgot to close Scanner
        input.close();
        return message.toString();
    }

}
