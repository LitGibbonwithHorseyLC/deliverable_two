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

		String strFirstDate = "1900/01/01";
		String strSecondDate = "2000/01/01";

		// Create scanner object.
		Scanner input = new Scanner(System.in);

		// Prompt user for the first date to compare.
		System.out.println("Enter the first date in Year/Month/Day format: [Example: 1938/10/31] :");

		// User input validation for first entry.
		while (!input.hasNext("([0-9]{4})/([0-1][1-9])/([0-9]){2}")) { // FIXME this solution isn't catching correctly
																		// formated, yet invalid dates. Example,
																		// February 31st. This throws an exception.

			System.out.println("That is not a vaid date or format, please retry: [Example: 1955/11/05] :");
			strFirstDate = input.nextLine();
		} // loop ends

		// Reads user input as a string.
		strFirstDate = input.nextLine();
		// Formats this date using the specified formatter.
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// Obtains an instance of LocalDate from the prior text string.
		LocalDate firstDate = LocalDate.parse(strFirstDate, formatDate);

		// Prompt user for the second date to compare.
		System.out.println("Enter the second date in Year/Month/Day format: [Example: 2021/06/10] :");

		// User input validation for second entry.
		while (!input.hasNext("([0-9]{4})/([0-1][1-9])/([0-9]){2}")) { // FIXME as mentioned above.
			System.out.println("That is not a vaid date or format, please retry: [Example: 2015/10/21] :");
			strSecondDate = input.nextLine();
		} // loop ends.

		// Reads user input as a second string.
		strSecondDate = input.nextLine();
		// Formats this date using the specified formatter.
		DateTimeFormatter formatDate2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		// Obtains an instance of LocalDate from the prior text string.
		LocalDate secondDate = LocalDate.parse(strSecondDate, formatDate2);

		// Feedback as to what the program is doing...
		System.out.println("Now calculating between the dates of " + firstDate + " and " + secondDate + "...");

		// Compares two properly formated dates using the java.time.Period method.
		Period period = Period.between(firstDate, secondDate);

		// Displays result...
		System.out.println("That is a difference of " + period.getYears() + " years, " + period.getMonths()
				+ " months, and " + period.getDays() + " days.");
		{
			input.close(); // Stops Eclipse' "Resource leak" warning when using scanner.
		}
	}
}
