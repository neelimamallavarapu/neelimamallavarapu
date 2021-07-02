package com.company.assignments;
import java.util.Scanner;
public class BookDetailsMain
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        boolean repeatFlag=false;
        BookAuthor authArr[]=null;
        BookDetailsNew bookDArr[]=null;
        int numberOfBooks;
        int numOfAuth;
        int numOfBooksToSearch;
        int searchFlag=0;
        Scanner scInt=new Scanner(System.in);
do {
    int menuOption;
    System.out.println("Menu:");
    System.out.println("Press 1 to add an author");
    System.out.println("Press 2 to add a book");
    System.out.println("Press 3 to search a book by name");
    System.out.println("Press 4 to display a book details");
    System.out.println("Press 5 to display an author details");
    System.out.println("Press 6 to display all books");
    System.out.println("Press 7 to display all authors");
    System.out.println("Press 8 to Exit");
    menuOption = sc.nextInt();
        if (menuOption == 0 || menuOption > 8)
        {
            System.out.println("Option Invalid");

            break;
        }
        else
        {

            switch (menuOption)
        {
            case 1:

                System.out.println("Please enter the number of Authors to add");
                numOfAuth = sc.nextInt();
                sc.nextLine();
                authArr=new BookAuthor[numOfAuth];
                String authName, authLocation, authCountry;
                for (int i = 0; i < numOfAuth; i++)
                {
                    System.out.println("Please enter the name of author "+(i+1));
                    authName = sc.nextLine();

                    if (authName.equals(""))
                    {
                        new BookAuthor();
                        i--;
                    }
                    else
                    {
                        System.out.println("Please enter the Location of author" +(i+1));
                        authLocation = sc.nextLine();
                        System.out.println("Please enter the Country of author" +(i+1));
                        authCountry = sc.nextLine();


                        if (authLocation.equals("") && authCountry.equals(""))
                        {
                            authArr[i] = new BookAuthor(authName);
                        }
                        else if (authLocation.equals(""))
                        {
                            authArr[i] = new BookAuthor(authName, authCountry);
                        }
                        else
                        {
                            authArr[i] = new BookAuthor(authName, authLocation, authCountry);
                        }
                    }


                }
                System.out.println("Author details Added:");
                for (int i = 0; i < numOfAuth; i++)
                {
                    System.out.println("Author name: " + authArr[i].authorName);
                    System.out.println("         " + authArr[i].authorName + " is from place " + authArr[i].authPlace);
                    System.out.println("         " + authArr[i].authorName + " is from country: " + authArr[i].authCountry);

                }
            case 2:

                System.out.println("Enter the number of books");
                numberOfBooks = sc.nextInt();
                sc.nextLine();
                 bookDArr = new BookDetailsNew[numberOfBooks];
                long bookId = 1000;
                String bookTitle, description, author;
                float bookPrice;
                for (int i = 0; i < numberOfBooks; i++)
                {
                    System.out.println("Enter the Name of book no " + (i + 1) + " :");
                    bookTitle = sc.nextLine();
                    if (bookTitle.equals(""))
                    {
                        new BookDetailsNew();

                        //break;
                        i--;
                    }
                    else
                    {
                        System.out.println("Enter the Author Name of book " + bookTitle + " :");
                        author = sc.nextLine();
                        System.out.println("Enter the description of book " + bookTitle + " :");
                        description = sc.nextLine();
                        System.out.println("Enter Price of the book " + bookTitle + " :");
                        bookPrice = sc.nextFloat();
                        sc.nextLine();


                        if (description.equals("") && bookPrice == 0.0f)
                        {
                            bookDArr[i] = new BookDetailsNew(bookId, bookTitle, author);
                        }
                        else if (description.equals("") && author.equals(""))
                        {
                            bookDArr[i] = new BookDetailsNew(bookId, bookTitle, bookPrice);
                        }
                        else if (author.equals(""))
                        {
                            bookDArr[i] = new BookDetailsNew(bookId, bookTitle, description, bookPrice);
                        }
                        else if (description.equals(""))
                        {
                            bookDArr[i] = new BookDetailsNew(bookId, bookTitle, bookPrice, author);
                        }
                        else if (bookPrice == 0.0f) //question why it is not allowing to enter null
                        {
                            bookDArr[i] = new BookDetailsNew(bookId, bookTitle, description, author);
                        }
                        else
                        {
                            bookDArr[i] = new BookDetailsNew(bookId, bookTitle, description, author, bookPrice);
                        }
                        bookId++;
                    }
                }

                for (int i = 0; i < numberOfBooks; i++)
                {
                    if (bookDArr[i].bookTitle.equals("")) System.out.println("No books available");
                    else {
                        System.out.println("Books details are as follows:");
                        System.out.println("Book Id :" + bookDArr[i].bookId);
                        System.out.println("Book Name :" + bookDArr[i].bookTitle);
                        System.out.println("Book Description :" + bookDArr[i].description);
                        System.out.println("Book Author :" + bookDArr[i].author);
                        System.out.println("Book Price :" + bookDArr[i].bookPrice);
                    }

                }
            case 3:
            case 4:

                System.out.println("Enter the number of books to search:");
                numOfBooksToSearch=scInt.nextInt();
                do{
                   if (numOfBooksToSearch == 0)
                       break;
                   else {
                       System.out.println("Enter the name of the book to search:");
                       String bNameSearch = sc.nextLine();
                       if (bNameSearch.equals("")) {
                           System.out.println("Enter the name of the book to search:");
                           numOfBooksToSearch--;
                           //break;

                       } else {
                           for (BookDetailsNew bd : bookDArr)
                           {
                               if (bNameSearch.equals(bd.bookTitle))
                               {
                                   System.out.println("Book Found and the details are");
                                   System.out.println("Book ID:" + bd.bookId);
                                   System.out.println("Book Name:" + bd.bookTitle);
                                   System.out.println("Author Name:" + bd.author);
                                   System.out.println("Description:" + bd.description);
                                   System.out.println("Price:" + bd.bookPrice);
                                   searchFlag=1;
                                   break;

                               }
                               else  searchFlag=0;


                           }
                           if(searchFlag==0) System.out.println("Book not found");

                       }

                   }
                   numOfBooksToSearch--;
               } while (numOfBooksToSearch!=0);


            default:
                System.out.println("Program Complete");
                System.out.println("Please press 1 to go back to main menu else press any key");

                if(scInt.nextInt()==1)
                    repeatFlag=true;
                else repeatFlag=false;
    }
}
}while(repeatFlag==true);
    }
}
