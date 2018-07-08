package grandcircus_javabootcamp;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Write a Java console application to calculate the duration between two dates
 * in Years, Months and Days. The user should enter two dates as input, then the
 * program will show the result of the difference in time between these two
 * dates.
 */

public class DatesCalc {
	public static void main(String[] args) {

		// LocalDate dateOne = LocalDate.of(1900, Month.JANUARY, 1);
		// LocalDate dateTwo = LocalDate.of(2000, Month.JANUARY, 1);
		String strFirstDate = "1900/01/01";
		String strSecondDate = "2000/01/01";

		// Create scanner object.
		Scanner input = new Scanner(System.in);

		// Prompt user for the first date to compare.
		System.out.println("Enter the first date in Year/Month/Day format: [Example: 1938/10/31] :");
		strFirstDate = input.nextLine(); // Reads user input as a string.
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate firstDate = LocalDate.parse(strFirstDate, formatDate);

		// Prompt user for the first date to compare.
		System.out.println("Enter the first date in Year/Month/Day format: [Example: 1938/10/31] :");
		strSecondDate = input.nextLine(); // Reads user input as a second string.
		DateTimeFormatter formatDate2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate secondDate = LocalDate.parse(strSecondDate, formatDate2);

		// Feedback as to what the program is doing...
		System.out.println("Calculating between dates of " + firstDate + " and " + secondDate + "...");

		// Compares two properly formated dates using the java.time.Period method.
		Period period = Period.between(firstDate, secondDate);

		// Displays result...
		System.out.println("That is a difference of " + period.getYears() + " years, " + period.getMonths()
				+ " months, and " + period.getDays() + " days.");
	}
}
