package library;

import java.util.Scanner;

public class Application {


//    public static Scanner input;

    public static void main(String[] args) {


//        Scanner input = new Scanner(System.in);
//Library library = new Library();
        new Library();

        if (Library.employeesCount <= 0 || Library.employeesCount >= 10) {
            Console.log("Employees count in the library should be bigger than 0 and less than 10! Please try again");
            new Library();
        }

//        Console.promtString();

        Console.promtString();

        Console.log("********************Welcome to the Student Library!********************");
        Console.log("              Please Select From The Following Options:               ");
        Console.log("**********************************************************************");
        books ob = new books();
        students obStudent = new students();
        int choice;
        int searchChoice;


        do {


            ob.dispMenu();
            choice = Integer.parseInt(Console.promtString());

            switch (choice) {

                case 1:
                    book b = new book();
                    ob.addBook(b);
                    break;

                case 2:

                    ob.upgradeBookQty();
                    break;

                case 3:
                    Console.log("Enter 1 to Search with Serial No.");
                    Console.log("Enter 2 to Search with Author Name(Full Name).");
                    searchChoice = Integer.parseInt(Console.promtString());

                    switch (searchChoice) {

                        case 1:
                            ob.searchBySno();
                            break;
                        case 2:
                            ob.searchByAuthorName();

                    }
                    break;

                case 4:
                    ob.showAllBooks();
                    break;
                case 5:
                    student s = new student();
                    obStudent.addStudent(s);
                    break;
                case 6:
                    obStudent.showAllStudents();
                    break;
                case 7:
                    obStudent.checkOutBook(ob);
                    break;
                case 8:
                    obStudent.checkInBook(ob);
                    break;
                default:
                    Console.log("CHOICE SHOULD BE BETWEEN 0 TO 8.");

            }

        }
        while (choice != 0);


    }

}