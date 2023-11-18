package relationship.aggregation.LibraryManagement3;

import java.util.ArrayList;
import java.util.HashSet;

class Book{
    private int ISBN;
    private String title;
    private String author;
    private boolean isAvailable;
    Book(int ISBN, String title, String author){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = false;
    }
    public int getISBN(){
        return this.ISBN;
    }
    public void displayBookDetails(String title){
        System.out.println("ISBN: " + ISBN + "\n" + "title: " + title + "\n" + "author: " + author + "\n"
        + "available: " + isAvailable);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
class Student{
    private String name;
    private int rollNo;
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName(){
        return this.name;
    }
    public int getRollNo(){
        return this.rollNo;
    }

    @Override
    public String toString() {
        return name + " : " + rollNo;
    }
}

public class Library {
    private String name;
    private ArrayList<Book> books;
    private HashSet<Student> students;
    Library(String name){
        this.name = name;
        books = new ArrayList<>();
        students = new HashSet<>();
    }
    public void addBook(int ISBN, String title, String author){
        books.add(new Book(ISBN, title, author));
    }
    public void addStudent(String name, int rollNo){
        students.add(new Student(name, rollNo));
    }
    public void displayBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }
    public void displayStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }
    public void checkOut(int rollNo, String title){
        Student student = findStudentByID(rollNo);
        Book book = findBookByTitle(title);
        if(student == null){
            System.out.println("student not found.");
            return;
        }
        else if(book == null){
            System.out.println("Book not available.");
            return;
        }
        else {
            book.setAvailable(false);
            System.out.println(student.getName() + "has borrowed the book: " + book.getTitle());
        }
    }
    private Student findStudentByID(int rollNo){
       for(Student student : students){
           if(student.getRollNo() == rollNo)
               return student;
       }
       return null;
    }
    private Book findBookByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equals(title))
                return book;
        }
        return null;
    }
    public void listAvailableBooks(){
        boolean status = false;
        for(Book book : books){
            if(book.isAvailable()) {
                status = true;
                System.out.println(book);
            }
        }
        if(!status)
            System.out.println("book is not available");
    }
    public void removeStudent(int rollNo){
        Student student = findStudentByID(rollNo);
        if(student == null){
            System.out.println("student does not exist.");
        }
        else {
            students.remove(student);
            System.out.println("student removed successfully: " + student.getName());
        }
    }
    public void checkedOutBooks(){

    }
    public void searchBooksByAuthor(){

    }
    public void returnAllBooksByStudent(){


    }
    public void removeBook(String title, String author){
        for(Book book : books){
//            if(book.getTitle() == title && book.getAuthor() == author)
//                books.remove()
        }

    }


    public static void main(String[] args) {
        Library library = new Library("ASPAM Library");

        // adding students in the library
        library.addStudent("Sachin", 10001);
        library.addStudent("Lalit", 10002);
        library.addStudent("Komal", 10003);
        library.addStudent("Pallavi", 10004);

        // adding books in the library
        library.addBook(501, "Maths IV", "Raj Sinha");
        library.addBook(502, "Technical Communication", "RS. Kumar");
        library.addBook(503, "History", "Sanjay Gowda");
        library.addBook(504, "Business & Account", "Nirmala Raman");
        library.addBook(505, "Environmental Science", "Raj Kishore");

    }
}




//class Library {
//    private List<Book> books = new ArrayList<>();
//    private List<Student> students = new ArrayList();
//
//    public void addBook(String title, String author) {
//        books.add(new Book(title, author));
//    }
//
//    public void addStudent(String studentId, String name) {
//        students.add(new Student(studentId, name));
//    }
//
//    public void displayBooks() {
//        System.out.println("Library Catalog:");
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }
//
//    public void displayStudents() {
//        System.out.println("Registered Students:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//
//    public boolean checkoutBook(String studentId, String title) {
//        Student student = findStudent(studentId);
//        if (student == null) {
//            System.out.println("Student not found.");
//            return false;
//        }
//
//        Book book = findBook(title);
//        if (book == null) {
//            System.out.println("Book not found.");
//            return false;
//        }
//
//        if (book.isAvailable()) {
//            book.setAvailable(false);
//            System.out.println(student.getName() + " has checked out " + book.getTitle());
//            return true;
//        } else {
//            System.out.println("The book is already checked out.");
//            return false;
//        }
//    }
//
//    public boolean returnBook(String studentId, String title) {
//        Student student = findStudent(studentId);
//        if (student == null) {
//            System.out.println("Student not found.");
//            return false;
//        }
//
//        Book book = findBook(title);
//        if (book == null) {
//            System.out.println("Book not found.");
//            return false;
//        }
//
//        if (!book.isAvailable()) {
//            book.setAvailable(true);
//            System.out.println(student.getName() + " has returned " + book.getTitle());
//            return true;
//        } else {
//            System.out.println("This book is not checked out.");
//            return false;
//        }
//    }
//
//    private Student findStudent(String studentId) {
//        for (Student student : students) {
//            if (student.getStudentId().equals(studentId)) {
//                return student;
//            }
//        }
//        return null;
//    }
//
//    private Book findBook(String title) {
//        for (Book book : books) {
//            if (book.getTitle().equalsIgnoreCase(title)) {
//                return book;
//            }
//        }
//        return null;
//    }
//}
//
//public class LibraryManagementSystem {
//    public static void main(String[] args) {
//        Library library = new Library();
//
//        library.addBook("Introduction to Java", "John Doe");
//        library.addBook("Programming in Python", "Alice Smith");
//        library.addStudent("S12345", "John Smith");
//        library.addStudent("S67890", "Alice Johnson");
//
//        library.displayBooks();
//        library.displayStudents();
//
//        library.checkoutBook("S12345", "Introduction to Java");
//        library.returnBook("S12345", "Introduction to Java");
//        library.checkoutBook("S12345", "Introduction to Java");
//
//        library.displayBooks();
//    }
//}
