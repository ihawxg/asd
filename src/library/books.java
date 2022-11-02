package library;

import java.util.Scanner;

public class books {

    book theBooks[] = new book[50];     // Array that stores 'book' Objects.
    public static int count;    // Counter for No of book objects Added in Array.

//    Scanner input = new Scanner(System.in);




    public int compareBookObjects(book b1, book b2){

        if (b1.bookName.equalsIgnoreCase(b2.bookName)){

            Console.log("Book of this Name Already Exists.");
            return 0;

        }
        if (b1.sNo==b2.sNo){

            Console.log("Book of this Serial No Already Exists.");
            return 0;
        }
        return 1;
    }

    public void addBook(book b){

        for (int i=0; i<count; i++){

            if (this.compareBookObjects(b, this.theBooks[i]) == 0)
                return;

        }

        if (count<50){

            theBooks[count] = b;
            count++;

        }
        else{

            Console.log("No Space to Add More Books.");

        }

    }

    public void searchBySno(){

        Console.log("\t\t\t\tSEARCH BY SERIAL NUMBER\n");

        int sNo;
        Console.log("Enter Serial No of Book:");
        sNo = Integer.parseInt(Console.promtString());

        int flag = 0;
        Console.log("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i=0; i<count; i++){

            if (sNo == theBooks[i].sNo){

                Console.log(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" +
                        theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);
                flag++;
                return;

            }

        }
        if (flag == 0)
            Console.log("No Book for Serial No " + sNo + " Found.");

    }

    public void searchByAuthorName(){

        Console.log("\t\t\t\tSEARCH BY AUTHOR'S NAME");
        Console.promtString();
        Console.log("Enter Author Name:");
        String authorName = Console.promtString();
        int flag = 0;
        Console.log("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i=0; i<count; i++){

            if (authorName.equalsIgnoreCase(theBooks[i].authorName)){

                Console.log(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" +
                        theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);
                flag++;
            }

        }
        if (flag == 0)
            Console.log("No Books of " + authorName + " Found.");

    }


    public void showAllBooks(){

        Console.log("\t\t\t\tSHOWING ALL BOOKS\n");
        Console.log("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i=0; i<count; i++){

            Console.log(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" +
                    theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);


        }

    }

    public void upgradeBookQty(){

        Console.log("\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        Console.log("Enter Serial No of Book");
        int sNo = Integer.parseInt(Console.promtString());
        for (int i=0; i<count; i++){

            if (sNo == theBooks[i].sNo){

                Console.log("Enter No of Books to be Added:");
                int addingQty = Integer.parseInt(Console.promtString());
                theBooks[i].bookQty += addingQty;
                theBooks[i].bookQtyCopy += addingQty;
                return;

            }

        }

    }


    public void dispMenu(){

        Console.log("----------------------------------------------------------------------------------------------------------");
        Console.log("Enter 0 to Exit Application.");
        Console.log("Enter 1 to Add new Book.");
        Console.log("Enter 2 to Upgrade Quantity of a Book.");
        Console.log("Enter 3 to Search a Book.");
        Console.log("Enter 4 to Show All Books.");
        Console.log("Enter 5 to Register Student.");
        Console.log("Enter 6 to Show All Registered Students.");
        Console.log("Enter 7 to Check Out Book. ");
        Console.log("Enter 8 to Check In Book");
        Console.log("-------------------------------------------------------------");

    }

    public int isAvailable(int sNo){

        //returns the index number if available



        for (int i=0; i<count; i++){

            if (sNo == theBooks[i].sNo){
                if(theBooks[i].bookQtyCopy > 0){

                    Console.log("Book is Available.");
                    return i;

                }
                Console.log("Book is Unavailable");
                return -1;

            }

        }

        Console.log("No Book of Serial Number " + " Available in Library.");
        return -1;


    }

    public book checkOutBook(){

        Console.log("Enter Serial No of Book to be Checked Out.");
        int sNo = Integer.parseInt(Console.promtString());

        int bookIndex =isAvailable(sNo);

        if (bookIndex!=-1){

            //int bookIndex = isAvailable(sNo);
            theBooks[bookIndex].bookQtyCopy--;

            return theBooks[bookIndex];
        }

        return null;

    }

    public void checkInBook(book b){

        for (int i=0; i<count; i++){

            if (b.equals(theBooks[i]) ){

                theBooks[i].bookQtyCopy++;
                return;

            }

        }

    }







}