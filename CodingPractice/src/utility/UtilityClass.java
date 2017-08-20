/**
 * 
 */
package utility;

/**
 * @author utkarsh
 *
 */
public class UtilityClass {

	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean isLeapYear(int year) {
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		return leap;
	}
}
