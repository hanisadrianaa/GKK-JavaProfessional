package quiz.Quiz1_060224.Question1;

class Book {
    private String name;
    private String author;

    Book() {

    }
    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Head First Java", "Kathy Sierra");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
