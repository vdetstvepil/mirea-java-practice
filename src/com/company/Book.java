package com.company;

public class Book {
    private final String author;
    private final String name;
    private int page_count;

    // Конструктор с параметрами.
    public Book(String author, String name, int page_count) {
        this.author = author;
        this.name = name;
        this.page_count = page_count;
    }

    // Конструктор без параметров.
    public Book() {
        this.author = "Example Author";
        this.name = "Example Name";
        this.page_count = 100;
    }

    // Свойство - изменение модели.
    public void setPage_count(int temp) {
        this.page_count = temp;
    }

    // Свойство - получение кол-ва страниц книги.
    public int getPage_count() {
        return this.page_count;
    }

    // Свойство - получение автора.
    public String getAuthor() {
        return this.author;
    }

    // Свойство - получение названия книги.
    public String getName() {
        return this.name;
    }

    // Метод определяющий, много ли страниц в книге.
    public Boolean hasManyPages() {
        return page_count >= 300;
    }

    // Метод toString().
    public String toString() {
        return this.name + ", author = " + this.page_count + ", page count = " + this.page_count;
    }
}
