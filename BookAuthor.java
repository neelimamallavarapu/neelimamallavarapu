package com.company.assignments;

public class BookAuthor {

    String authorName;
    String authPlace;
    String authCountry;

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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthPlace() {
        return authPlace;
    }

    public void setAuthPlace(String authPlace) {
        this.authPlace = authPlace;
    }

    public String getAuthCountry() {
        return authCountry;
    }

    public void setAuthCountry(String authCountry) {
        this.authCountry = authCountry;
    }
}
