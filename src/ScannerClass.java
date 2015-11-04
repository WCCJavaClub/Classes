import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// comment
public class ScannerClass {

	public static void main(final String[] args) {
		Scanner s = null;
		File ScannerFile = null;
		FileInputStream fis = null;



		try {
			ScannerFile = new File("ScannerFile");
			//fis = new FileInputStream(ScannerFile);
			// why do we need to use FileInputStream if we can pass the file into scanner?
			s = new Scanner(ScannerFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}

		while(s.hasNext()){
			System.out.println(s.next());
		}

		s = new Scanner("this is a string");

		System.out.println("hasNext() " + s.hasNext());
		System.out.println("hasNext(\"this\")" + s.hasNext("this")); //true
		System.out.println("hasNext(\"is\")" + s.hasNext("is")); //false
		System.out.println("hasNextBoolean() " + s.hasNextBoolean());
		System.out.println("hasNextLine() " + s.hasNextLine());

		System.out.println("------------------------");
		s = new Scanner("3 word");
		System.out.println("Scanner changed");
		System.out.println("hasNextDouble()" + s.hasNextDouble());
		System.out.println("hasNextInt(3)" + s.hasNextInt(3));
		System.out.println("ioException() " + s.ioException()); // returns last exception thrown by this scanner
		System.out.println("locale() " + s.locale());
		System.out.println("match() " + s.match());
		System.out.println("radix() " + s.radix());
		System.out.println("delimiter() " + s.delimiter()); // returns the current pattern used as the delimiter
		System.out.println("toString() " + s.toString()); // WOW isn't that cool?
		System.out.println("-------------------------");

		s = new Scanner("this is another string");
		s.useDelimiter("is");
		System.out.println(s.next());
		System.out.println("-------------------------");

		s = new Scanner("Doing some Java. rest of string");
		System.out.println(s.findWithinHorizon("Java", 10));
		//System.out.println(s.nextLine());
		System.out.println(s.findWithinHorizon("Java", 20)); // removes the entire horizon from the string
		System.out.println(s.nextLine());
	}

}
