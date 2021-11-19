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
		System.out.println("3: Print out number of vowels in my string");
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
			break;
		case 3:
			vowels();
			break;
		case 4:
			caseInverse();
			break;
		case 5: 
			isMatch();
			break;
		case 6:
			findReplace();
			break;
		case 7:
			autoQuit();
			break;
		}
	}
	public static void phraseReverse() {
		String temp = "";
		String mainPhrase = "";
		System.out.print("Please type your string: ");
		mainPhrase = input.next();
		for(int i = mainPhrase.length() - 1; i >=0; i--) {
			temp += mainPhrase.charAt(i);
		}
		System.out.println("--------------------------------------" + "\n" + temp + "\n" + "--------------------------------------");
		quit();
	}
	public static void wordList() {
		int length = 0;
		String mainPhrase = "";
		String temp = "";
		System.out.print("Please type your words: ");
		mainPhrase = input.next();
		System.out.print("Please give a length for your words: ");
		length = input.nextInt();			
		System.out.println("-------------------------------------");
		for(int i = 0; i < mainPhrase.length(); i++) {
				if(mainPhrase.charAt(i) != ' ') {
					temp = temp + mainPhrase.charAt(i);
				}	else {
						if(temp.length() == length) {
							System.out.println(temp);
						}
						temp = "";
				}
		}
			if(temp.length() == length) {
			System.out.println(temp + "\n" + "--------------------------------------");
		}
			quit();
	}
	public static void vowels() {
		int counter = 0;
		String mainPhrase = "";
		System.out.print("Please type your words: ");
		mainPhrase = input.next();
			for(int i = 0; i < mainPhrase.length(); i++) {
				if(Character.toString(mainPhrase.charAt(i)).toLowerCase().equals("a") ||  Character.toString(mainPhrase.charAt(i)).toLowerCase().equals("e") || Character.toString(mainPhrase.charAt(i)).toLowerCase().equals("i") || Character.toString(mainPhrase.charAt(i)).toLowerCase().equals("o") || Character.toString(mainPhrase.charAt(i)).toLowerCase().equals("u")) {
					counter++;
				}
			}
			System.out.println("--------------------------------------" + "\n" + counter + "\n" + "--------------------------------------");
			quit();
	}
	public static void caseInverse() {
		String mainPhrase = "";
		String temp = "";
		System.out.print("Please type your words: ");
		mainPhrase = input.next();
			for(int i = 0; i < mainPhrase.length(); i++) {
				if(Character.isUpperCase(mainPhrase.charAt(i))) {
					temp = temp + Character.toString(mainPhrase.charAt(i)).toLowerCase();
				}
				else if(Character.isLowerCase(mainPhrase.charAt(i))) {
					temp = temp + Character.toString(mainPhrase.charAt(i)).toUpperCase();
				} else {
					temp = temp + " ";
				}
			}
			System.out.println("--------------------------------------" + "\n" + temp + "\n" + "--------------------------------------");
			quit();
	}
	public static void isMatch() {
		String mainPhrase = "";
		String mainPhrase2 = "";
		System.out.print("Please type your words: ");
		mainPhrase = input.next();
		System.out.print("The string you would like to compare: ");
		mainPhrase2 = input.next();
			if(mainPhrase.equalsIgnoreCase(mainPhrase2)) {
				System.out.println("--------------------------------------" + "\n" + "They match" + "\n" + "--------------------------------------");
			} else {
				System.out.println("--------------------------------------" + "\n" + "They don't match" + "\n" + "--------------------------------------");
			}
			quit();
	}
	public static void findReplace() {
		String mainPhrase = "";
		String replace = "";
		String target = "";
		System.out.print("Please type your words: ");
		mainPhrase = input.next();
		System.out.print("What word would you like to replace: ");
		target = input.next();
		System.out.print("What would you like to replace it with: ");
		replace = input.next();
		target = target.toLowerCase();
		String newPhrase = mainPhrase.toLowerCase().replace(target, replace);
		System.out.print("--------------------------------------" + "\n" + newPhrase + "\n" + "--------------------------------------");
		System.out.println();
		quit();
		}
	
	public static void autoQuit() {
		System.out.println();
		System.out.print("Thank for your time");
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
