package Studentdatabaseapp;

import java.util.Scanner;

public class Student_Database_App {
    public static void main(String[] args) {
        // How to ask how many user we want to add
        System.out.print("Enter number of new Student to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudent = sc.nextInt();
        Student[] students = new Student[numOfStudent];


        // Create n number of new student
        for (int i=0;i<numOfStudent;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i=0;i<numOfStudent;i++){
            System.out.println(students[i].ShowInfo());
        }

    }
}
