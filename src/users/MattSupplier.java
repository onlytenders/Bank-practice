package users;

import users.roles.CommonBook;
import users.roles.Supplier;

import java.util.ArrayList;

public class MattSupplier implements Supplier {
    @Override
    public void bringBook(String name, ArrayList<CommonBook> lib) {
        lib.add(new CommonBook(name));
    }
}