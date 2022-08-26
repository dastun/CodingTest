package StringProgram;

import java.util.*;

public class StringProgram {
public static void main(String[] args) {
		
		String stringInput;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the string : ");
		stringInput = sc.nextLine();
		
		int wordCount = 0 , characterCount = 0;
		
		//Traversing
		for(int i=0 ; i<stringInput.length();i++) {
			if( stringInput.charAt(i) != ' ' ) {
				characterCount++;
			}
			if(stringInput.charAt(i) == ' ') {
				wordCount++;
			}
		}
		
		//Checking weather string ends with space or not
		if(stringInput.charAt( stringInput.length()-1 ) != ' ') {
			wordCount++;
		}
		
		sc.close();
		
		//Displaying result
		System.out.println("\nWord : " + wordCount);
		System.out.println("\nCharacter : " + characterCount);
	}
}
