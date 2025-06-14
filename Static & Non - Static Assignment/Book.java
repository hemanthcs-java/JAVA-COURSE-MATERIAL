public class Book {
    String title;
    String author;
    static int bookCount = 0;

    void printBookInfo() {
        int serialNo = ++bookCount;
        System.out.println("Serial: " + serialNo + ", Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "Author A";
        b1.printBookInfo();

        Book b2 = new Book();
        b2.title = "OOP Concepts";
        b2.author = "Author B";
        b2.printBookInfo();
    }
}
