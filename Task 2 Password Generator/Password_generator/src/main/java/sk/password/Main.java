package sk.password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordManager passwordManager = new PasswordManager();
        System.out.println("Welcome to the SK Password Services");

        while (true) {
            System.out.println();
            System.out.println("Enter 1 - Password Generator");
            System.out.println("Enter 2 - Password Strength Check");
            System.out.println("Enter 3 - Useful Information");
            System.out.println("Enter 4 - Quit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1 -> {
                    String password = passwordManager.generatePassword();
                    System.out.println("Generated Password: " + password);
                }
                case 2 -> {
                    System.out.print("Enter the password to check its strength: ");
                    String password = sc.nextLine();
                    String strength = passwordManager.checkPasswordStrength(password);
                    System.out.println("Password Strength: " + strength);
                }
                case 3 -> {
                    passwordManager.getUsefulInformation(); // Call the new method
                }
                case 4 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    return; // Exit the loop and program
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
