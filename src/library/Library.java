package library;

import java.util.Scanner;

public class Library {


    public String libraryName;
    public String libraryAdress;
    public int employeesCount;

    public Library(String libraryName, String libraryAdress, int employeesCount) {
        this.libraryName = libraryName;
        this.libraryAdress = libraryAdress;
        this.employeesCount = employeesCount;
    }

    Scanner input = new Scanner(System.in);

    public Library() {
        System.out.println("Enter Library Name:");
        this.libraryName = input.nextLine();
        System.out.println("Enter Library Adress:");
        this.libraryAdress = input.nextLine();
        System.out.println("Enter Emplooyes Count:");
        this.employeesCount = input.nextInt();


    }


}