package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserRegistration {

	public boolean validFName(String fName) {
		String regex = "[A-Z][A-Za-z]{2,9}"; // name starts with captial letter. contains more than 2 charecters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fName);
		return matcher.matches();
	}

	public boolean validSName(String sName) {
		String regex = "[A-Z][A-Za-z]{2,9}"; // name starts with captial letter. contains more than 2 charecters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sName);
		return matcher.matches();

	}

	public boolean validEmail(String email) {
		String regex = "[a-zA-Z0-9_\\-.]+[@][a-z]+[\\.][a-z]{2,3}";//email validation 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean validPhoneNo(String phoNo) {
		String regex = "[7,8,9][0-9]{9}";// phone number validation phone no starts with 7,8,9 and 10 numbers needed
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoNo);
		return matcher.matches();
	}

	public boolean validPassword(String password) {
		String regex = "[a-zA-z_0-9-@#$%^?/<~*()+-=|&.><!]{8,18}"; //password validation smaller letters ,caps, numbers and special letters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}
}
