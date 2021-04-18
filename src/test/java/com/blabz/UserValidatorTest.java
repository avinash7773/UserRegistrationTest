package com.blabz;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest{

   // @testValidFirstname is used for test firstUnit case

    @Test
    public void testValidFirstName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Avinash");
        Assertions.assertTrue(result);
    }


    @Test
    public void testValidLastName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Jadhav");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testValidPhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("7773973493");
        Assert.assertEquals(true, result);
    }
}
