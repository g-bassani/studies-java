package exceptions.passwordCreation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Create a password. The password must contain at least one letter, one number, one special character, and be at least 8 characters long. It must not contain any whitespace. ");
            String password = sc.nextLine();

            if (PasswordValidator.validator(password)) {
                System.out.println("Successful creating the password");
            }
        } catch (InvalidatePattern e) {
            System.out.println(e.getMessage());

        }
    }
}
