package com.blabz;

import java.util.regex.*;

public class UserValidator {
    //@pattern NAME_PATTERN contain the correct pattern for First name

    private final String NAME_PATTERN = "[A-Z][a-z]{2,}";
    private final String PHONE_NUMBER_PATTERN = "(0|91)?[7-9][0-9]{9}";
    private final String EMAIL_PATTERN = "[A-Za-z0-9]{1,}@[A-Z,a-z]{1,}[.]com";

    //@method validateFirstName Check the pattern for first name

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }

    //@method validLastName Check the pattern for last name
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        return result;
    }

    //@validDatePhoneNumber check for number is valid or invalid
    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean result = matcher.matches();
        return result;
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        return result;
    }
}


