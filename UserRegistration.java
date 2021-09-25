package com.bl;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validFName(String fName) throws InvalidException {
		String regex = "[A-Z][A-Za-z]{2,9}";
		boolean value = Pattern.matches(regex, fName);
		if (!value) {
			throw new InvalidException("first name is invalid");
		}
		return true;

	}

	public boolean validSName(String sName) throws InvalidException {
		String regex = "[A-Z][A-Za-z]{2,9}";
		boolean value = Pattern.matches(regex, sName);
		if (!value) {
			throw new InvalidException("second name is invalid");
		}
		return true;

	}

	public boolean validEmail(String email) throws InvalidException {
		String regex = "[a-zA-Z0-9_\\-.]+[@][a-z]+[\\.][a-z]{2,3}";
		boolean value = Pattern.matches(regex, email);
		if (!value) {
			throw new InvalidException("email is invalid");
		}
		return true;

	}

	public boolean validPhoneNo(String phoneNO) throws InvalidException {
		String regex = "[7,8,9][0-9]{9}";
		boolean value = Pattern.matches(regex, phoneNO);
		if (!value) {
			throw new InvalidException("phone name is invalid");
		}
		return true;

	}

	public boolean validPassword(String password) throws InvalidException {
		String regex = "[a-zA-z_0-9-@#$%^?/<~*()+-=|&.><!]{8,18}";
		boolean value = Pattern.matches(regex, password);
		if (!value) {
			throw new InvalidException("password is is invalid");
		}
		return true;
	}
}
