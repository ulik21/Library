package kg.megacom.Library.services;

import kg.megacom.Library.models.book.Author;
import kg.megacom.Library.models.book.Book;
import kg.megacom.Library.models.book.Genre;

public interface DbBookInterface {
    boolean saveBook(Book book, Author author, Genre genre);
    boolean checkBook();
}
