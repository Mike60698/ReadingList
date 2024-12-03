package ReadingList.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookList foundationalTexts = new BookList(10); 

        foundationalTexts.addBook("Wage-Labour and Capital", "Karl Marx", "Marx/WageLabour.txt", true);
        foundationalTexts.addBook("Value, Price and Profit", "Karl Marx", "Marx/ValuePrice.txt", false);
        foundationalTexts.addBook("Socialism: Utopian and Scientific", "Friedrich Engels", null, false);
        foundationalTexts.addBook("The State and Revolution", "Vladimir Lenin", null, false);
        foundationalTexts.addBook("Imperialism, the Highest Stage of Capitalism", "Vladimir Lenin", null, false);


        foundationalTexts.printList(); 

        System.out.print("Enter book title: ");
        String input = scanner.nextLine();

        Book book = foundationalTexts.getBook(input);  
        if (book != null) {
            System.out.println("Summary of " + book.getTitle() + ":\n" + book.getSummary());
        } else {
            System.out.println("Book not found.");
        }

        scanner.close();
    }
}
