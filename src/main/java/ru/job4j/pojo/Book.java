package ru.job4j.pojo;

public class Book {
    private String booksname;
    private int pages;

    public Book(String booksname, int pages) {
        this.booksname = booksname;
        this.pages = pages;
    }

    public String getBooksname() {
        return booksname;
    }

    public void setBooksname(String booksname) {
        this.booksname = booksname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
