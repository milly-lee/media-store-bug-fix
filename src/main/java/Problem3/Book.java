package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    public Book(Book anotherBook) {
        this.id = anotherBook.id;
        this.title = anotherBook.title;
        this.author = anotherBook.author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book theOtherBook = (Book) obj;



        return id.equals(theOtherBook.id) ;


    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
