package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("FORTUNE TELLER GAME");

//Part 1
        System.out.println("What is your first name?");
        String firstName = input.next();
        if (firstName.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }

        System.out.println("What is your last name?");
        String lastName = input.next();
        if (lastName.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }

        System.out.println("What is your age?");
        String numberAge = input.next();
        if (numberAge.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }
        int age = Integer.parseInt(numberAge);

        System.out.println("What is your birth month? (1-12)");
        String birthMonth = input.next().toLowerCase();
        if (birthMonth.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }
        int birth = Integer.parseInt(birthMonth);

        System.out.println("What is your favorite ROYGBIV color? Unsure what ROYGBIV is? Type Help!");
        String favoriteColor = input.next().toLowerCase();

        String needHelp;
        while (favoriteColor.equalsIgnoreCase("help")) {
            needHelp = "The ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet";
            System.out.println(needHelp);
            favoriteColor = input.next();

        }

        System.out.println("How many siblings do you have?");
        String numberSibling = input.next().toLowerCase();
        if (numberSibling.equalsIgnoreCase("quit")) {
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }
        int sibling = Integer.parseInt(numberSibling);

//Part 2
        String numberOfYears;
        System.out.println("Years until retirement:");
        if (age % 2 == 0) {
            numberOfYears = "5";
        } else {
            numberOfYears = "25";
        }
        System.out.println(numberOfYears);

        String location;
        System.out.println("Vacation Home Location:");
        if (sibling <= 0) {
            location = "North Korea";
        } else if (sibling == 1) {
            location = "Paris, France";
        } else if (sibling == 2) {
            location = "Bora Bora, French Polynesia";
        } else if (sibling == 3) {
            location = "Bali, Indonesia ";
        } else {
            location = "Columbus,OH";
        }
        System.out.println(location);

        String modeOfTransportation;
        System.out.println("Mode of transportation:");
        switch (favoriteColor) {
            case "red" -> modeOfTransportation = "helicopter";
            case "orange" -> modeOfTransportation = "subways";
            case "yellow" -> modeOfTransportation = "boats";
            case "green" -> modeOfTransportation = "buses";
            case "blue" -> modeOfTransportation = "trains";
            case "indigo" -> modeOfTransportation = "cars";
            case "violet" -> modeOfTransportation = "biking";
            default -> modeOfTransportation = "foot";
        }
        System.out.println(modeOfTransportation);

        String bankBalance;
        System.out.println("Bank Balance:");
        if ((birth <= 0) || (birth >= 13)) {
            bankBalance = "$0.00";
        }else if ((birth <= 4)) {
            bankBalance = "$1,000,000";
        } else if (birth <= 8) {
            bankBalance = "$400,000";
        } else {
            bankBalance = "$100,000";
        }


        System.out.println(bankBalance);

//Part 3
        String myOutput = firstName + " " + lastName + " will retire in " + numberOfYears + " years with "
                + bankBalance + " in the bank, a vacation home in " + location + " and travel by "
                + modeOfTransportation + ".";
        System.out.println(myOutput);

        input.close();

        System.out.println("\n Disclaimer:The future is never set in stone! Results may vary!");

    }











    }



