package RegularExpression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.CheckForNull;

public class regrexFile {
	
	
	private void CheckNumber() {
		
		Scanner sc = null;
		
		File f = new File("C:\\Users\\husse\\eclipse-workspace\\AmazonAutomation2026\\src\\test\\java\\RegularExpression\\regrexFile");
		
		try {
		 sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println("File Path Not found");
		}
		
		while(sc.hasNextLine()) {
			
			String eachLine = sc.nextLine();
			
			String[] split = eachLine.split(":");
			String customerName = split[0].trim();
			
			int EachLine = eachLine.lastIndexOf(":");
			String PhoneNumber = eachLine.substring(EachLine + 1).trim();
			
			Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			
			Matcher matcher = p.matcher(PhoneNumber);
			
			if(matcher.find()) { //or we can use matches
				
				System.out.println("PhoneNumber : " + matcher.group() + " for : " + customerName  + " is Valid"); } // we can use phone number also
				
				else {
					System.out.println("PhoneNumber : " + PhoneNumber + " for : " + customerName  + " is Invalid");

				}
			}
			
		}


	
	public static void main(String[] args) {
		regrexFile rf = new regrexFile();
		rf.CheckNumber();
	}
}