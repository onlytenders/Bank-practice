package users;

import users.roles.Administrator;
import users.roles.BookStatus;
import users.roles.CommonBook;
import users.roles.Reader;

import java.util.ArrayList;

public class CatrineAdministrator implements Administrator {
    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Overdue notification");
    }

    @Override
    public void giveBook(String name, ArrayList<CommonBook> lib) {
        for (int i = 0; i < lib.size(); i++) {
            if(lib.get(i).getName() == name) {
                lib.get(i).setStatus(BookStatus.BORROWED);
                System.out.println("Catrine gave a book " + name + " to a reader");
                return;
            }
        }
        System.out.println("Book does not exist");
    }
}
