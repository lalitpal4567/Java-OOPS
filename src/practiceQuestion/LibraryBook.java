package practiceQuestion;

import java.util.ArrayList;
import java.util.List;

class Book{
    public String bookName;
    public String authorName;
    public int bookId;
    Book(){};

    public void setName(String bookName){
        this.bookName = bookName;
    }
    public String getName(){
        return this.bookName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public String getAuthorName(){
        return authorName;
    }
}

class Student{
    private String name;
    private int age;
    private List<Book> bookList = new ArrayList<>();

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void issueBook(String bookName, String authorName){
        Book obj = new Book();
        obj.setName(bookName);
        obj.setAuthorName(authorName);
        bookList.add(obj);
    }
    public void showAllIssuedBooks(){
        for(Book book : bookList){
            System.out.println(book.getName() );
        }
    }
}
public class LibraryBook {
    public static void main(String[] args) {
        Student obj = new Student("Lalit", 23);
        Student obj2 = new Student("Pulkit", 24);
        obj.issueBook("maths", "Azad");
        obj.issueBook("History", "Ayush");
        obj.issueBook("DAA","Ajay");
//        obj2.issueBook("English", "Deepesh");

        obj.showAllIssuedBooks();
    }
}
