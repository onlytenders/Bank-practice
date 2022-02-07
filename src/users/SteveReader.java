package users;

import users.roles.BookStatus;
import users.roles.CommonBook;
import users.roles.Reader;

import java.util.ArrayList;

public class SteveReader implements Reader {
    private String name = "Steve";

    public String getName() {
        return name;
    }

    @Override
    public void takeBook(String name, ArrayList<CommonBook> lib) {
        for (int i = 0; i < lib.size(); i++) {
            if(lib.get(i).getName() == name) {
                lib.get(i).setStatus(BookStatus.BORROWED);
                return;
            }
        }
        System.out.println("Book is not available");
    }

    @Override
    public void returnBook(String name, ArrayList<CommonBook> lib) {
        for (int i = 0; i < lib.size(); i++) {
            if(lib.get(i).getName() == name) {
                lib.get(i).setStatus(BookStatus.AVAILABLE);
                return;
            }
        }
        System.out.println("This book was not registered in the system");
    }
}
