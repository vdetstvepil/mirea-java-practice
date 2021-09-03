package com.company;

import java.util.Locale;
import java.util.Scanner;

public class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book("Pushkin", "Detstvo", 150);
        Book b2 = new Book("Pushkin", "Voina i mir", 1000);
        Book b3 = new Book("Dik", "Pomutnenie", 300);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.setPage_count(1000);
        System.out.println("new page count of " + b1.getName() + " is " + b1.getPage_count());
    }
}
