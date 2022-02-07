package users.roles;

import java.util.ArrayList;

public interface Reader {
    void takeBook(String name, ArrayList<CommonBook> lib);
    void returnBook(String name, ArrayList<CommonBook> lib);
}
