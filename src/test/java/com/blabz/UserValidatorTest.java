package com.blabz;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class UserValidatorTest {

    // @testValidFirstname is used for test firstUnit case

    @Test
    public void testValidFirstName() throws UserValidatorException {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validateFirstName("Avi");
        } catch (UserValidatorException e) {
            Assert.assertEquals("Please enter valid firstName", e.getMessage());

        }
    }

    @Test
    public void testValidLastName() throws UserValidatorException {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validateLastName("jadhav");
        } catch (UserValidatorException e) {
            Assert.assertEquals("Please enter valid lastName", e.getMessage());

        }
    }

    @Test
    public void testValidPhoneNumber() throws UserValidatorException {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validatePhoneNumber("7773973493");
        } catch (UserValidatorException e) {
            Assert.assertEquals("Please enter valid PhoneNumber", e.getMessage());

        }
    }

    @Test
    public void testValidPassword() throws UserValidatorException {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validatePassword("Svaghj@ag2");
        } catch (UserValidatorException e) {
            Assert.assertEquals("Please enter valid Password", e.getMessage());

        }
    }

    @Test
    public void testValidEmail() throws UserValidatorException {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.validateEmail("javinash228@gmail,com");
        } catch (UserValidatorException e) {
            Assert.assertEquals("Please enter valid Email", e.getMessage());

        }
    }
}
