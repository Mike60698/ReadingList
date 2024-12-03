package ReadingList.src;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;

public class Book {
    private String title;
    private String author;
    private String summaryFilePath;
    private boolean read;

    public Book(String title, String author, String summaryFilePath, boolean read){
        this.title = title;
        this.author = author;
        this.summaryFilePath = summaryFilePath;
        this.read = read;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getSummary() {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        if (summaryFilePath == null) {
            return "No summary available.";
        }
        try {
            // Correct the path to point to the DescAndSummary folder inside ReadingList
            Path path = Paths.get("ReadingList/DescAndSummary/Marx", summaryFilePath).toAbsolutePath();
            System.out.println("Looking for file at: " + path);  // Debugging line
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            return "Error reading summary file: " + e.getMessage();
        }
    }

    public boolean getRead() {
        return read;
    }

    @Override
    public String toString() {
        String complete = read ? "Finished" : "Unread";
        return (title + " - " + author + " (" + complete + ")");
    }
}
