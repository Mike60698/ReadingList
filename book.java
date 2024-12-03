package ReadingList;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class book {
    private String title;
    private String author;
    private String summaryFilePath;
    private boolean read;

    public book(String title, String author, String summaryFilePath, boolean read){
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
        if (summaryFilePath == null) {
            return "No summary available.";
        }
        try {
            return new String(Files.readAllBytes(Paths.get(summaryFilePath)));
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
