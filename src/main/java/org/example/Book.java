package org.example;

public class Book {
   private  String author;
   private String title;
    private int rating;

    public Book(String author, String title, int rating) {
        this.author = author;
        this.title = title;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
