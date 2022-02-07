package users.roles;

import java.awt.print.Book;
import java.util.ArrayList;

public interface Librarian {
    public void orderBook(String name, ArrayList<Book> lib);
}
