package com.blabz;

import java.util.regex.*;

public class UserValidator {
    //@pattern NAME_PATTERN contain the correct pattern for First name

    private final String NAME_PATTERN = "[A-Z][a-z]{2,}";

    //@method validateFirstName Check the pattern for first name

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }
}


