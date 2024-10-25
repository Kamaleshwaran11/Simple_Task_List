# Simple-Task-Java
## Abstract:
The Simple Task List Application is a basic command-line application that allows users to create, manage, and view tasks in an organized manner. This application serves as a foundational tool for task management and is designed with a user-friendly interface for adding, listing, and deleting tasks. The application is developed in Java and uses core concepts of Object-Oriented Programming (OOP), demonstrating how simple data structures can be used to build an effective to-do list application.

## 1. Introduction
The Simple Task List Application provides a minimalistic interface for users to manage their daily tasks. Users can create new tasks, view existing tasks, and delete completed or unnecessary tasks. This application is ideal for users who prefer a straightforward solution for keeping track of tasks without the complexity of a full-fledged project management tool.

## 2. Features
Create New Tasks: Users can add new tasks with a description.
List All Tasks: Display all current tasks with their corresponding indices.
Delete Tasks: Remove tasks by specifying the index.
Exit the Application: Safely terminate the application.
## 3. File Overview
Main.java: This file contains the main entry point of the application. It handles user interactions and invokes methods to perform operations like adding, listing, and deleting tasks.
Taskmenu.java: This file contains the logic and operations related to task management. It manages the task list and provides methods for task operations such as adding, listing, and deleting.
## 4. Class Structure
Main Class:
Contains the main method, which is the entry point of the application.
Interacts with the user and calls methods from the Taskmenu class to perform operations.
Taskmenu Class:
Manages the list of tasks.
Provides methods to add, list, and delete tasks.
Uses an ArrayList to store task descriptions, providing dynamic task management.
## 5. Usage
Running the Application: Execute the Main.java file to start the application.
Adding a Task: Follow the on-screen instructions to add a new task by entering a description.
Listing Tasks: Select the option to list all current tasks.
Deleting a Task: Choose the delete option and specify the index of the task to be removed.
Exiting: Choose the option to exit the application safely.
## 6. Future Enhancements
Implement a feature to edit existing tasks.
Add a functionality to mark tasks as completed.
Implement a file-based storage system to persist tasks between sessions.

# Here’s a step-by-step guide on how to use the provided code for the Simple Task List Application:

## 1. Setting Up the Project
Create a new Java project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).
Create two Java files: Main.java and Taskmenu.java.
Copy the code from the Main.java and Taskmenu.java files into their respective Java files in the project.
## 2. Code Overview
Main.java: Contains the main method and acts as the entry point for the application.
Taskmenu.java: Manages all task-related operations like adding, listing, and deleting tasks.
## 3. Running the Application
Run Main.java:

This will start the program and display a menu with options to add a new task, list tasks, delete a task, or exit.
Using the Menu:

Option 1: Add a new task by providing a description.
Option 2: List all existing tasks.
Option 3: Delete a task by entering its index number.
Option 4: Exit the application.
## 4. Code Flow
Main Class:

Initializes the application and displays the menu.
Takes user input to perform corresponding actions using methods in the Taskmenu class.
Taskmenu Class:

Manages an internal list of tasks using an ArrayList.
Methods:
addTask(String task): Adds a new task to the list.
listTasks(): Displays all tasks with their index numbers.
deleteTask(int index): Deletes a task at the specified index.
## 5. Example Interaction
User Input:
Choose 1 to add a task and enter "Complete Java assignment." <br>
Choose 2 to view the tasks; it will display: 1. Complete Java assignment. <br>
Choose 3 to delete task 1. <br>
Choose 2 again, and it will show no tasks left.
