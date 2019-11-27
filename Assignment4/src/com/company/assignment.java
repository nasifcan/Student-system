package com.company;
/*
Name: <your name>
Course: PROG10082
Assignment: 4
Class: Assignment4
 */

import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        // student object to store student records
        student s = new student();
        Scanner in = new Scanner(System.in);
        String input; // user's input
        System.out.println("Enter Students or exit");
        boolean check = true;
        // insert or delete student records until user enters exit
        while (!(input = in.nextLine()).equalsIgnoreCase("exit")) {

            String[] output = input.split(",");
            if (output[0].equalsIgnoreCase("insert")) {
                s.storeStudents(output[1], output[2], output[3],check);
            } else if (output[0].equalsIgnoreCase("delete_by_number")) {
                s.deleteStudentByNumber(output[1]);
            } else if (output[0].equalsIgnoreCase("delete_by_name")) {
                s.deleteStudentByName(output[1]);
            }
        }
        s.printStudents();
    }
    }

