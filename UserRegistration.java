package com.bl;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserRegistration registration = new UserRegistration();
		System.out.println("name");
		String name = scan.next();
		registration.validFirstName(name);
	}

	private void validFirstName(String firstName) {
		String regex = "[A-Z][A-Za-z]{6,8}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("User first name is valid :) ");
		} else {
			System.out.println("User first name is Invalid :( ");
		}
	}
}
	
	
	
	
	
	

