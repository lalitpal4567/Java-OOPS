package encapsulation;


class LibraryBook {
    private String title;
    private String author;
    private boolean checkedOut;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    // Method to check out the book
    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("The book is already checked out.");
        }
    }

    public void returnBook() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("The book is not checked out.");
        }
    }
}

public class LibraryExample {
    public static void main(String[] args) {
        LibraryBook myBook = new LibraryBook("Java Programming", "John Doe");

        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Checked Out: " + myBook.isCheckedOut());

        myBook.checkOut();
        myBook.returnBook();
    }
}
