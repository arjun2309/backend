package practice1;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the String");
	//getting the string to reverse and storing it in a variable
	String reverse=scanner.nextLine();
	//declaring a blank variable to store the string
	String reverse1="";
	//for loop for iterating the string in reverse
	for(int i=reverse.length()-1;i>=0;--i) {
		//converting the string to character
		reverse1=reverse1+reverse.charAt(i);
	}
	if(reverse.equals(reverse1)) {
		System.out.println("the given string " + reverse1+ " is a palindrome");
	}
	else {
		System.out.println("it is not palindrome");	
	}
	//printing the reversed String
	System.out.println(reverse1);
	scanner.close();
}
}
