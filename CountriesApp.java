//Author: Tyler Mogk

package co.grandcircus;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		int userEntryNum = 0;

		do {
			Scanner scnr = new Scanner(System.in);

			// Show a menu with three options

			userEntryNum = Validator.getInt(scnr, "1. Display a list of countries\n2. Enter a country\n3. Exit", 1, 3);

			if (userEntryNum == 1) {

				System.out.println("Display a list of countries"); // FIXME
				CountriesTextFile.readListFromFile(); // I struggled with this part

			} else if (userEntryNum == 2) {
				String countryName = Validator.getString(scnr, "Enter the name of the country: ");
				String countryPop = Validator.getString(scnr, "Enter the population of the country: ");
				Country newCountry = new Country(countryName, countryPop);
				CountriesTextFile.writeListToFile(newCountry);
				System.out.println("Country information updated!");
			} else {
				System.out.println("Goodbye");
			}

		} while (userEntryNum != 3);
	}

}
