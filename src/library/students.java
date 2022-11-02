package library;

import java.util.Scanner;

public class students {

//    Scanner input = new Scanner(System.in);

    student theStudents[] = new student[50];

//books book;


    public static int count = 0;

    public void addStudent(student s){

        for (int i=0; i<count; i++){

            if(s.regNum.equalsIgnoreCase(theStudents[i].regNum)){

                Console.log("Student of Reg Num " + s.regNum + " is Already Registered.");
                return;
            }

        }

        if (count<=50){

            theStudents[count] = s;
            count++;

        }

    }
    public void showAllStudents(){

        Console.log("Student Name\t\tReg Number");
        for (int i=0; i<count; i++){

            Console.log(theStudents[i].studentName + "\t\t" + theStudents[i].regNum);

        }


    }

    public int isStudent(){


        //System.out.println("Enter Student Name:");
        //String studentName = input.nextLine();

        Console.log("Enter Reg Number:");
        String regNum = Console.promtString();

        for (int i=0; i<count; i++){

            if (theStudents[i].regNum.equalsIgnoreCase(regNum)){

                return i;

            }

        }
        Console.log("Student is not Registered.");
        Console.log("Get Registered First.");


        return -1;

    }
    public void checkOutBook(books book){
        int studentIndex =this.isStudent();

        if (studentIndex!=-1){
            Console.log("checking out");

            book.showAllBooks();
            book b = book.checkOutBook();
            Console.log("checking out");
            if (b!= null){

                if (theStudents[studentIndex].booksCount<=3){
                    Console.log("adding book");
                    theStudents[studentIndex].borrowedBooks[theStudents[studentIndex].booksCount] = b;
                    theStudents[studentIndex].booksCount++;
                    return;

                }
                else {

                    Console.log("Student Can not Borrow more than 3 Books.");
                    return;

                }
            }
            Console.log("Book is not Available.");

        }

    }

    public void checkInBook(books book){

        int studentIndex = this.isStudent();
        if (studentIndex != -1){
            Console.log("S.No\t\t\tBook Name\t\t\tAuthor Name");
            student s = theStudents[studentIndex];
            for (int i=0; i<s.booksCount; i++){

                Console.log(s.borrowedBooks[i].sNo+ "\t\t\t" + s.borrowedBooks[i].bookName + "\t\t\t"+
                        s.borrowedBooks[i].authorName);

            }
            Console.log("Enter Serial Number of Book to be Checked In:");
            int sNo = Integer.parseInt(Console.promtString());
            for (int i=0; i<s.booksCount; i++){

                if (sNo == s.borrowedBooks[i].sNo){

                    book.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i]=null;
                    return;

                }


            }
            Console.log("Book of Serial No "+sNo+"not Found");

        }



    }


}
