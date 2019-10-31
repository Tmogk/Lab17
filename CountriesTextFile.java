package co.grandcircus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	public static void readListFromFile() {

		String countriesFileName = "countries.txt";
		Path path = Paths.get("CountriesTextFile", countriesFileName);

		try {
			File file = path.toFile();
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Something went wrong with the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong when we tried to read the file");
		}

	}

	public static void writeListToFile(Country country) {

		String countriesFileName = "countries.txt";
		Path path = Paths.get(countriesFileName);

		File file = path.toFile();
		PrintWriter pwOutput = null;

		try {
			pwOutput = new PrintWriter(new FileOutputStream(file, true)); // can set to false to erase what's in the
			// writer
			pwOutput.println(country);
			pwOutput.close();
		} catch (FileNotFoundException e) {
			System.out.println("Contact customer service");
		} finally {
			pwOutput.close();
		}

	}

}
