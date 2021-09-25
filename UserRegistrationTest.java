package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration user = new UserRegistration();

	@Test
	public void givenValidFNameRetunTrue() throws InvalidException {
		boolean value = user.validFName("Raja");
		Assert.assertEquals(true, value);
	}

	@Test(expected = InvalidException.class)
	public void givenValidFNameRetunFalse() throws InvalidException {
		boolean value = user.validFName("raja");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenValidSNameRetunTrue() throws InvalidException {
		boolean value = user.validSName("Shekhar");
		Assert.assertEquals(true, value);
	}

	@Test(expected = InvalidException.class)
	public void givenValidSNameRetunFalse() throws InvalidException {
		boolean value = user.validSName("shekhar");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenValidEmailRetunTrue() throws InvalidException {
		boolean value = user.validEmail("shekharchinna776@gmail.com");
		Assert.assertEquals(true, value);
	}

	@Test(expected = InvalidException.class)
	public void givenValidEmailRetunFalse() throws InvalidException {
		boolean value = user.validEmail("shekhargmail.com");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenValidPhoneNoRetunTrue() throws InvalidException {
		boolean value = user.validPhoneNo("9032144789");
		Assert.assertEquals(true, value);
	}

	@Test(expected = InvalidException.class)
	public void givenValidPhoneNoRetunFalse() throws InvalidException {
		boolean value = user.validPhoneNo("786576");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenValidPasswordRetunTrue() throws InvalidException {
		boolean value = user.validPassword("shek@123");
		Assert.assertEquals(true, value);
	}

	@Test(expected = InvalidException.class)
	public void givenValidPasswordNoRetunFalse() throws InvalidException {
		boolean value = user.validPassword("786576");
		Assert.assertEquals(true, value);
	}

}
	
	
	

	
	

	 
	

