package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

import org.junit.Test;

/**
 * A class to demonstrate simple JUnit testing protocol. Based on the
 * "ScannerClass" class by Zafer Khourdaji.
 *
 * @author Jonathan Lovelace
 */
public class TestScanner {
	/**
	 * A first test, testing reading from a file.
	 * @throws FileNotFoundException if the file isn't there
	 */
	@Test
	public void testFromFile() throws FileNotFoundException {
		// Use try-with-resources to ensure that the scanner, and the file, get properly closed.
		try (final Scanner scanner = new Scanner(new File("ScannerFile"))) {
			assertEquals("first word", "one", scanner.next());
			assertEquals("second word", "two", scanner.next());
			assertEquals("third word", "three", scanner.next());
			assertFalse("No more input", scanner.hasNext());
		}
	}
	/**
	 * A second test, testing reading from a string.
	 */
	@Test
	public void testFromStringOne() {
		// try-with-resources is a bit redundant in this case, but Eclipse warns me about an unclosed resource otherwise
		try (final Scanner scanner = new Scanner("this is a string")) {
			assertTrue("more input", scanner.hasNext());
			assertTrue("the next token begins with 'this'", scanner.hasNext("this"));
			assertFalse("the next token does not begin with 'is'", scanner.hasNext("is"));
			assertFalse("the next token is not a String representation of a boolean", scanner.hasNextBoolean());
			assertTrue("there is at least one full line of input", scanner.hasNextLine());
		}
	}
	/**
	 * A third test, testing reading numbers from a string.
	 */
	@Test
	public void testFromStringTwo() {
		try (final Scanner scanner = new Scanner("3 word")) {
			assertTrue("3 is a double", scanner.hasNextDouble());
			assertFalse("3 is not an integer base 3", scanner.hasNextInt(3));
			assertNull("scanner's input source hasn't thrown an exception yet", scanner.ioException());
			assertEquals("this test developed in the U.S.", Locale.US, scanner.locale());
			// skipping testing matcher(), since the only way to get a
			// MatchResult that equals() it is to perform the same search again
			assertEquals("base 10 is default", 10, scanner.radix());
			assertEquals("whitespace-delimited", "\\p{javaWhitespace}+", scanner.delimiter().pattern());
			// skipping toString as too complicated, and far too reliant on implementation details
		}
	}
	/**
	 * A fourth test.
	 */
	@Test
	public void testFromStringThree() {
		try (final Scanner scanner = new Scanner("this is another string")) {
			scanner.useDelimiter("is");
			assertEquals("custom delimiter", "th", scanner.next());
		}
	}
	/**
	 * A fifth test.
	 */
	@Test
	public void testFromStringFour() {
		try (final Scanner scanner = new Scanner("Doing some Java. rest of string")) {
			assertNull("not found in first 10 characters", scanner.findWithinHorizon("Java", 10));
			assertEquals("found with horizon extended", "Java", scanner.findWithinHorizon("Java", 20));
			assertEquals("finding moves the cursor", ". rest of string", scanner.nextLine());
		}
	}
}
