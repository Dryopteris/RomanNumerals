import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void shouldReturn_I_WhenInputIs1() throws Exception {

		String expected = "I";

		String actual = RomanNumerals.convertToRoman(1);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_II_WhenInput2() throws Exception {

		String expected = "II";

		String actual = RomanNumerals.convertToRoman(2);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_III_WhenInput3() throws Exception {

		String expected = "III";

		String actual = RomanNumerals.convertToRoman(3);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_IV_WhenInput4() throws Exception {

		String expected = "IV";

		String actual = RomanNumerals.convertToRoman(4);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_V_WhenInput5() throws Exception {

		String expected = "V";

		String actual = RomanNumerals.convertToRoman(5);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_L_WhenInput50() throws Exception {

		String expected = "L";

		String actual = RomanNumerals.convertToRoman(50);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_C_WhenInput100() throws Exception {

		String expected = "C";

		String actual = RomanNumerals.convertToRoman(100);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_D_WhenInput500() throws Exception {

		String expected = "D";

		String actual = RomanNumerals.convertToRoman(500);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_M_WhenInput1000() throws Exception {

		String expected = "M";

		String actual = RomanNumerals.convertToRoman(1000);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturn_MM_WhenInput2000() throws Exception {

		String expected = "MM";

		String actual = RomanNumerals.convertToRoman(2000);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturn_MD_WhenInput1500() throws Exception {

		String expected = "MD";

		String actual = RomanNumerals.convertToRoman(1500);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturn_MDC_WhenInput1600() throws Exception {

		String expected = "MDC";

		String actual = RomanNumerals.convertToRoman(1600);

		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturn_XL_WhenInput40() throws Exception {

		String expected = "XL";

		String actual = RomanNumerals.convertToRoman(40);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_XLIV_WhenInput44() throws Exception {

		String expected = "XLIV";

		String actual = RomanNumerals.convertToRoman(44);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_XLIX_WhenInput49() throws Exception {

		String expected = "XLIX";

		String actual = RomanNumerals.convertToRoman(49);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_XCIX_WhenInput99() throws Exception {

		String expected = "XCIX";

		String actual = RomanNumerals.convertToRoman(99);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_CIV_WhenInput104() throws Exception {

		String expected = "CIV";

		String actual = RomanNumerals.convertToRoman(104);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_CDXCIV_WhenInput494() throws Exception {

		String expected = "CDXCIV";

		String actual = RomanNumerals.convertToRoman(494);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_CMXCIX_WhenInput999() throws Exception {

		String expected = "CMXCIX";

		String actual = RomanNumerals.convertToRoman(999);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_MMMCMXLIV_WhenInput3944() throws Exception {

		String expected = "MMMCMXLIV";

		String actual = RomanNumerals.convertToRoman(3944);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_MMMCMXCIX_WhenInput3999() throws Exception {

		String expected = "MMMCMXCIX";

		String actual = RomanNumerals.convertToRoman(3999);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturn_DCCCLXXXVIII_WhenInput888() throws Exception {

		String expected = "DCCCLXXXVIII";

		String actual = RomanNumerals.convertToRoman(888);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnListOfRomanNumeralsUpTo3999() throws Exception {

		List<String> actual = RomanNumerals.printRomanNumerals(3999);

		assertEquals(actual.size(), 3999);
		assertEquals(actual.get(0), "\r\n1: I");
		assertEquals(actual.get(443), "\r\n444: CDXLIV");
		assertEquals(actual.get(3998), "\r\n3999: MMMCMXCIX");
	}
}
