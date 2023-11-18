package relationship.aggregation.libraryManagement2;

import java.util.ArrayList;

class Author{
    private String name;
    Author(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
class Book{
    private String title;
    private Author author;
    Book(String title, Author author){
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return author;
    }
}
class Library{
    private String name;
    private ArrayList<Book> books;
    Library(String name){
        this.name = name;
        books = new ArrayList<>();
    }
    public String name(){
        return this.name;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void deleteBook(String title, String author){

    }
    public ArrayList<Book> getAllBooks(){
        return books;
    }


}
public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library("Campus Library");
        Author author1 = new Author("Sachin Kumar");
        Book book1 = new Book("History", author1);

        library.addBook(book1);
    }
}
