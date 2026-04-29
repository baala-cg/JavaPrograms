package FirstProject.FirstProject;

import java.text.DecimalFormat;

public class NumberToWords {

	public static void main(String[] args) {
		int input = 658792;
		System.out.println("Input: " + input);
		System.out.println("Output: " + convertToWords(input));
	}

	private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	private static final String[] thousands = { "", "Thousand", "Million", "Billion" };

	public static String convertToWords(int number) {
		if (number == 0) {
			return "Zero";
		}

		String result = "";
		int thousandIndex = 0;

		while (number > 0) {
			if (number % 1000 != 0) {
				result = convertThreeDigits(number % 1000) + " " + thousands[thousandIndex] + " " + result;
			}
			number /= 1000;
			thousandIndex++;
		}

		return result.trim();
	}

	private static String convertThreeDigits(int number) {
		String result = "";

		if (number / 100 > 0) {
			result += units[number / 100] + " Hundred ";
			number %= 100;
		}

		if (number >= 20) {
			result += tens[number / 10] + " ";
			number %= 10;
		}

		if (number > 0) {
			result += units[number] + " ";
		}

		return result.trim();
	}

}
