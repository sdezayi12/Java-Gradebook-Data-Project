package Project;
import java.util.Scanner;

//main class
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user input for no. students
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        //array of students
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            //user input for student details and marks
            System.out.println("Enter student details -> ");

            System.out.println("ID: ");
            int ID = input.nextInt();
            System.out.println("First name: ");
            String firstName = input.next();
            System.out.println("Last name: ");
            String lastName = input.next();

            System.out.println("Enter module CW001 marks ->");
            System.out.println("Homework 1: ");
            int hwk1 = input.nextInt();
            System.out.println("Homework 2: ");
            int hwk2 = input.nextInt();
            System.out.println("Homework 3: ");
            int hwk3 = input.nextInt();
            System.out.println("Project: ");
            int project = input.nextInt();

            System.out.println("Enter module EX002 marks ->");
            System.out.println("Exam: ");
            int exam = input.nextInt();

            System.out.println("Enter module CE003 marks ->");
            System.out.println("Homework 1: ");
            int hwk4 = input.nextInt();
            System.out.println("Homework 2: ");
            int hwk5 = input.nextInt();
            System.out.println("Homework 3: ");
            int hwk6 = input.nextInt();
            System.out.println("Homework 4: ");
            int hwk7 = input.nextInt();
            System.out.println("Exam mark: ");
            int exam2 = input.nextInt();

            //initialising array of student instances including module instances
            students[i] = new Student(ID, firstName, lastName, new CW001("CW001", 0, hwk1, hwk2, hwk3, project), new EX002("EX002", 1, exam), new CE003("CE003", 2, hwk4, hwk5, hwk6, hwk7, exam2));
        }

        //prompt user whether to print marks for single module by name or for all modules
        System.out.println("Print marks for single module or all modules? (enter CW001/EX002/CE003 for single module/ALL for all)");
        String choice = input.next();
        switch (choice) {
            case "CW001":
                System.out.println("Marks for CW001: ");
                System.out.printf("%-10s %-12s %-14s %-14s %-10s", "Name", "Surname", "HW's%", "Project%", "Final Mark%\n");
                for (int a = 0; a < numStudents; a++) {
                    students[a].printCW001();
                    System.out.println();
                }
                break;
            case "EX002":
                System.out.println("Marks for EX002: ");
                System.out.printf("%-10s %-12s %-14s", "Name", "Surname", "Final Mark%\n");
                for (int a = 0; a < numStudents; a++) {
                    students[a].printEX002();
                    System.out.println();
                }
                break;
            case "CE003":
                System.out.println("Marks for CE003: ");
                System.out.printf("%-10s %-12s %-14s %-14s %-10s", "Name", "Surname", "CW%", "Exam%", "Final Mark%\n");
                for (int a = 0; a < numStudents; a++) {
                    students[a].printCE003();
                    System.out.println();
                }
                break;
            case "ALL":
                System.out.println("Marks for all modules: ");
                System.out.printf("%-10s %-12s %-14s %-14s %-10s", "Name", "Surname", "CW001%", "EX002%", "CE003%\n");
                for (int a = 0; a < numStudents; a++) {
                    students[a].printall();
                    System.out.println();
                }
                break;
        }
        input.close();
    }
}
