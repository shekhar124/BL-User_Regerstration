package com.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserRegistration registration = new UserRegistration();
		System.out.println("Enter First name");
		String fname = scan.next();
		registration.validFirstName(fname);
		System.out.println("Enter last name");
		String lname = scan.next();
		registration.validLastName(lname);
		System.out.println("Enter emailid");
		String email = scan.next();
		registration.validEmailId(email);
		System.out.println("enter mobile no");
		String mobileno = scan.next();
		registration.validMobile(mobileno);
		System.out.println("enter password");
		String password = scan.next();
		registration.validPassword(password);

	}

	private void validFirstName(String firstName) {
		String regex = "[A-Z][A-Za-z]{2,9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("User first name is valid :) ");
		} else {
			System.out.println("User first name is Invalid :( ");
		}
	}

	private void validLastName(String lastName) {
		String regex = "[A-Za-z]{2,15}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (matcher.matches()) {
			System.out.println("User Last name is valid");
		} else {
			System.out.println("User Last name is Invalid");
		}
	}
	private void validEmailId (String email) {
		String regex ="[a-zA-Z0-9_\\-.]+[@][a-z]+[\\.][a-z]{2,3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("User Email is valid");
		} else {
			System.out.println("User Email is Invalid");
		}
		
	}

	private void validMobile(String mobile) {
		String regex = "[7,8,9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobile);
		if (matcher.matches()) {
			System.out.println("mobileno is valid");
		} else {
			System.out.println("mobileno is notvalid");

		}
	}
//rule3: should have numerac number
	private void validPassword(String password) {
		String regex = "[a-zA-z_0-9-@#$%^?/<~*()+-=|&.><!]{8,18}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			System.out.println("Password is valid");

		} else {
			System.out.println("Password is not valid");
		}

	}
	
    
}
	

