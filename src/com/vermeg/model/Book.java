package com.vermeg.model;


public class Book {

    private int book_id;
    private String title;
    private String author;
    private double price;
    private String releaseDate;


    public Book() {
    }

    public Book(int book_id, String title, String author, double price, String releaseDate) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public Book(String title, String author, double price, String releaseDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
