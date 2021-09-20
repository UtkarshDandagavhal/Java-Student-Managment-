package Studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private String gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // constructor prompt user to enter student name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student first name: ");
        this.firstname = sc.nextLine();
        System.out.print("Enter Student last name: ");
        this.lastname = sc.nextLine();
        System.out.println("1-Freshman\n2-sophomore\n3-junior\n4-senior\n Enter Student class level");
        this.gradeYear = sc.next();
        setStudentId();
    }
    // Generate an ID
    private void setStudentId(){
        // Grade level + ID
        id++;
        this.studentId = gradeYear + "" +id;
    }
    // Enroll an course
        // --> Get inside loop,user hits 0
    public void enroll(){
        do {
            System.out.print("Enter course to enroll(Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }
    // view balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" +tuitionBalance);
    }
    // Payment
    public void payTuition(){
        viewBalance();
        System.out.print("Enter Your Payment $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank You for your payment of $" +payment);
        viewBalance();
    }
    // show status
    public String ShowInfo(){
        return "Name: " + firstname + " " + lastname +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID:" + studentId +
                "\nCourse Enrolled:" + courses +
                "\nBalance: $" +tuitionBalance;
    }

}
