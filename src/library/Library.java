package library;


//import java.util.Scanner;

public class Library {


    public String libraryName;
    public String libraryAdress;
    public static int employeesCount;

    public Library(String libraryName, String libraryAdress, int employeesCount) {
        this.libraryName = libraryName;
        this.libraryAdress = libraryAdress;
        this.employeesCount = employeesCount;

    }

    public Library() {
        Console.log("Enter Library Name:");
        libraryName = Console.promtString();
        Console.log("Enter Library Adress:");
        libraryAdress = Console.promtString();
        Console.log("Enter Emplooyes Count:");
        employeesCount = Integer.parseInt(Console.promtString());
//
//        if(employeesCount <= 0 || employeesCount >= 10){
//            System.out.println("Employees count in the library should be bigger than 0 and less than 10! Please try again");
//
//            }
        }

    }




//    Scanner input = new Scanner(System.in);

//    public Library() {
//        System.out.println("Enter Library Name:");
//        this.libraryName = Application.input.nextLine();
//        System.out.println("Enter Library Adress:");
//        this.libraryAdress = Application.input.nextLine();
//        System.out.println("Enter Emplooyes Count:");
//        this.employeesCount = Application.input.nextInt();
//
//
//    }


