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

    public static java.util.List inputFirst() {
        java.util.List list = new ArrayList();
        list.add(new Object[]{"javinash228@gmail.com",true});
       list.add(new Object[] {"abc-100@yahoo.com",true});
        list.add(new Object[]{"abc.100@yahoo.com",true});
        list.add(new Object[] {"abc111@abc.com",true});
        list.add(new Object[] {"abc-100@abc.net", false});
        list.add(new Object[]{"abc.100@abc.com.au", true});
        list.add(new Object[]{"abc@1.com", true});
        list.add(new Object[]{"abc@gmail.com.com", true});
        list.add(new Object[]{"abc+100@gmail.com", true});
        list.add(new Object[]{"abc", false});
        list.add(new Object[]{" abc@.com.my ", false});
        list.add(new Object[]{"abc123@gmail.a", false});//
        list.add(new Object[]{"abc123@.com", false});
        list.add(new Object[]{"abc123@.com.com", false});
        list.add(new Object[]{".abc@abc.com ", false});
        list.add(new Object[]{"abc()*@gmail.com", false});
        list.add(new Object[]{"abc@%*.com", false});
        list.add(new Object[]{"abc..2002@gmail.com ", false});
        list.add(new Object[]{"abc.@gmail.com", false});
        list.add(new Object[]{"abc@abc@gmail.com", false});
        list.add(new Object[]{"abc@gmail.com.1a", false});
        list.add(new Object[]{"abc@gmail.com.aa.au", false});
        return list;
    }

    @Test
    public void testValidEmail() {
        UserValidator userValidator = new UserValidator();
       Iterator iterator = inputFirst().listIterator();
        while (iterator.hasNext()) {
            boolean result = userValidator.validateEmail((String) iterator.next());
            Assert.assertEquals(true, result);
        }
    }

    @Test
    public void testValidPassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Ahi@5714");
        Assert.assertEquals(true, result);
    }

}
