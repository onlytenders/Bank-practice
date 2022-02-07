package users.roles;

import java.util.ArrayList;

public interface Administrator {
    void overdueNotification(Reader reader);
    void giveBook(String name, ArrayList<CommonBook> lib);
}
