package com.yearUp.learningInterfaceHW;

public class Book implements IProduct {

private double price;
private String name;
private String color;
private String author;
private int pages;
private String isbn;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {
this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
this.name = name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
this.color = color;
    }
}
