package com.company.assignments;

public class BookDetailsNew {
    long bookId;
    String bookTitle,description,author;
    float bookPrice;

    public BookDetailsNew()
    {
        System.out.println("Book Name can not be null. Please enter valid book Name");
        this.bookTitle="";
        this.description="";
        this.author="";
        this.bookPrice=0.0f;
    }
    public BookDetailsNew(long id,String title, String description, String author,float price)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description=description;
        this.author=author;
        this.bookPrice=price;
    }
    public BookDetailsNew(long id,String title, float price)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description="Not Available";
        this.author="Unknown";
        this.bookPrice=price;
    }
    public BookDetailsNew(long id,String title, float price, String author)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description="Not Available";
        this.author=author;
        this.bookPrice=price;
    }
    public BookDetailsNew(long id,String title, String description, String author)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description=description;
        this.author=author;
        //this.bookPrice=price;
        System.out.println("This book is not for sale");
    }
    public BookDetailsNew(long id,String title,  String author)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description="No description available";
        this.author=author;
        //this.bookPrice=price;
        System.out.println("This book is not for sale");
    }
    public BookDetailsNew(long id,String title, String description, float price)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description=description;
        this.author="Unknown";
        this.bookPrice=price;
    }
    public BookDetailsNew(long id,String title)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description="Not Available";
        this.author="Unknown";
        System.out.println("This book is not for sale");
            }


}
