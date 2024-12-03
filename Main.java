package ReadingList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookList list = new BookList(10); // Renamed List to BookList

        list.addBook("Wage-Labour and Capital", "Karl Marx", "WageLabourDesc.txt", true);
        list.addBook("Value, Price and Profit", "Karl Marx", null, false);

        list.printList();

        String input = scanner.nextLine();

        for (int i = 0; i < list.nextFreeSpot; i++) {
            book book = list.getBook(input);
            if (book.getTitle().equals(input)) {
                System.out.println("Summary of " + book.getTitle() + ":\n" + book.getSummary());
                break;
            }
        }

        scanner.close();
    }
}
