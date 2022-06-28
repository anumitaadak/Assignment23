package com.junit;

import java.util.regex.Pattern;

public class UserRegistrationLambda {
    public static void main(String[] args) {
        LambdaInterface validateSample = (String RegExp, String testExp) -> Pattern.compile(RegExp).matcher(testExp).matches();

        System.out.println("name is "+validateSample.validate("^[A-Z][a-z]{2,}$","Riya"));
        System.out.println("email is "+validateSample.validate("^[a-z]{3}[.][x-z]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][i][n]$","abc@yahoo.com"));
        System.out.println("password is "+validateSample.validate("^[A-Z][0-9][@#]{1}[a-z]{5,}$","K9@hgjkjijk"));
        System.out.println("mobile is "+validateSample.validate("^[9][1]\\s[9][0-9]{9}$","91 9876543892"));
    }

    interface LambdaInterface {
        boolean validate(String RegExp, String testExp);
    }
}
