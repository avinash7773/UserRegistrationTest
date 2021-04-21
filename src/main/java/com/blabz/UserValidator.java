package com.blabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserValidator {

    private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private final String PHONE_NUMBER_PATTERN = "(0|91)?[7-9][0-9]{9}";
    private final String EMAIL_PATTERN =  "^[A-Za-z0-9]+([._%+-]?[a-z0-9])*@[A-Za-z0-9-]+(\\.[a-zA-Z]{2,})(\\.[A-Za-z]{2,})?$";
    private final String PASSWORD_PATTERN = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

    public static void main(String[] args) throws UserValidatorException {
        UserValidator userValidator1 = new UserValidator();
        System.out.println("Enter firstName=");
        Scanner scobj1 = new Scanner(System.in);
        String firstName = scobj1.nextLine();
        userValidator1.validateFirstName(firstName);

        System.out.println("Enter lastName=");
        Scanner scobj2 = new Scanner(System.in);
        String lastName = scobj2.nextLine();
        userValidator1.validateLastName(lastName);

        System.out.println("Enter PhoneNumber=");
        Scanner scobj3 = new Scanner(System.in);
        String phoneNumber = scobj2.nextLine();
        userValidator1.validatePhoneNumber(phoneNumber);

        System.out.println("Enter password=");
        Scanner scobj4 = new Scanner(System.in);
        String password = scobj4.nextLine();
        userValidator1.validatePassword(password);

        System.out.println("Enter Email=");
        Scanner scobj5 = new Scanner(System.in);
        String email = scobj5.nextLine();
        userValidator1.validateEmail(email);
    }
    //@method validateFirstName Check the pattern for first name
    public  boolean validateFirstName(String firstNme) throws  UserValidatorException {
        if(!Pattern.matches(NAME_PATTERN,firstNme)) {
            throw new UserValidatorException("Please enter valid firstName");
        }
        else
            return true;
    }

    //@method validLastname Check the pattern for last name
    public  boolean validateLastName(String lastNme) throws  UserValidatorException {
        if(!Pattern.matches(NAME_PATTERN,lastNme)) {
            throw new UserValidatorException("Please enter valid lastName");
        }
        else
            return true;
    }

   // @method validdatePhoneNumber check for phoneNumber
    public  boolean validatePhoneNumber(String phoneNumber) throws  UserValidatorException {
        if(!Pattern.matches(PHONE_NUMBER_PATTERN,phoneNumber)) {
            throw new UserValidatorException("Please enter valid PhoneNumber");
        }
        else
            return true;
    }

    // @method validatePassword check for password
    public  boolean validatePassword(String password) throws  UserValidatorException {
        if(!Pattern.matches(PASSWORD_PATTERN,password)) {
            throw new UserValidatorException("Please enter valid Password");
        }
        else
            return true;
    }

    // @method validateEmail check for Email
    public  boolean validateEmail(String email) throws  UserValidatorException {
        if(!Pattern.matches(EMAIL_PATTERN,email)) {
            throw new UserValidatorException("Please enter valid Email");
        }
        else
            return true;
    }
}


