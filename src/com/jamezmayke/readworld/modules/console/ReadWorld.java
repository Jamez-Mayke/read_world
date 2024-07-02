package src.com.jamezmayke.readworld.modules.console;

import src.com.jamezmayke.readworld.modules.book.Book;
import src.com.jamezmayke.readworld.modules.book.utils.Genre;

public class ReadWorld {
    public static void main(String[] args) {

        var oSenhorDosAneis = new Book("O senhor dos anéis: A sociedade do anel", Genre.SUSPENSE);

        System.out.println(oSenhorDosAneis);
    }
}
