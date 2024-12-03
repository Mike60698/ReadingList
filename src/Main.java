package ReadingList.src;

import java.util.Scanner;

import ReadingList.src.BookList;

import ReadingList.src.Book;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookList list = new BookList(10); 

        list.addBook("Wage-Labour and Capital", "Karl Marx", "WageLabourDesc.txt", true);
        list.addBook("Value, Price and Profit", "Karl Marx", null, false);

        list.printList(); 

        System.out.print("Enter book title: ");
        String input = scanner.nextLine();

        Book book = list.getBook(input);  
        if (book != null) {
            System.out.println("Summary of " + book.getTitle() + ":\n" + book.getSummary());
        } else {
            System.out.println("Book not found.");
        }

        scanner.close();
    }
}
