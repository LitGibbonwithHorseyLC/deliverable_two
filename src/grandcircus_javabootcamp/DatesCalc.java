package grandcircus_javabootcamp;

// Chose newer java.time.* from SE8 over java.util.Calendar for ease of use.
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
// import java.util.Scanner; to be implemented.

/*
 * Write a Java console application to calculate the duration between two dates
 * in Years, Months and Days. The user should enter two dates as input, then the
 * program will show the result of the difference in time between these two
 * dates.
 */

public class DatesCalc {
	public static void main(String[] args) {

		// TODO implement user inputed dates.

		LocalDate dateOne = LocalDate.of(1978, Month.OCTOBER, 3);
		LocalDate dateTwo = LocalDate.of(2018, Month.JULY, 7);

		System.out.println("Calculating between dates of " + dateOne + " and " + dateTwo + "...");

		Period period = Period.between(dateOne, dateTwo);

		System.out.println("That is a difference of " + period.getYears() + " years, " + period.getMonths()
				+ " months, and " + period.getDays() + " days.");
	}
}
