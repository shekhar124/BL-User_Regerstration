package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration user = new UserRegistration();

	@Test
	public void givenValidFNameRetunTrue() {
		boolean value = user.validFName("Raja");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenValidFNameRetunFalse() {
		boolean value = user.validFName("raja");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenValidSNameRetunTrue() {
		boolean value = user.validSName("Shekar");
		Assert.assertEquals(true, value);

	}

	@Test
	public void givenValidSNameRetunFalse() {
		boolean value = user.validSName("shekar");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenPasswordReturnTrue() {
		boolean value = user.validPassword("282165@#Ra");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenPasswordReturnFalse() {
		boolean value = user.validPassword("282165@");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenEmainReturnTrue() {
		boolean value = user.validEmail("shekharchinna776@gmail.com");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenEmailReturnFalse() {
		boolean value = user.validEmail("shekhargmail@.com");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenPhoneNoReturnsTrue() {
		boolean value = user.validPhoneNo("9573359776");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenPhoneNoReturnsFalse() {
		boolean value = user.validPhoneNo("957335977");
		Assert.assertEquals(true, value);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

