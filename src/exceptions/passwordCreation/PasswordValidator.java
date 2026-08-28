package exceptions.passwordCreation;

public class PasswordValidator {

    public static boolean validator(String password) {

        if (!(password.matches("(?!.*\\s)(?=.*[}{,.^?!@~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}"))) {
            throw new InvalidatePattern("Invalid");
        }

        return true;
    }
}
