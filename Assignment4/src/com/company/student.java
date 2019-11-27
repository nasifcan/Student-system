package com.company;

/*
Name: <your name>
Course: PROG10082
Assignment: 4
Class: Student
 */


public class student {

    String[][] student; // store the students
    int studentSize = 1; // number of students added

    public student() {
        // there can be a maximum of 30 students
        // Number, name, and program are stored for each student
        student = new String[30][3];

        // when the object is initialized, the size is 0
    }

    // this function stores the student's number, name, and program in the
    // Student array
    public void storeStudents(String number, String name, String program,boolean check) {

        if(number.length() > 4){
            System.out.println("Max Number Length must be 4");
            check= false;
        }
        else if(name.length() > 8){
            System.out.println("Max Name Length must be 8");
            check = false;
        }
        else if(program.length() > 8){
            System.out.println("Max Program Length must be 8");
            check = false;
        }
        if(check){
            student[studentSize][0]=number;
            student[studentSize][1]=name;
            student[studentSize][2]=program;
            studentSize = studentSize + 1;
        }
    }

    // delete the student record from the student array based on the number
    // provided
    public void deleteStudentByNumber(String number) {
        for (int i = 1; i < studentSize ; i++) {
            if(number.equals(student[i][0])){
                for(int j = i; j < studentSize-1 ; j++){
                    student[j][0]= student[j+1][0];
                    student[j][1]= student[j+1][1];
                    student[j][2]= student[j+1][2];
                }
                studentSize = studentSize-1;
            }
        }
        // TO DO
    }

    // delete the student record from the student array based on the name
    // provided. If there are multiple students with the same name, delete
    // all names
    public void deleteStudentByName(String name) {
        for (int i = 1; i < studentSize ; i++) {
            if(name.equals(student[i][1])){
                for(int j = i; j < studentSize-1 ; j++){
                    student[j][0]= student[j+1][0];
                    student[j][1]= student[j+1][1];
                    student[j][2]= student[j+1][2];
                }
                studentSize = studentSize-1;
            }
        }
        // TO DO
    }

    // Print the elements in the student array
    public void printStudents() {
        // Table headers
        System.out.printf("%-5s%-10s%-10s%-10s%n","ID","Number","Name","Program");
        for (int i = 1; i < studentSize ; i++) {
            System.out.println(i+"     "+ student[i][0]+"    "+ student[i][1]+"     "+ student[i][2]);
        }
        // TO DO.
        // //Use printf based on the columns / width defined above
    }

    // Returns the numbers of students added
    public int getStudentSize() {

        // TO DO
        return 0; // this is a placeholder only (so that the program compiles
    }

}