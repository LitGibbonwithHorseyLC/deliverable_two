package grandcircus_javabootcamp;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
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

		System.out.println(dateOne);
		System.out.println(dateTwo);

		long year = ChronoUnit.YEARS.between(dateOne, dateTwo);
		long month = ChronoUnit.MONTHS.between(dateOne, dateTwo);
		long week = ChronoUnit.WEEKS.between(dateOne, dateTwo);
		long day = ChronoUnit.DAYS.between(dateOne, dateTwo);

		System.out.println("That is a difference of " + year + " years, " + month + " months, " + week + " weeks, and "
				+ day + " days."); // FIXME remainder months and days after year, not 'or' of each unit's total.
	}
}
