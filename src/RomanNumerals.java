import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {

	public static String convertToRoman(int input) {

		StringBuffer romanNumeral = new StringBuffer();
		while (input >= 1000) {
			input = input - 1000;
			romanNumeral.append("M");
		}
		while (input >= 500) {
			if (input >= 900) {
				input = input - 900;
				romanNumeral.append("CM");
				break;
			}
			input = input - 500;
			romanNumeral.append("D");
		}
		while (input >= 100) {
			if (input >= 400) {
				input = input - 400;
				romanNumeral.append("CD");
				break;
			}
			input = input - 100;
			romanNumeral.append("C");
		}
		while (input >= 50) {
			if (input >= 90) {
				input = input - 90;
				romanNumeral.append("XC");
				break;
			}
			input = input - 50;
			romanNumeral.append("L");
		}
		while (input >= 10) {
			if (input >= 40) {
				input = input - 40;
				romanNumeral.append("XL");
				break;
			}
			input = input - 10;
			romanNumeral.append("X");
		}
		while (input >= 5) {
			if (input >= 9) {
				input = input - 9;
				romanNumeral.append("IX");
				break;
			}
			input = input - 5;
			romanNumeral.append("V");
		}
		while (input >= 1) {
			if (input == 4) {
				romanNumeral.append("IV");
				break;
			}
			input = input - 1;
			romanNumeral.append("I");
		}

		return romanNumeral.toString();
	}

	public static List<String> printRomanNumerals(int input) {
		List<String> romanNumeralList = new ArrayList<String>();
		for (int i = 1; i <= input; i++) {
			romanNumeralList.add("\r\n" + i + ": " + convertToRoman(i));
		}
		System.out.println(romanNumeralList);
		return romanNumeralList;
	}

}
