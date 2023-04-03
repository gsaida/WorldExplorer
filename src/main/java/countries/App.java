package com.techelevator.countries;

import com.techelevator.countries.services.ConsoleService;
import com.techelevator.countries.services.CountryService;

import java.util.Scanner;

public class App {

    private final ConsoleService consoleService = new ConsoleService();
    private final CountryService countryService = new CountryService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int menuSelection = -1;

        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection("Please choose an option: ");
            if(menuSelection == 1) {
                consoleService.printCountries(countryService.getAllCountries());
            } else if(menuSelection == 2) {
                consoleService.selectCountry();
            }
            else if(menuSelection == 3) {
            consoleService.printCountry(countryService.getRandomCountry());
        }
            else if (menuSelection == 0) {
                continue;
            } else {
                // anything else is not valid
                System.out.println("Invalid Selection");
            }
            consoleService.pause();
        }
    }




}
