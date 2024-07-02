package src.com.jamezmayke.readworld.modules.book;

import src.com.jamezmayke.readworld.modules.book.utils.Genre;
import src.com.jamezmayke.readworld.modules.product.Product;

public class Book extends Product {
    private String name;
    private Genre genre;

    public Book(String name, Genre genre) {
        setName(name);
        setGenre(genre);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    private void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("{name: %s, genre: %s}", getName(), getGenre());
    }
}
