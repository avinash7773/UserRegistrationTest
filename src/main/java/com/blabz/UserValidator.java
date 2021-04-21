package com.blabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidator {

    /*Main function methods from UserRegistration*/
    public static void main(String[] arg) throws UserValidatorException {
        /*Regex pattern for firstNamePattern, lastNamePattern, emailPattern, mobilePattern, paswordPattern*/
        String firstNamePattern = "^[A-Z]{1}[a-z]{2,}";
        String lastNamePattern = "^[A-Z]{1}[a-z]{2,}";
        String emailPattern ="^[A-Za-z0-9]+([._%+-]?[a-z0-9])*@[A-Za-z0-9-]+(\\.[a-zA-Z]{2,})(\\.[A-Za-z]{2,})?$";
        String mobilePattern = "(0|91)?[7-9]{1}[0-9]{9}";
        String passwordPattern = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

        Scanner scanner = new Scanner(System.in);
        /*Lambda function implementation to check pattern matches with input Returns boolean */
        Ivalidator userRegistration = (pattern, input) ->{
            boolean result = Pattern.matches(pattern, input);
            return result;
        };

        /*Take first name and check for exception to throw custom exception*/
        System.out.println("Enter First Name=");
        String first_name = scanner.nextLine();
        if(!userRegistration.validateInput(firstNamePattern, first_name)){
            throw new UserValidatorException("not valid input");
        }
        System.out.println("firstname :" + first_name);

        /*Take last_name and check for exception to throw custom exception*/
        System.out.println("Enter Last Name=");
        String last_name = scanner.nextLine();
        if(!userRegistration.validateInput(lastNamePattern, last_name)){
            throw new UserValidatorException("not valid input");
        }
        System.out.println("lastname :" + last_name);

        /*Take email and check for exception to throw custom exception*/
        System.out.println("Enter Email=");
        String email = scanner.nextLine();
        if(!userRegistration.validateInput(emailPattern, email)){
            throw new UserValidatorException("not valid input");
        }
        System.out.println("email :" + email);

        /*Take mobileNumber and check for exception to throw custom exception*/
        System.out.println("Enter Mobile Number=");
        String mobileNumber = scanner.nextLine();
        if(!userRegistration.validateInput(mobilePattern, mobileNumber)){
            throw new UserValidatorException("not valid input");
        }
        System.out.println("Mobile_Number :" + mobileNumber);

        /*Take password and check for exception to throw custom exception*/
        System.out.println("Enter Password =");
        String password = scanner.nextLine();
        if(!userRegistration.validateInput(passwordPattern, password)){
            throw new UserValidatorException("not valid input");
        }
        System.out.println("Password :" + password);

    }

}