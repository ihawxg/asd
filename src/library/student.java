package library;

import java.util.Scanner;
public class student {

    String studentName;
    String regNum;

    book borrowedBooks[] = new book[3];
    public int booksCount = 0;

//    Scanner input = new Scanner(System.in);

    public student(){

        Console.log("Enter Student Name:");
        this.studentName = Console.promtString();

        Console.log("Enter Reg Number:");
        this.regNum = Console.promtString();

    }
}