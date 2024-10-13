package sk.password;

import java.security.SecureRandom;

public class PasswordManager {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";
    private static final int PASSWORD_LENGTH = 12; // Length of the generated password

    // Generate a random password
    public String generatePassword() {
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int index = random.nextInt(ALPHABET.length());
            password.append(ALPHABET.charAt(index));
        }

        return password.toString();
    }

    // Check the strength of a password
    public String checkPasswordStrength(String password) {
        String strength = "Weak";
        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*\\d.*")) score++;
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score++;

        switch (score) {
            case 5:
                strength = "Very Strong";
                break;
            case 4:
                strength = "Strong";
                break;
            case 3:
                strength = "Moderate";
                break;
            case 2:
                strength = "Weak";
                break;
            default:
                strength = "Very Weak";
        }

        return strength;
    }

    // Provide useful information
    public void getUsefulInformation() {
        System.out.println();
        System.out.println("Use a minimum password length of 8 or more characters if permitted.");
        System.out.println("Include lowercase and uppercase alphabetic characters, numbers, and symbols if permitted.");
        System.out.println("Generate passwords randomly where feasible.");
        System.out.println("Avoid using the same password twice (e.g., across multiple user accounts and/or software systems).");
        System.out.println("Avoid character repetition, keyboard patterns, dictionary words, letter or number sequences," +
                "\nusernames, relative or pet names, romantic links (current or past), " +
                "and biographical information (e.g., ID numbers, ancestors' names, or dates).");
        System.out.println("Avoid using information that the user's colleagues and/or " +
                "acquaintances might know to be associated with the user.");
        System.out.println("Do not use passwords that consist wholly of any simple combination of the aforementioned weak components.");
    }
}
