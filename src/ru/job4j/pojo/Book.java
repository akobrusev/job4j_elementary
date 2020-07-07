package ru.job4j.pojo;

public class Book {
    private String title;
    private int quantityOfPages;

    public Book(String title, int quantityOfPages) {
        this.title = title;
        this.quantityOfPages = quantityOfPages;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }
}
