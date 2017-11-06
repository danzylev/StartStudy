package com.company;

public class Book {
    private String author;
    private String title;
    private int pagesNum;

    public Book(String author, String title, int pagesNum){
        this.author = author;
        this.title = title;
        this.pagesNum = pagesNum;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;

        if (pagesNum == book.pagesNum && author.equals(book.author) && title.equals(book.title)) return true;
        else return false;

    }

    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = result + title.hashCode();
        result = result + pagesNum;
        return result;
    }


}
