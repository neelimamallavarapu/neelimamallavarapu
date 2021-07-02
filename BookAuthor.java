package com.company.assignments;

public class BookAuthor {

String authorName,authPlace,authCountry;
public BookAuthor()
{

System.out.println("Author Name can not be null");
}
public BookAuthor( String authorName)
{

    this.authorName=authorName;
    this.authPlace="Unknown";
    this.authCountry="Unknown";
}
public BookAuthor( String authorName, String authPlace, String authCountry)
{
    this.authorName=authorName;
    this.authPlace=authPlace;
    this.authCountry=authCountry;
}
public BookAuthor(String authorName, String authCountry)
{
    this.authorName=authorName;
    this.authPlace="Unknown";
    this.authCountry=authCountry;
}


}
