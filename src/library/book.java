package library;

import java.util.Scanner;



public class book {

    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

//    Scanner input = new Scanner(System.in);

    public book(){

        Console.log("Enter Serial No of Book:");
        this.sNo = Integer.parseInt(Console.promtString());
        Console.promtString();
        Console.log("Enter Book Name:");
        this.bookName = Console.promtString();
        Console.log("Enter Author Name:");
        this.authorName = Console.promtString();
        Console.log("Enter Quantity of Books:");
        this.bookQty = Integer.parseInt(Console.promtString());
        bookQtyCopy = this.bookQty;

    }

}