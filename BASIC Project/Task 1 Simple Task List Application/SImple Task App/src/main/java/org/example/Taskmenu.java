package org.example;

import java.util.ArrayList;

class Taskmenu {
    private ArrayList<String> tasks = new ArrayList<>();

    // Display the menu options
    void displayMenu() {
        System.out.println("\nTask List Application");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Quit");
        System.out.print("Select an option: ");
    }

    // Method to add a task
    void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to remove a task
    void removeTask(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            String removedTask = tasks.remove(taskNumber - 1);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Method to list all tasks
    void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}