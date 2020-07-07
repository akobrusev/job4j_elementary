package ru.job4j.pojo;

public class Library {

      public static void main(String[] args) {
            Book cleanCode = new Book("Clean code",250);
            Book it = new Book("It",300);
            Book moon = new Book("Moon", 150);
            Book java = new Book("Java", 1000);
            Book [] books = new Book[4];
            books[0] = cleanCode;
            books[1] = it;
            books[2] = moon;
            books[3] = java;
            for (int index = 0; index < books.length; index++) {
                Book bk = books[index];
                System.out.println(bk.getTitle() + " - " + bk.getQuantityOfPages());
            }
            System.out.println("Change book1 to book3.");
            Book temp = books[0];
            books[0] = books[2];
            books[2] = temp;
            for (int index = 0; index < books.length; index++) {
                  Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getQuantityOfPages());
            }

            System.out.println("Shown only book title Clean code ");
            for (int index = 0; index < books.length; index++) {
                  Book bk = books[index];
                  if (books[index] == cleanCode) {
                        System.out.println("Clean code");
                  }
            }
      }
}
