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
}
