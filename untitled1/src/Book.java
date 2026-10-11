import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    public String getTitle()    { return title; }
    public String getAuthor()   { return author; }
    public int getYear()        { return year; }
    public boolean isBorrowed() { return borrowed; }
    public void setBorrowed(boolean borrowed) { this.borrowed = borrowed; }

    @Override
    public int compareTo(Book other) {
        // 待实现：按出版年份从新到旧；年份相同按书名字母顺序
        return 0;
    }

    @Override
    public String toString() {
        return title + "(" + year + ")";
    }
}
List<Book> library = new ArrayList<Book>();
library.add(new Book("Java Core",       "Horstmann", 2019));
        library.add(new Book("Clean Code",      "Martin",    2008));
        library.add(new Book("Effective Java",  "Bloch",     2018));
        library.add(new Book("Java Puzzlers",   "Bloch",     2005));
        library.add(new Book("Refactoring",     "Fowler",    2018));
        library.add(new Book("Head First Java", "Sierra",    2005));