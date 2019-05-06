package com.layna;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// print menu
		

// get our initial task
		String ask = "What would you like to do?";
		System.out.println();
	do {
		printMenu();
		int selection = scan.nextInt();
		selection = Validator.getInt(scan,ask,1,5);
			//list tasks
		

		if (selection == 1) {
			listTasks();
		} else if (selection == 2) {
			addTask(scan);
		} else if (selection == 3) {
			deleteTask(scan);
		} else if (selection == 4) {
			completeTask(scan);
		} else if (selection == 5) {
			editTask(scan);
		} else if ( == 6) {
			String go.equalsIgnoreCase (scan, "Are you sure you want to quit? (y/n): ");
			if (go == "n") {
				break;
			} else if (go "y") {
				continue;
			} else {
				System.out.println("error!");
				continue;
			}
			scan.close();
			System.out.println("Goodbye");
		}
		
				
	}
			// add a new task 
	public static void addTask(Scanner scan) {
		String name = Validator (scan, "Team Member Name: ");
		String description = Validator (scan, "Task Description: ");
		
			// delete a task
		
			// mark a task complete
		
			//quit program?
		
		
	



	
	
	


public static void printMenu() {
System.out.println("welcome to the Task Manager!");
System.out.println("");
System.out.println(
		"1. List Tasks \n" + "2. Add Task \n" + "3. Delete Task \n" + "4. Mark Task Complete \n" + "5. Quit\n");
System.out.println("");


}
}