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

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
