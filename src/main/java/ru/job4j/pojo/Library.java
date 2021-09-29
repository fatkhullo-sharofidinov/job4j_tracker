package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book apple = new Book("Apple", 200);
        Book banana = new Book("Banana", 170);
        Book fruits = new Book("Fruits", 300);
        Book cleancode = new Book("Clean code", 0);
        Book []books = new Book[4];
        books[0] = apple;
        books[1] = banana;
        books[2] = fruits;
        books[3] = cleancode;
        for (int index = 0; index < books.length; index++ ) {
            Book bk = books[index];
            System.out.println(bk.getBooksname() + " - " + bk.getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("After replacement: ");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getBooksname() + " - " + bk.getPages());
        }
        System.out.println("Clean code elements: ");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getBooksname().equals("Clean code")) {
                System.out.println(bk.getBooksname() + " - " + bk.getPages());
            }
        }
    }
}
