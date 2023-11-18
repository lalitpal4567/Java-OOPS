package relationship.aggregation;

import java.util.ArrayList;

class Book{
    private String author;
    private String title;
    Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
class Library{
    private String name;
    private ArrayList<Book> books;
    Library(String name){
        this.name = name;
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void deleteBook(Book book){
        books.remove(book);
    }
    public ArrayList<Book> getAllBooks(){
        return books;
    }
    public String getName(){
        return this.name;
    }

}
public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library("Public Library");
        Book book1 = new Book("Lalit", "Maths");
        Book book2 = new Book("Sachin", "English");
        library.addBook(book1);
        library.addBook((book2));

        for(Book book : library.getAllBooks()){
//            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            System.out.println(book);
        }
    }
}
