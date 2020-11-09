package exercise;

public class Quote {
    private final int id;
    private final String author;
    private final String quote;
    boolean favourite;

    public Quote(int id, String author, String quote, boolean f) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean getFavourite() {
        return favourite;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                ", favourite=" + favourite +
                '}';
    }
}
