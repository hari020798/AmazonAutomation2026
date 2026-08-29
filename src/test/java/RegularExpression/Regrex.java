package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.formula.functions.Replace;

/*
 * Regex (Regular Expression) in Java is a pattern-matching technique
 *  used to search, validate, extract, or replace text.
 *  3 types
 *  Pattern
 *  Matches
 *  PatternSyntaxmatches
 *  java-util-reqrex = API
 *  Java regu
 *  if contrctor is private, we can't call the object,as its a singleton
 *  Pattern comes under private consturctor
 *  
 *  Sybols
 *  ^ caret symbol - Check whether the starting word
 *  $ Check if it's the last word
 *  | any of the symbol present
 *  Inside [] egz - [abc] check a or or c available in the string, and print everythin
 *  [^ab] - Except a and b, and print everything except a or b
 *  [a-z] print everthing from a to z
 *  [a-zA] Including small and capital letters
 *  \\s = space
 *  \\S = Non spaces, print everythin without spaces
 *  \\d  give only numbers
 *  \\D non digits characters only
 *  \\w words and number - no Special characters
 * d - Only Numbers, w - Words and number 
 * 
 * 

Think of it as a powerful search pattern instead of searching for exact text
*/

public class Regrex {

	private Matcher FindCountsAndSize(String str, String str2) {

		/*
		 * Starting word in a given string Ending word in a given string Any two
		 * charects in agiven string
		 **/

		Pattern compile = Pattern.compile(str2);

		Matcher matcher = compile.matcher(str);
		int i = 0;
		while (matcher.find()) {
			{

				i++;
				System.out.println(matcher.group());
			}
			System.out.println("Starts at = " + matcher.start() + "ends at = " + matcher.end());

		}
		System.out.println("Count = " + i);
		return matcher;

		/*
		 * 1st you need to call the pattern - as pattern dont have the object, You just
		 * need to call the pattern.compile as its return the return type, Then in the
		 * compile use the letter you want to test then you need to call the matchers,
		 * and you can store the entire string
		 */
	}

	private void StartsEndsOrUsingCaret(String str, String str2) {

		Pattern compile = Pattern.compile(str2);
		Matcher matcher = compile.matcher(str);

		while (matcher.find()) {

//			System.out.println(matcher.start() + " " + matcher.end());
			System.out.println(matcher.start());
		}
		

	}
	private void replaceUsintRegrex() {

		String str = "A*73ndms&598";
		String result = str.replaceAll("[^\\w]", "");

	    System.out.println(result);
	}
				
				
				
			
		

	

	public static void main(String[] args) {
		Regrex rx = new Regrex();
//		Matcher findCountsAndSize = rx.FindCountsAndSize("My name is Hari. Hari is a good guy. Hari use to pay a lot", "Hari");
//		System.out.println(findCountsAndSize.toString());
//		rx.StartsEndsOrUsingCaret("Hars Hari Keeps on Talking", "^Hari");
//		rx.StartsEndsOrUsingCaret("Hari Keeps on Talking", "Talking$");
//		rx.StartsEndsOrUsingCaret("Hari Keeps on Talking", "Talking$");
		rx.StartsEndsOrUsingCaret("Hari Keeps on Talking", "a|T");
//		rx.replaceUsintRegrex();

//		System.out.println(startsEndsOrUsingCaret.toString()
	
	}

}
