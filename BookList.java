package ReadingList;

public class BookList {
    public book[] list;
    public int nextFreeSpot;

    public BookList(int size) {
        list = new book[size];
        nextFreeSpot = 0;
    }

    public void addBook(String title, String author, String summaryFilePath, boolean read) {
        list[nextFreeSpot] = new book(title, author, summaryFilePath, read); 
        nextFreeSpot++;
    }

    public void printList() {
        for (int i = 0; i < nextFreeSpot; i++) {
            System.out.println(list[i]);
        }
    }

    public book getBook(String title) {
        for (int i = 0; i < nextFreeSpot; i++) {
            if (list[i].getTitle().equals(title)) {
                return list[i];
            }
        }
        return null;
    }
}



