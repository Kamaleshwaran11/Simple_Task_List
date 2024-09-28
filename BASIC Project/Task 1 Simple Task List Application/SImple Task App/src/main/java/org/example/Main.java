package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Taskmenu taskMenu = new Taskmenu();
        System.out.println("Welcome to the Task List Application");

        while (true) {
            taskMenu.displayMenu();
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    // Add Task
                    System.out.println("Enter the Task Name:");
                    String task = sc.nextLine();  // Now correctly reads task name
                    taskMenu.addTask(task);
                    break;
                case 2:
                    // Remove Task
                    System.out.println("Enter the task number to remove:");
                    int taskNumber = sc.nextInt();
                    taskMenu.removeTask(taskNumber);
                    break;
                case 3:
                    // List Tasks
                    taskMenu.listTasks();
                    break;
                case 4:
                    System.out.println("Quitting...");
                    sc.close();
                    return; // Exit the loop and terminate the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}