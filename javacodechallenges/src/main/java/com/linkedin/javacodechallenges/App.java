package com.linkedin.javacodechallenges;

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        if(Objects.isNull(password)) {
            return false;
        }
        String pattern = "^(?=.*[A-Z])(?=.*[0-9]).{6,}$";
        return password.matches(pattern);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
