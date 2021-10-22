package tangleOfStrings;
import java.util.Scanner;

public class TangleOfStrings {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input.useDelimiter(System.lineSeparator());
		myPassword();
	}
	public static void myPassword() { 
		String a = "";
		System.out.print("Enter password: ");
		a = input.next();
		if(a.equals("me")) {
		System.out.println();
		 menu();
		} 
		else {
			System.out.println("Incorrect Password, try again");
			myPassword();
		}
	}
	public static void menu() {
		System.out.println("1: Print my string backwards");
		System.out.println("2: Make a list of words in my string with a given length");
		System.out.println("3: 3: Print out number of vowels in my string");
		System.out.println("4: Inverse the character case of my string");
		System.out.println("5: Compare to a 2nd string for content equality");
		System.out.println("6: Replace a word in your string with a new word");
		System.out.println("7: Quit");
		
		System.out.println();
		System.out.print("Please pick a number: ");
		int num = input.nextInt();
		String option = "";
		switch(num) {
		case 1:
			phraseReverse();
			break;
		case 2:
			wordList();
		}
		quit();
	}
	public static void phraseReverse() {
		String a = "";
		String temp = "";
		System.out.print("Please type your string: ");
		a = input.next();
		for(int i = a.length() - 1; i >=0; i--) {
			temp += a.charAt(i);
		}
		System.out.println();
		System.out.println(temp);
	}
	public static void wordList() {
		int start = 0;
		int end = 0;
		int length = 0;
		String a = "";
		System.out.print("Please type your words: ");
		a = input.next();
		System.out.print("Please give a length for your words: ");
		length = input.nextInt(); 
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == ' ') {
					end = i + 1;
					if(end - start - 1 >= length) {
						System.out.println(a.substring(start, end));
				}
			}
		}
	}
	public static void quit() { 
		System.out.println("Would you like to continue?");
		System.out.println("1 = Yes");
		System.out.println("2 = No");
		System.out.print("Please select a number: ");
		int temp = input.nextInt();
		if(temp == 1) {
			System.out.println();
			menu();
		}
		else if(temp == 2) {
			System.out.println();
			System.out.print("Thank for your time");
		}
		else {
			System.out.println();
			System.out.print("Sorry this is not an option: ");
			System.out.println();
			System.out.println();
			quit();
		}
	}
}