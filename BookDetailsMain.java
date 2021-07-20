package com.company.assignments;
import java.util.Scanner;
public class BookDetailsMain
{

    static BookDetailsNew[] deleteBook(BookDetailsNew bd[],int i, int numOfBooks)
    {



            for(int j=i;j<numOfBooks;j++)
            {
                //System.out.println("j is "+j +" array length is "+bd.length);
                if(j==numOfBooks-1)
                {
                    bd[j].bookTitle="";
                    bd[j].author="";
                    bd[j].description="";
                    bd[j].bookPrice=0;

                }
                else {
                    bd[j].bookTitle = bd[j + 1].bookTitle;
                    bd[j].author = bd[j + 1].author;
                    bd[j].setDescription(bd[j + 1].getDescription());//bd[j].description=bd[j+1].description;
                    bd[j].bookTitle = bd[j + 1].bookTitle;
                    bd[j].setBookPrice(bd[j + 1].getBookPrice());
                }



            }




        return bd;
    }
    static BookDetailsNew[] updateBookName(BookDetailsNew bd[],int i)
    {
        //System.out.println("Updating a book name");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to which the book to be changed:");
        //sc.nextLine();
        String newBookName = sc.nextLine();
        //bd[i].bookTitle=newBookName;
        bd[i].setBookTitle(newBookName);
        return bd;
    }
    static BookDetailsNew[] updateBookPrice(BookDetailsNew bd[],int i)
    {
        //System.out.println("Updating a book name");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Price of book"+bd[i].bookTitle +" to be changed to:");
        //sc.nextLine();
        Float newBookPrice = sc.nextFloat();
        //bd[i].bookTitle=newBookName;
        bd[i].setBookPrice(newBookPrice);
        return bd;
    }
    static BookDetailsNew[] updateBookDesc(BookDetailsNew bd[],int i)
    {
        //System.out.println("Updating a book name");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the description of book"+bd[i].bookTitle +" to be changed:");
        //sc.nextLine();
        String newDesc = sc.nextLine();
        //bd[i].bookTitle=newBookName;
        bd[i].setDescription(newDesc);
        return bd;
    }
    static BookDetailsNew[] updateAuthorName(BookDetailsNew bd[],int i)
    {
        //System.out.println("Updating a book name");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the author name of book"+bd[i].bookTitle +"to which the author to be changed:");
        //sc.nextLine();
        String newAuthName = sc.nextLine();
        //bd[i].bookTitle=newBookName;
        bd[i].setAuthor(newAuthName);
        return bd;
    }
    static void authorList(BookAuthor bAuth[])
    {
        for(BookAuthor ba:bAuth) {
            System.out.println("Author Name: "+ba.authorName);
           // System.out.println("        Place: "+ba.authPlace);
            //System.out.println("        Country:"+ba.authCountry);
        }
    }
    static void bookList(BookDetailsNew bookArr[],int numOfBooks)
    {
       /* for(BookDetailsNew books: bookArr )
        {
            System.out.println("Book Name:"+books.bookTitle);

        }*/
        for(int i=0;i<numOfBooks;i++)
        {
            System.out.println(bookArr[i].bookTitle)  ;
        }
    }
    static void bookDList(BookDetailsNew bookArr[])
    {
        for(BookDetailsNew books: bookArr )
        {
            System.out.println("Book Name:"+books.bookTitle);
            System.out.println("Details:");
            System.out.println("Book ID:"+books.bookId);
            System.out.println("Author Name:"+books.author);
            System.out.println("Description:"+books.description);
            System.out.println("Price:"+books.bookPrice);

        }
    }
    static void bookUpdate(BookDetailsNew bdn[],int type)
    {
        if(type==1)
        {
            System.out.println("");
        }

    }
    public static int searchBookOrAuthor(BookDetailsNew bookDArrin[], BookAuthor[] autherDetailsArrIn, String bName, int displayDetails, int bOrA ) {
        int searchFlag = 0;
        if (bOrA == 2) {
            for (BookDetailsNew bd : bookDArrin) {
                if (bName.equals(bd.bookTitle)) {
                    searchFlag = 1;
                    if (displayDetails == 1) {
                        System.out.println("Book Found");
                        System.out.println("Book ID:" + bd.bookId);
                        System.out.println("Book Name:" + bd.bookTitle);
                        System.out.println("Author Name:" + bd.author);
                        System.out.println("Description:" + bd.description);
                        System.out.println("Price:" + bd.bookPrice);
                    }
                    break;
                }
            }

        }
        else if (bOrA==1)
        {
            for (BookAuthor ba :autherDetailsArrIn ) {
                if (bName.equals(ba.authorName)) {
                    searchFlag = 1;
                    if (displayDetails==1)
                    {
                        System.out.println("Author Found");
                        System.out.println("Author Name:" + ba.authorName);
                        System.out.println("Place:" + ba.authPlace);
                        System.out.println("Country:" + ba.authCountry);

                    }
                    break;

                }

            }

        }
        return searchFlag;
    }

    public static void bubbleSort(BookDetailsNew bd[], int fromIndex,  int numOfBooks) {
        BookDetailsNew d;
        for (int i = numOfBooks - 1; i > fromIndex; i--) {
            boolean isSorted = true;
            for (int j = fromIndex; j < i; j++) {
                //If elements in wrong order then swap them
                if (bd[j].bookPrice > bd[j + 1].bookPrice) {
                    isSorted = false;
                    d = bd[j + 1];
                    bd[j + 1] = bd[j];
                    bd[j] = d;
                }
            }
            //If no swapping then array is already sorted
            if (isSorted)
            {
                bookList(bd,numOfBooks);
                break;
            }

        }
    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        boolean repeatFlag;
        BookAuthor authArr[]=null;
        BookDetailsNew bookDArr[]=null;
        int numberOfBooks=0;
        int numOfAuth;
        int numOfBooksToSearch;
        int searchFlag=0;
        float bookPrice=0.0f;
        long bookId = 1000;
        String bookTitle, description, author;
        String authName, authLocation, authCountry;
        Scanner scInt=new Scanner(System.in);
        int index=0;

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
    System.out.println("Press 8 to update a book details");
    System.out.println("Press 9 to delete a book");
    System.out.println("Press 10 to list the books by book price");
    System.out.println("Press 0 to Exit");
    menuOption = sc.nextInt();

            switch (menuOption)
        {
            case 1:

                System.out.println("Please enter the number of Authors to add");
                numOfAuth = sc.nextInt();
                sc.nextLine();
                authArr=new BookAuthor[numOfAuth];

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
                           // authArr[i] = new BookAuthor(authName, authLocation, authCountry);
                            BookAuthor ba = new BookAuthor();
                            ba.setAuthorName(authName);
                            if(authLocation == null)
                                 ba.setAuthPlace("unknown");
                            else
                                ba.setAuthPlace(authLocation);

                            ba.setAuthCountry(authCountry);

                            authArr[i] = ba;
                            //String cntry = ba.getAuthCountry();

                        }
                    }


                }

                break;
            case 2:

                System.out.println("Enter the number of books");
                numberOfBooks = sc.nextInt();
                sc.nextLine();
                 bookDArr = new BookDetailsNew[numberOfBooks];


                for (int i = 0; i < numberOfBooks; i++)
                {
                    System.out.println("Enter the Name of book no " + (i + 1) + " :");
                    bookTitle = sc.nextLine();
                    if (bookTitle.equals(""))
                    {
                        new BookDetailsNew();
                        i--;
                    }
                    else
                    {
                        System.out.println("Choose the Author Name of book "+ bookTitle +" from the authors given below: " );
                        authorList(authArr);
                        author = sc.nextLine();
                        System.out.println("Author chosen is: "+author);
                        if (author.equals("")) {
                            System.out.println("Search name was null,Please enter the name of the author:");
                            author = sc.nextLine();

                        }
                        else
                        {
                            //BookDetailsNew bookArr =new BookDetailsNew();
                            searchFlag= searchBookOrAuthor(bookDArr,authArr,author,0, 1);
                           // System.out.println("searchFlag value is: "+searchFlag);
                            if(searchFlag==1)
                            {
                               // System.out.println("I am seen if searchFlag==1 matches");

                            }
                            if(searchFlag==0) {

                                System.out.println("Author Not Found");
                                author="";
                            }

                        }


                       // int authAvail=0;


                       //if (authAvail==0) System.out.println("No such author");
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


                break;
            case 3:

                           sc.nextLine();
                           System.out.println("Enter the name of the book to search:");
                           String bNameSearch = sc.nextLine();
                           System.out.println("book entered: " + bNameSearch);

                           if (bNameSearch.equals("")) {
                               System.out.println("Search name can not be null,Enter the name of the book to search:");
                               bNameSearch = sc.nextLine();

                           }
                           else
                            {
                                 searchFlag= searchBookOrAuthor(bookDArr,authArr,bNameSearch,0,2);
                                 if(searchFlag==1) System.out.println("Book Found");
                                 else System.out.println("Book Not Found");

                            }


                break;

            case 4:
                sc.nextLine();
                System.out.println("Enter the name of the book to search for details:");
                 bNameSearch = sc.nextLine();
                System.out.println("Book entered: " + bNameSearch);

                if (bNameSearch.equals("")) {
                    System.out.println("Search name can not be null,Enter the name of the author to search:");
                    bNameSearch = sc.nextLine();

                    }
                else
                {

                    searchFlag= searchBookOrAuthor(bookDArr,authArr,bNameSearch,1,2);
                    if(searchFlag==0)

                    System.out.println("Book Not Found");
                }

                break;

            case 5:
                sc.nextLine();
                System.out.println("Enter the name of the author to search:");
                bNameSearch = sc.nextLine();
                System.out.println("Author name entered: " + bNameSearch);

                if (bNameSearch.equals("")) {
                    System.out.println("Search name can not be null,Enter the name of the author to search:");
                    bNameSearch = sc.nextLine();

                }
                else
                {
                    searchFlag= searchBookOrAuthor(bookDArr,authArr,bNameSearch,1, 1);
                    if(searchFlag==0)

                        System.out.println("Author Not Found");
                }

                break;


            case 6:
               System.out.println("All Books");
                bookList(bookDArr,numberOfBooks);
                break;

            case 7:
                System.out.println("All Authors:");
                authorList(authArr);

            for(BookAuthor ba:authArr) {
                System.out.println("Author Name: "+ba.authorName);
                System.out.println("        Place: "+ba.authPlace);
                System.out.println("        Country:"+ba.authCountry);
            }
            break;
            case 8: System.out.println("Choose the name of book to update from below");
            bookList(bookDArr,numberOfBooks);

                sc.nextLine();
                String bookNameSearch = sc.nextLine();
                System.out.println("book entered: " + bookNameSearch);

                if (bookNameSearch.equals("")) {
                    System.out.println("Search name can not be null,Enter the name of the book to search:");
                    bookNameSearch = sc.nextLine();

                }
                else
                {

                    for (int i=0; i<bookDArr.length;i++)
                    {
                        if (bookNameSearch.equals(bookDArr[i].bookTitle))
                        {
                            index = i;
                            //System.out.println("Index inside for is " + index);
                            break;
                        }
                    }

                            int option;
                            System.out.println("Menu:");
                            System.out.println("Press 1 to update a book name");
                            System.out.println("Press 2 to update an author of a book");
                            System.out.println("Press 3 to update description of a book");
                            System.out.println("Press 4 to update price of a book");
                            System.out.println("Press any other number to go to main menu");
                            option=sc.nextInt();



                                        switch(option)
                                         {

                                             case 1:
                                                 //System.out.println("Index inside case 1 is "+index );

                                                bookDArr= updateBookName(bookDArr,index);
                                                 bookList(bookDArr,numberOfBooks);

                                                 break;

                                             case 2:

                                                System.out.println("Updating an author name of a book");
                                                 //System.out.println("Enter the author of the book "+bookDArr[index].bookTitle+ "to be changed:");
                                                 bookDArr=updateAuthorName(bookDArr,index);
                                                 bookDList(bookDArr);
                                                break;

                                            case 3:

                                                 System.out.println("Updating description of a book");
                                                bookDArr=updateBookDesc(bookDArr,index);
                                                bookDList(bookDArr);
                                                 break;

                                            case 4:

                                                System.out.println("Updating price of a book ");
                                                bookDArr=updateBookPrice(bookDArr,index);
                                                bookDList(bookDArr);
                                                break;


                                         }


                     }
                break;
            case 9:System.out.println("Chose the book name from below to delete book details");
                bookList(bookDArr,numberOfBooks);

                sc.nextLine();
                String bookSearch = sc.nextLine();
                System.out.println("book entered: " + bookSearch);

                if (bookSearch.equals("")) {
                    System.out.println("Search name can not be null,Enter the name of the book to search:");
                    bookNameSearch = sc.nextLine();

                }
                else
                {

                    for (int i = 0; i < bookDArr.length; i++)
                    {
                        if (bookSearch.equals(bookDArr[i].bookTitle))
                        {
                            index = i;
                            //System.out.println("Index inside for is " + index);
                            break;
                        }
                    }

                    bookDArr=deleteBook(bookDArr,index, numberOfBooks);
                    numberOfBooks=numberOfBooks-1;
                    bookList(bookDArr,numberOfBooks);

                    break;

                }
            case 10: {
                System.out.println("Book List order by price:");
                bubbleSort(bookDArr, 0, numberOfBooks);
                bookList(bookDArr,numberOfBooks);
                break;

            }

                case 0: System.out.println("Exiting");
            System.exit(0);

            default:
                System.out.println("Option Invalid");




    }
//}
    //System.out.println("Program Complete");
    System.out.println("Please press 1 to go back to main menu else press any other number to exit");
    repeatFlag=false;
    if(scInt.nextInt()==1)
        repeatFlag=true;
    //else repeatFlag=false;
}while(repeatFlag==true);
    }
}
