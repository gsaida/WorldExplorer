package com.techelevator.countries.services;

import com.techelevator.countries.model.Country;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public int promptForMenuSelection(String prompt) {
        int menuSelection;
        System.out.print(prompt);
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public void printMainMenu() {
        System.out.println();
        System.out.println("----Explore the World Main Menu----");
        System.out.println("1: List All Countries");
        System.out.println("2: Explore A Country");
        System.out.println("3: Surprise me with a country!");
        System.out.println("0: Exit");
        System.out.println();
    }



    public void printCountries(Country[] countries) {
        System.out.println("--------------------------------------------");
        System.out.println("Countries");
        System.out.println("--------------------------------------------");
        for (Country country : countries) {
            System.out.println(country.getName().toString());
        }
    }


    public void selectCountry() {
        System.out.println("Enter country name: ");
        String userInput = scanner.nextLine();
        CountryService countryService = new CountryService();
        Country[] country = countryService.getFactsForACountry(userInput);
        printCountry(country);

    }


    public void printCountry(Country[] country) {
        System.out.println((Arrays.toString(country)).replaceAll("\\[|\\]", ""));
    }

    public void pause() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    public void printErrorMessage() {
        System.out.println("An error occurred. Check the log for details.");
    }

}
